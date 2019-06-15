package com.niu.springboot.query;

import com.niu.mybatis.AbstractQuery;
import com.niu.springboot.bean.Book;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


/**
 * Created by ami on 2019/6/12.
 */
public class BookQuery extends AbstractQuery<Book> {

    private Integer id;
    private List<Integer> ids;
    private String name;
    private String author;

    @Override
    protected void addCondition(Example.Criteria criteria) {
        if (null != id) {
            criteria.andEqualTo(Book.column.id, id);
        }
        if (CollectionUtils.isNotEmpty(ids)) {
            criteria.andIn(Book.column.id, ids);
        }
        if (StringUtils.isNotBlank(name)) {
            criteria.andLike(Book.column.name, '%' + name + '%');
        }
        if (StringUtils.isNotBlank(author)) {
            criteria.andLike(Book.column.author, '%' + author + '%');
        }

    }
}
