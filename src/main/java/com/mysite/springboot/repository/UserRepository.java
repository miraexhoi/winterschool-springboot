package com.mysite.springboot.repository;

import java.util.Optional;

import com.mysite.springboot.entity.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SiteUser, Long> {
    Optional<SiteUser> findByusername(String username);
}