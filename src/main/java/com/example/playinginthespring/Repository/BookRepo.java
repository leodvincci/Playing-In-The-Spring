package com.example.playinginthespring.Repository;

import com.example.playinginthespring.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepo extends JpaRepository<Book,String> {




}
