package exceptions;

public class Program {
	public static int getFactorial(int num) throws Exception{
		if (num < 1) throw new FactorialException("The number is less than 1", num);
		int result = 1;
		for(int i = 1 ; i <= num; i++) {
			result *=i;
		}
		return result;
	}
	
	public static int getFactorial1(int num) {
		int result = 1;
		try {
			if(num<1) throw new Exception("the number is less than 1");
			
			for(int i =1; i <= num; i++) {
				result *= i;
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			result = num;
		}
		return result;
	}
	public static void main(String[] args) {
		try {
			int result = getFactorial(5);
			System.out.println(result);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}

class FactorialException extends Exception{
	private int number;
	public int getNumbet() {return number;}
	public FactorialException(String message, int num) {
		super(message);
		number = num;
	}
}
