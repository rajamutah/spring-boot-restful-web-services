package com.springboot_learning.spring.boot.restful.web.services.repository;

import com.springboot_learning.spring.boot.restful.web.services.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
