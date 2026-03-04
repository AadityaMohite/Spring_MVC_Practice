package com.Aadi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Aadi.entity.Book;

@Repository
public interface BookRepository  extends JpaRepository<Book, Integer>{

}
