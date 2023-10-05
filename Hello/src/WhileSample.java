
public class WhileSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'a';
		
		while(c1 <= 'z') {
			System.out.print(c1);
			c1 = (char)(c1 + 1);
		}
		System.out.println();
		char c2 = 'z';
		do {
			System.out.print(c2);
			c2 = (char)(c2 - 1);
		}while(c2 >= 'a');
	}

}
