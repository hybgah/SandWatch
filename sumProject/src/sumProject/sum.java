package sumProject;

public class sum {

	public static void main(String[] args) {
		int x = 45;//몇층짜리 모래시계를 만들지 정함
		
		for(int i = 0;i < x;i++) {
			//모래시계 위쪽 부분의 마지막 줄의 별의 개수가 1 또는 2가 되는 시점을 기준으로 모래시계를 나눔
			if(x-2*i>=1)// x-2*i>=1이 그 시점임
				{
				//공백 찍기 , 공백이 하나씩 많아짐
				for(int u = 0;u<=i;u++) {
				System.out.print(" ");
				}
				//점 찍기	,	점은 두개씩 줄어듬
				for(int j = 0;j < x-2*i;j++) {
				System.out.print("*");
				}
				System.out.println("");
			}
			else
			{
				
				//공백 찍기 , x가 홀수든 짝수든 상관없이 공백은 하나씩 커짐
				for(int u = 0;u < x-i;u++) {
				System.out.print(" ");
				}	//x의 값이 홀수인 경우와 짝수인 경우를 나눔
				if(x-2*i == 1)//홀수인 경우
				{
					for(int j = 1;j <= -x+2*i; j++) {
						System.out.print("*");
					}
				}else//짝수인 경우
				{
					for(int j = 1;j <= -x+2*(i+1); j++) {
						System.out.print("*");
					}
				}
				System.out.println("");

			}
		}

}
	}
