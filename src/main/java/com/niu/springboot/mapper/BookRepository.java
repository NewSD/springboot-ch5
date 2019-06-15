package com.niu.springboot.mapper;

import com.niu.common.SqlMapper;
import com.niu.springboot.bean.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by ami on 2019/6/13.
 */
@Mapper
public interface BookRepository extends SqlMapper<Book> {
}
