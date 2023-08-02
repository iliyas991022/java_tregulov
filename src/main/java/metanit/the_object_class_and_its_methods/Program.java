package metanit.the_object_class_and_its_methods;

public class Program {
	public static void main(String[] args) {
		Person tom = new Person("Tom");
		Person bob = new Person("Bob");
		System.out.println(tom.toString());
		System.out.println(tom.hashCode());
		System.out.println(tom.getClass());
		System.out.println(tom.equals(bob));
	}
}

class Person{
	private String name;
	public Person(String name) {
		this.name = name;
	} 
	
	@Override 
	public String toString() {
		return "Person" + name;
	}
}