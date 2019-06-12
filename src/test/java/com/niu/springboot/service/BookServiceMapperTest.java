package com.niu.springboot.service;

import com.niu.springboot.bean.Book;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ami on 2019/6/12.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceMapperTest {
    @Autowired
    BookServiceMapper bookServiceMapper;
    @Test
    public void addBook() throws Exception {
        Book book = new Book();
        book.setName("西厢记电话客服好fdsa看");
        book.setAuthor("王实甫");
        int i = bookServiceMapper.addBook(book);
        System.out.println("addBook>>>" + i);
    }

    @Test
    public void updateBook() throws Exception {
        Book book2 = new Book();
        book2.setId(1);
        book2.setName("朝花夕拾第二十部");
        book2.setAuthor("鲁迅");
        int i2 = bookServiceMapper.updateBook(book2);
        System.out.println("updateBook>>>" + i2);
    }

    @Test
    public void deleteBookById() throws Exception {
        int delete = bookServiceMapper.deleteBookById(1);
        System.out.println("deleteBookById(2)>>>" + delete);
    }

    @Test
    public void getBookById() throws Exception {
        Book b3 = bookServiceMapper.getBookById(1);
        System.out.println("getBookById(1)>>>" + b3);
    }

    @Test
    public void getAllBooks() throws Exception {
        List<Book> allBooks = bookServiceMapper.getAllBooks();
        System.out.println("getAllBooks>>>>" + allBooks);
    }
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
}