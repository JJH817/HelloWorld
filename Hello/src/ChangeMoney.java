import java.util.Scanner;
public class ChangeMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("input price(won): ");
		int price = scanner.nextInt();
		
		int[] Units = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};	//cash unit
		int[] Count = new int[Units.length];							//each unit count
		
		for(int i = 0; i < Units.length; i++) {
			Count[i] = price / Units[i];				//price를 unit으로 나눈 몫
			price %= Units[i];							//나머지는 다시 price에 저장하며 반복
		}
		
		for(int i = 0; i < Units.length; i++) {
			if(Count[i] > 0) {							//count가 0일 경우 표시할 필요가 없으므로
				System.out.println(Units[i] + " : " + Count[i]);
			}
		}
		scanner.close();
	}

}
