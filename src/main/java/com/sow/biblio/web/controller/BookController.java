package com.sow.biblio.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sow.biblio.service.BookService;
import com.sow.biblio.service.model.Book;

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

}
