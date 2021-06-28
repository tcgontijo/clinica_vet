package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.domain.Exame;

@Repository
public interface ExameRepository extends JpaRepository<Exame, Integer> {

}
