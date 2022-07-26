package com.jkj.controller;

import com.jkj.domain.Book;
import com.jkj.service.BookService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
  /*  @Autowired
    private BookService bookService;
    @PostMapping
    public Boolean save(@RequestBody Book book) {
        return bookService.save(book);
    }
   @PutMapping
    public Boolean update(@RequestBody Book book) {
        return bookService.update(book);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Insert id) {
        return  bookService.delete(id);
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id) {
        return bookService.getById(id);
    }

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }*/

    @Autowired
    private BookService bookService;
    @PostMapping
    public Result save(@RequestBody Book book) {
        Boolean flag = bookService.save(book);
        return new Result(flag?Code.SAVE_OK:Code.SAVE_ERROR,flag);
    }
    @PutMapping
    public Result update(@RequestBody Book book) {
        Boolean flag = bookService.update(book);
        return new Result(flag?Code.UPDATE_OK:Code.UPDATE_ERROR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        Boolean flag = bookService.delete(id);
        return new Result(flag?Code.DELETE_OK:Code.DELETE_ERROR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        //手动添加一个错误信息
       /* if(id==1){
            int i = 1/0;
        }*/
        Book book = bookService.getById(id);
        Integer code=book !=null?Code.SELECT_OK:Code.SAVE_ERROR;
        String msg=book !=null ? " " : "数据查询失败";
        return new Result(code,book,msg);
    }

    @GetMapping
    public Result getAll() {
        List<Book> bookList = bookService.getAll();
        Integer code=bookList !=null?Code.SELECT_OK:Code.SAVE_ERROR;
        String msg=bookList !=null ? " " : "数据查询失败";
        return new Result(code,bookList,msg);
    }

}
