package com.raju.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raju.entity.Studententity;

public interface StudentRepo extends JpaRepository<Studententity, Integer>{

}
