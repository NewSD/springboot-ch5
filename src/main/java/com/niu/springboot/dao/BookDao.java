package com.niu.springboot.dao;

import com.niu.springboot.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ami on 2019/6/12.
 */
@Repository
public class BookDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public int addBook(Book book) {
        return jdbcTemplate.update(
                "INSERT INTO book(name,author) VALUES (?,?)",
                book.getName(), book.getAuthor());
    }

    public int updateBook(Book book){
        return jdbcTemplate.update("UPDATE book SET name=?,author=? WHERE id=?",
                book.getName(),book.getAuthor(),book.getId());
    }
    public int deleteBookById(Integer id){
        return jdbcTemplate.update("DELETE FROM book WHERE id = ?",
                id);
    }
    public Book getBookById(Integer id){
        return jdbcTemplate.queryForObject("SELECT * FROM book WHERE id = ?",
                new BeanPropertyRowMapper<>(Book.class),id);
    }
    public List<Book> getAllBooks(){
        return jdbcTemplate.query("SELECT * FROM book",
                new BeanPropertyRowMapper<>(Book.class));
    }

}
