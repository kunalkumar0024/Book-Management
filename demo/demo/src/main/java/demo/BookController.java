package demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookService bookService;
	//@CrossOrigin(origins={"http://localhost:8383","http://localhost:8384"})
	@GetMapping("/hello")
	public ResponseEntity<String> sayHello() {
		String msg= "Welcome to Rest API";
		HttpHeaders header=new HttpHeaders();
		header.add("desc","Online Book App");
		return new ResponseEntity<String>(msg,header,HttpStatus.OK);
	}
	@GetMapping("/get-by-id/{bookId}")
	public ResponseEntity<Book> getByBookId(@PathVariable("bookId") int bookId) {
		Book book=bookService.getById(bookId);
		HttpHeaders header=new HttpHeaders();
		header.add("desc", "Getting Book By Id");
		return ResponseEntity.status(HttpStatus.OK).headers(header).body(book);
	}
	@GetMapping("/get-by-name/{auther}")
	public ResponseEntity<List<Book>> getBookByAuther(@PathVariable("auther") String auther) {
		List<Book> bookList=bookService.getBookByAuthor(auther);
		HttpHeaders header=new HttpHeaders();
		header.add("desc","Getting book by auther name");
		return ResponseEntity.ok(bookList);
	}
	@GetMapping("/get-by-category/{category}")
	public ResponseEntity<List<Book>> getBookByCategory(@PathVariable String category) {
		List<Book> categoryList=bookService.getBookByCategory(category);
		HttpHeaders header=new HttpHeaders();
		header.add("desc","Getting book by category ");
		return ResponseEntity.ok(categoryList);
	}

}
