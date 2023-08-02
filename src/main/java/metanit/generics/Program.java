package metanit.generics;

public class Program {
	public static void main(String[] args) {
		Account<String> acc1 = new Account<String>("wet24", 12);
		Account<String> acc2 = new Account<String>("egsd", 23);
		System.out.println(acc1.getId());
		System.out.println(acc2.getId());
		String[] words = {"sdfs", "sdfasegr", "sdfryhynt"};
		Printer.<String>print(words);
	}
}

interface Accountable<T>{
	T getId();
	int getSum();
	void setSum(int sum);
}

class Account<T> implements Accountable<T>{
	private T id;
	private int sum;
	
	Account(T id, int sum) {
		this.id = id;
		this.sum  = sum;
	}
	public T getId() {
		return id;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
}

class Printer {
	public static <T> void print(T[] items) {
		for(T item : items) { 
			System.out.println(item);
		}
	}
}
