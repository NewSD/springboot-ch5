package com.niu.springboot.controller;

import com.niu.springboot.bean.Book;
import com.niu.springboot.mapper.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ami on 2019/6/13.
 */
@RestController
public class BookReposController {
    @Autowired
    BookRepository bookRepository;

    @GetMapping("/pepos")
    public void bookOps() {
        Book book = new Book();
        book.setName("西厢记");
        book.setAuthor("王实甫");
        int i = bookRepository.insert(book);
        System.out.println("addBook>>>"+i);
        Book book2 = new Book();
        book2.setId(1);
        book2.setName("朝花夕拾");
        book2.setAuthor("鲁迅");
        int i2 = bookRepository.updateByPrimaryKey(book2);
        System.out.println("updateBook>>>"+i2);
        Book b3 = bookRepository.selectByPrimaryKey(1L);
        System.out.println("getBookById(1)>>>"+b3);

        int delete = bookRepository.deleteByPrimaryKey(2L);
        System.out.println("deleteBookById(2)>>>"+delete);

        List<Book> allBooks = bookRepository.selectAll();
        System.out.println("getAllBooks>>>>"+allBooks);
    }
}
