package Exceptions;

public class NullPointerExceptionCatch {
	public static void main (String[] args) {

		String s = null;
		
		try {
			System.out.println(s.length());
		} catch (NullPointerException npe) {
			npe.printStackTrace();
			System.out.println("\nThe .lenth() method is looking for a String object but "
					+ "is referencing a null object instead");
		}
	}
}
