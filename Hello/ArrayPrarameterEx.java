package prac;

public class ArrayPrarameterEx {

	static void replaceSpace(char a[]) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == ' ')
				a[i] = ',';
		}
	}
	
	static void printCharArray(char a[]) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
	//for(char val : a) {
	//	System.out.println(val)
	//}
	//교수님이 작성한것
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}

}
