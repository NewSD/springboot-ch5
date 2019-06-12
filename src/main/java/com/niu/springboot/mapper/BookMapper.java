package com.niu.springboot.mapper;

import com.niu.springboot.bean.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by ami on 2019/6/12.
 */
@Mapper
public interface BookMapper {

    int addBook(Book book);

    int deleteBookById(Integer id);

    int updateBookById(Book book);

    Book getBookById(Integer id);

    List<Book> getAllBooks();
}
