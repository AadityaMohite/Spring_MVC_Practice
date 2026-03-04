package com.Aadi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Aadi.entity.Book;
import com.Aadi.repo.BookRepository;

@Controller
public class BookController {
@GetMapping("/book-form")
	public String getbook(Model model) {
		
		
	  
	
		return "book";
		
		
		
	}
@Autowired
   BookRepository bookrepository;

	@GetMapping("/searchBook")
public String searchBook(@RequestParam int bookId,Model model) {
	
Optional<Book> op =	bookrepository.findById(bookId);

  if(op.isPresent()) {
	  
	  Book book = op.get();
	  
	  model.addAttribute("book",book);
	 
  }else {
	  model.addAttribute("message", "no data found for this Id");
  }
	
	return "book";
}
	
}
