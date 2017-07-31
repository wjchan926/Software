package Exceptions;

public class IllegalArgumentExceptionCatch {
	public static void main (String[] args) {
		
		try{
			Character.toChars(-1);
		} catch (IllegalArgumentException iae) {
			iae.printStackTrace();
			System.out.println("Cannot convert -1 to  UTF-16 representation.");
		}
				
	}	
}
