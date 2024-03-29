package com.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.entity.UseersLogOutInformation;

@Repository
public interface UserLogOutRepository extends JpaRepository<UseersLogOutInformation, Integer>{

}
