package com.sow.biblio.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sow.biblio.service.BookService;
import com.sow.biblio.service.model.Book;
//import com.sow.biblio.service.model.CustomBook;

@Controller

public class BookController {
	
	
	@Resource
	private MessageSource messageSource;
	
	@Resource
	private BookService bookService;
	
	@RequestMapping("/bookSearch.htm")
	public String bookSearch(ModelMap model) {
		
		List<Book> bookList = bookService.findBook(null, "PaTrI", null, null);
					
		System.out.println("\n*****bookList.get(0).getBookName():" + bookList.get(0).getBookName());
		
		return "sample";
	}

/*	@RequestMapping("/getAllBooks.htm")
	public String getAllBooks(ModelMap model) {
		
		List<Book> bookList = bookService.getAllBooks();
					
		for (Book book : bookList) {
			System.out.println("\n*****Book Name, AuthorName:" + book.getBookName() + ", " + book.getAuthorName());
		}
			
		return "sample";
	} */
	
/*	@RequestMapping("/getAllBooks1.htm")
	public String getAllBooks1(ModelMap model) {
		
		List<CustomBook> bookList = bookService.getSpecificColumnsAllBooks();
					
		for (CustomBook book : bookList) {
			System.out.println("\n*****Id, Book Name:" + book.getBookId() + ", " + book.getBookName());
		}
			
		return "sample";
	}*/
}
