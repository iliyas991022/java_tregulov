package metanit.Inheritance_hierarchy_and_type_conversion;

public class Program {
    public static void main(String[] args) {
         Person tom = new Person("Tom");
         tom.display();
         Person sam = new Employee("Sam", "Oracle");
         sam.display();
         Person bob = new Client("Bob", "DuetscheBank", 3000);
         bob.display();

         Object kate = new Client("Kate", "School", 2000);
         if(kate instanceof Client){
             Client clientKate = (Client) kate;
             clientKate.display();
         }  else{
             System.out.println("Conversion is invalid");
         }

         Object sara = new Client("Sara", "FrenchBank", 2000);
         if(sara instanceof Client clientSara) {
             clientSara.display();
         }else {
             System.out.println("Conversion is invalid");
         }

    }
}

class Person {
    private String name;
    public String getName() {
        return name;
    }

    public Person(String name){
        this.name = name;
    }

    public void display(){
        System.out.printf("Person %s \n", name);
    }
}

class Employee extends Person{
    private String company;
    public Employee(String name, String company){
        super(name);
        this.company= company;
    }
    public String getCompany(){
        return company;
    }
@Override
    public void display(){
        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }
}

class Client extends Person{
    private int sum;
    private String bank;
    public Client(String name, String bank, int sum){
        super(name);
        this.bank = bank;
        this.sum   = sum;

    }

    @Override
    public void display() {
        System.out.printf("Client %s has account in %s \n" , super.getName(), bank);
    }

    public String getBank(){return bank;}
    public int getSum(){return sum;}
}
