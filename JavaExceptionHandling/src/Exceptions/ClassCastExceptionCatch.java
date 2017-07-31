package Exceptions;

public class ClassCastExceptionCatch{
	public static void main (String[] args) {
		Object ob = new Object();		
		
		try {
			System.out.println((String)ob);
		} catch (ClassCastException cce) {
			cce.printStackTrace();
			System.out.println("\nob cannot be cast into a String because datatype int is not a subclass of "
					+ "String");
		}
	}
}
