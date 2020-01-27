package com.real.admin.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.real.admin.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
