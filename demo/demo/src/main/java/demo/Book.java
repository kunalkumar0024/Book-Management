package demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", auther=" + auther + ", category=" + category + ", bookId=" + bookId + "]";
	}
	public Book(String title, String auther, String category, int bookId) {
		
		this.title=title;
		this.auther=auther;
		this.category=category;
		this.bookId=bookId;
		// TODO Auto-generated constructor stub
	}
	private String title;
	private String auther;
	private String category;
	private int bookId;
	
	
}
