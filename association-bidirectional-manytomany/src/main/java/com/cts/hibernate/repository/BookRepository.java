package com.cts.hibernate.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.hibernate.entity.Book;


@Repository
public interface BookRepository extends JpaRepository<Book,Long > {

}
