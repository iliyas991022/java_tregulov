package inheritance_and_generics;

public class Program {
	public static void main(String[] args) {
		DepositeAccount<Integer, String> dAccount1 = new DepositeAccount<Integer, String>(20, "michel");
	}
}

class Account<T>{
	private T _id;
	T getId() {return _id;}
	Account(T id){
		_id = id;
	}
}

class DepositeAccount<T, S> extends Account<T> {
	private S name;
	DepositeAccount(T id, S name) {
		super(id);
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	public S getName() {return name;}

}