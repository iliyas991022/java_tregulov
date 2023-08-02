package limitations_of_generalizations;

public class Program {
	public static void main(String[] args) {
		Account<String> acc1 = new Account<String>("sddw", 2000	);
		Account<String> acc2 = new Account<String>("sdgrt", 3000);
		
		Transaction<Account<String>> tran1 = new Transaction<Account<String>>(acc1, acc2, 1000);
		tran1.execute();
		tran1 = new Transaction<Account<String>>(acc1,acc2, 2000);
		tran1.execute();}

}

class Transaction<T extends Account<String>> {
	private T from;
	private T to;
	private int sum;
	
	Transaction(T from, T to, int sum) {
		this.from = from;
		this.to = to;
		this.sum = sum;
	}
	public void execute() {
		if (from.getSum() > sum	) {
			from.setSum(from.getSum() - sum);
			to.setSum(to.getSum() + sum);
			System.out.printf("Account %s: %d \n Account %s: %d \n", from.getId(), from.getSum(), to.getId(), to.getSum());
		} else {
			System.out.println("Operation is invalid");
		}
	}
}

class Account<T>{
	private T id;
	private int sum;
	
	Account(T id, int sum){
		this.id = id;
		this.sum = sum;
	}
	
	public T getId() { return id;}
	public int getSum() { return sum;}
	public void setSum(int sum) {
		this.sum = sum;
	}
}

