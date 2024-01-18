package com.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.entity.UsersLoginInformation;

@Repository
public interface UsersLoginRepository extends JpaRepository<UsersLoginInformation, Integer> {

}
