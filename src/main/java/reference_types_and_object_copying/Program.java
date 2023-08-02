package reference_types_and_object_copying;

public class Program {

}

class Book implements Cloneable{
	private String name;
	private Author author;
	
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
	
	public void setAuthor(String n) {author.setName(n);}
	public String getAuthor() {return author.getName();}
	
	public Book(String name, Author author) {
		this.name = name;
		this.author = author;
	}
	public String toString() {
		return "Book is " + name + "Author is " + author.getName();
	}
	
	public Book clone() throws CloneNotSupportedException{
		Book newBook = (Book) super.clone();
		newBook.author= (Author) author.clone();
		return newBook;
	}
}

class Author implements Cloneable {
	private String name;
	 
	public void setName(String name) {this.name = name;}
	public String getName() { return name;}
	
	public Author(String name) {
		this.name = name;
	}
	
	public Author clone() throws CloneNotSupportedException{
		return (Author) super.clone();	
	}
}