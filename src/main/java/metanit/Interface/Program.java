package metanit.Interface;

import java.sql.SQLOutput;

public class Program  {
    public static void main(String[] args) {
        Printable printable = new Book("Java.Complete", "Shildt");
        printable.print();
        printable = new Journal("For" );
        printable.print();

        String name = ((Journal)printable).getName();

        Printable printable1 = createPrintable("Forrrr", false);
        printable1.print();

        read(new Book("C#", "Some people"));
        read(new Journal("Java Day"));
    }

    static void read(Printable p) {
        p.print();
    }

    static Printable createPrintable(String name, boolean option){
        if(option){
            return new Book(name, "Undefined");
        } else {
            return new Journal(name);
        }
    }
}

interface Printable {
    int OPEN = 1; //константа
    int CLOSED = 0;
    default void print() {
        System.out.println("Default print");
    }

    static void read(){
        System.out.println("Read");
    }
}

class Book implements Printable{
    String name;
    String author;

    Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public void print(){
        System.out.printf("%s (%s) \n", name  , author );
    }

    public void printState(int n){
        if(n==OPEN){
            System.out.println("book is open");
        }   else if(n == CLOSED){
            System.out.println("book is closed");
        }   else{
            System.out.println("state is invalid");
        }
    }
}

class Journal implements Printable {
    private String name;
    String getName(){return name;}
    public Journal(String name){
        this.name = name;
    }

}

interface Calculatable{
    default int sum(int a, int b){
        return sumAll(a,b);
    }
    default int sum(int a, int b, int c){
        return sumAll(a,b,c);
    }

    private int sumAll(int... values){
        int result = 0;
        for (int n : values){
            result += n;
        }
        return result;
    }
}

class Calculation implements Calculatable{}

interface Searchable{}
interface Writeable extends Printable{} //наследование интерфейсов
class Browser implements Searchable,Writeable{} //множественное наследование

class Printer {
    interface Printable{} //вложенный интерфейс
}
class Something implements Printer.Printable{}