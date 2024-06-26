package logical;

import java.util.Scanner;

public class reversearray {

	public static void main(String[] args) {

//		int a[]= {2,3,4,6,8,9,10,12};
//		
//		
//		for(int i=a.length-1;i>=0;i--) {
//			
//			System.out.print(a[i]+" ");
//		}

		int a[] = new int[5];
		Scanner r = new Scanner(System.in);
		System.out.println("enter and Array");

		for (int i = 0; i < a.length; i++) {

			a[i] = r.nextInt();
		}
		System.out.println("array elements");
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i]+", ");
		}

	}

}
