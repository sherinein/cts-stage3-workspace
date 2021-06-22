package com.cts.hibernate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.hibernate.entity.Author;
import com.cts.hibernate.entity.Book;
import com.cts.hibernate.service.BookService;
import com.cts.hibernate.service.BookServiceImpl;

@SpringBootApplication
public class AssociationBidirectionalManytomanyApplication {
	private static BookService bookService;
	private static final Logger LOGGER=LoggerFactory.getLogger(AssociationBidirectionalManytomanyApplication.class);

	public static void main(String[] args) {
		LOGGER.info("inside main");
		ApplicationContext context=SpringApplication.run(AssociationBidirectionalManytomanyApplication.class, args);
		bookService=context.getBean(BookServiceImpl.class);
		/*
		 * Book book=new Book();
		 * 
		 * book.setTitle("Spring Framework"); Author author1 = new Author();
		 * author1.setFirstName("Nirmala"); author1.setLastName("Sherine"); List<Author>
		 * listOfAuthors = new ArrayList<Author>(); listOfAuthors.add(author1); Author
		 * author2 = new Author(); author2.setFirstName("Antony");
		 * author2.setLastName("Prakash"); listOfAuthors.add(author2);
		 * book.setAuthors(listOfAuthors); bookService.save(book);
		 */

		List<Book>listOfBooks=bookService.findAll();
		//listOfBooks.stream().forEach(l->System.out.println(l.getTitle()));
		Iterator<Book> iterator=listOfBooks.iterator();
		while(iterator.hasNext()) {
			Book book1=iterator.next();
			System.out.println(book1.getId());
			System.out.println(book1.getTitle());
			List<Author> authors=book1.getAuthors();
			authors.stream().forEach(l->System.out.println(l.getFirstName()));
			
		}
		
	}

}

