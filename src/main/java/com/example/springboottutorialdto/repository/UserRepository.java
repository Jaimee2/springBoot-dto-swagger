package com.example.springboottutorialdto.repository;

import com.example.springboottutorialdto.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
