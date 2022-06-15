package demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;

public class ApiErrors {

	String message;
	List<String> details;
	HttpStatus status;
	LocalDateTime timeStamp;
	@Override
	public String toString() {
		return "ApiErrors [message=" + message + ", details=" + details + ", status=" + status + ", timeStamp="
				+ timeStamp + "]";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<String> getDetails() {
		return details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	public ApiErrors(String message, List<String> details, HttpStatus status, LocalDateTime timeStamp) {
		super();
		this.message = message;
		this.details = details;
		this.status = status;
		this.timeStamp = timeStamp;
	}
	public ApiErrors() {
		// TODO Auto-generated constructor stub
	}
	
}
