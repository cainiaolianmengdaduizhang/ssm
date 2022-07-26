package com.jkj.service;
import com.jkj.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface BookService {
    /**
     *
     * @param book
     * @return
     */
    public Boolean save(Book book);

    /**
     *
     * @param book
     * @return
     */

    public Boolean update(Book book);

    /**
     *
     * @param id
     * @return
     */

    public Boolean delete(Integer id);

    /**
     *
     * @param id
     * @return
     */

    public Book getById(Integer id);

    /**
     *
     * @return
     */

    public List<Book> getAll();



}
