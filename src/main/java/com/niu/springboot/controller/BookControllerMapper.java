package com.niu.springboot.controller;

import com.niu.springboot.bean.Book;
import com.niu.springboot.service.BookService;
import com.niu.springboot.service.BookServiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ami on 2019/6/12.
 */
@RestController
public class BookControllerMapper {
    @Autowired
    BookServiceMapper bookServiceMapper;

    @GetMapping("/addBook")
    public void addBook() {
        Book book = new Book();
        book.setName("西厢记电话客服好看");
        book.setAuthor("王实甫");
        int i = bookServiceMapper.addBook(book);
        System.out.println("addBook>>>" + i);
    }

    @GetMapping("/updateBook")
    public void updateBook() {
        Book book2 = new Book();
        book2.setId(1);
        book2.setName("朝花夕拾第二部");
        book2.setAuthor("鲁迅");
        int i2 = bookServiceMapper.updateBook(book2);
        System.out.println("updateBook>>>" + i2);
    }
    @GetMapping("/getBookById")
    public void getBookById() {
        Book b3 = bookServiceMapper.getBookById(1);
        System.out.println("getBookById(1)>>>" + b3);
    }
    @GetMapping("/deleteBookById")
    public void deleteBookById() {
        int delete = bookServiceMapper.deleteBookById(2);
        System.out.println("deleteBookById(2)>>>" + delete);
    }
    @GetMapping("/getAllBooks")
    public void getAllBooks() {
        List<Book> allBooks = bookServiceMapper.getAllBooks();
        System.out.println("getAllBooks>>>>" + allBooks);
    }
}
