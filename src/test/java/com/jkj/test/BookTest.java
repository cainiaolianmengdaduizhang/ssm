package com.jkj.test;

import com.jkj.config.SpringConfig;
import com.jkj.domain.Book;
import com.jkj.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookTest {
    @Autowired
    private BookService bookService;
    @Test
    public void getById(){
        Book byId = bookService.getById(7);
        System.out.println(byId);
    }

    @Test
    public void getAll(){
        List<Book> all = bookService.getAll();
        for (Book book : all) {
            System.out.println(book);
        }
    }
}
