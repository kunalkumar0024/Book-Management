package demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public Book getById(int bookId) {
		// TODO Auto-generated method stub
		Optional<Book> opt= getBookList()
				.stream()
				.filter((book)->book.getBookId()==bookId)
				.findAny();
		//orElseThrow(()->new IdNotFoundException("Invalid Id");
				if(opt.isPresent()) {
					return opt.get();
				}
				else {
					throw new IdNotFoundException("Invalid Id");
				}
	}

	@Override
	public List<Book> getBookByAuthor(String auther) {
		// TODO Auto-generated method stub
		List<Book> bookList= getBookList()
				.stream()
				.filter((book)->book.getAuther().equals(auther))
				.collect(Collectors.toList());
		
		if(bookList.isEmpty()) {
			throw new BookNotFoundException("Book with this Auther not found");
		}
		else {
			return bookList;
		}
	}

	@Override
	public List<Book> getBookByCategory(String category) {
		// TODO Auto-generated method stub
		List<Book> bookList= getBookList()
				.stream()
				.filter((book)->book.getCategory().equals(category))
				.collect(Collectors.toList());
		if(bookList.isEmpty()) {
			throw new BookNotFoundException("Book in this category not found");
		}
		else {
			return bookList;
		}
		
	}
	
	private List<Book> getBookList(){
		return Arrays.asList(new Book("Java","E.Bala","Tech",10),
				new Book("C","Dennis","Tech",11),
				new Book("Marketting Management","Philip","Management",12),
				new Book("Antima","Manav","Arts",13),
				new Book("Physics","Verma","Science",17));	
		}

	@Override
	public List<Book> getBookAuthor(String auther) {
		// TODO Auto-generated method stub
		return getBookList()
				.stream()
				.filter((book)->book.getAuther().equals(auther))
				.collect(Collectors.toList());
	}

	@Override
	public Book getByBookId(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBookById(int bookId) {
		// TODO Auto-generated method stub
		return null;
	} 
	
	

}