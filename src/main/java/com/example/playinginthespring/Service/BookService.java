package com.example.playinginthespring.Service;

import com.example.playinginthespring.Entity.Book;
import com.example.playinginthespring.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;

    public List<Book> getBooks(){
        return bookRepo.findAll();
    }

}
