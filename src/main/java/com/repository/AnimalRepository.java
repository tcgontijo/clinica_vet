package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.domain.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
