package com.jkj.service.impl;

import com.jkj.controller.Code;
import com.jkj.dao.BookDao;
import com.jkj.domain.Book;
import com.jkj.excption.BusinessException;
import com.jkj.excption.SystemException;
import com.jkj.service.BookService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
   /* @Autowired
    private BookDao bookDao;
    @Override
    public Boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    @Override
    public Boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    @Override
    public Boolean delete(Insert id) {
        bookDao.delete(id);
        return true;
    }

    @Override
    public Book getById(Integer id) {
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
*/
   @Autowired
   private BookDao bookDao;

    public Boolean save(Book book) {
        return bookDao.save(book) > 0;
    }

    public Boolean update(Book book) {
        return bookDao.update(book) > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    public Book getById(Integer id) {
        /*//模拟业务异常，包装成自定义异常
        if(id == 1){
            throw new BusinessException(Code.BUSINESS_ERR,"请不要使用你的技术挑战我的耐性!");
        }
        //模拟系统异常，将可能出现的异常进行包装，转换成自定义异常
        try{
            int i = 1/0;
        }catch (Exception e){
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时，请重试!",e);
        }*/
        return bookDao.getById(id);


    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
