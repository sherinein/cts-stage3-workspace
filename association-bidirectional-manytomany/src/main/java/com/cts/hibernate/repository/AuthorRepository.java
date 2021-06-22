package com.cts.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.hibernate.entity.Author;
@Repository
public interface AuthorRepository extends JpaRepository<Author,Long >{

}
