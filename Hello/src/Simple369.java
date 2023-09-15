import java.util.Scanner;
public class Simple369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter integer value 1~99 : ");
		
		int val = scanner.nextInt();
		int a = val%10;					//1의 자리수
		int b = (val - a)/10;			//10의 자리수
		int flag = ((a%3==0)?1:0)+((b%3==0)?1:0);	//박수 횟수 판별
		
		if (val>=100)
			System.out.print("It's not 1~99");		//범위를 벗어나는 경우
		else {
			switch(flag) {
			case 2:
				System.out.print("박수짝짝");
				break;
			case 1:
				System.out.print("박수짝");
				break;
			default:
				System.out.print("No 3, 6, or 9");
			}
		}
		scanner.close();
	}
}
