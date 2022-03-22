package com.springboot.service;

import java.util.List;
import java.util.Optional;

import javax.print.attribute.standard.MediaSize.Other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Book;
import com.springboot.repositry.BookRepositry;

@Service
public class BookService {
	
	@Autowired
	private BookRepositry bookRepo;
	
	
	public Book saveBook(Book book) {
		return bookRepo.save(book);
	}
	
	public List<Book> saveBooks(List<Book> book) {
		return bookRepo.saveAll(book);
	}
	
	
	public List<Book> getBooks(){
		return bookRepo.findAll();
	}
	
	public Book getProductById(int id){
		return bookRepo.findById(id).orElse(null);
	}
	
	public String deleteBook(int id) {
		bookRepo.deleteById(id);
		return "book delete: " + id; 
	}
	
	public Book updateBook(Book book) {
		Book existingBook = bookRepo.findById(book.getId()).orElse(null);
		existingBook.setBookName(book.getBookName());
		existingBook.setBookAuthor(book.getBookAuthor());
		
		return bookRepo.save(existingBook);
	}
	
}
