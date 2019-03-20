package zajecia4;
import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<User> users;
	private List<Book> books;
	
	public Library() {
		users = new ArrayList<User>();
		books = new ArrayList<Book>();
	}
	
	public String AddBook() {
		books.add(new Book());
	}
}
