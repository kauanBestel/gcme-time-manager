package com.gcme.mvp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gcme.mvp.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    
}
