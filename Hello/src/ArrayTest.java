import java.util.Scanner;
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int i;
		double sum = 0.0, avg;
		//one-dimensional array declaration & instantiation
		double dnum[] = new double[5];
		//find out length of the array using length property
		System.out.println("length of dnum array: " + dnum.length);
		System.out.print("uninitailized dnum[] values: ");
		//using length property for loop condition
		
		for(i = 0; i < dnum.length; i++)
			System.out.print(dnum[i]+ " ");
		System.out.println();
		
		for(i = 0; i < dnum.length; i++) {
			System.out.print("dnum["+i+"] value: ");
			dnum[i] = stdin.nextDouble();
		}
		
		for(i = 0; i < dnum.length; i++)
			sum += dnum[i];
		
		System.out.println("sum of the array elements: " + sum);
		avg = sum / dnum.length;
		System.out.println("the average of the array elements: " + avg);
	}

}
