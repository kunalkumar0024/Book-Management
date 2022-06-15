package demo;

import java.util.List;

public interface BookService {
	Book getById(int bookId);
	List<Book> getBookByAuthor(String auther)throws BookNotFoundException;
	List<Book> getBookByCategory(String category)throws BookNotFoundException;
	Book getByBookId(int bookId)throws IdNotFoundException;
	
	List<Book> getBookAuthor(String auther);
	Book getBookById(int bookId)throws IdNotFoundException;

}
