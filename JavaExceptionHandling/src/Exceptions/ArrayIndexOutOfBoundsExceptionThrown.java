package Exceptions;

public class ArrayIndexOutOfBoundsExceptionThrown {
	public static void main (String[] args) {
		
		int[] arr1 = {0};
		
		try {		
			System.out.println(arr1[1]);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			aioobe.printStackTrace();
			System.out.println("\nThe lenth of arr1 is 1 so the last index of arr1 is 0.");
		}
	}
}
