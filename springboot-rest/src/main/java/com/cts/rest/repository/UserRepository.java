package com.cts.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.rest.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
