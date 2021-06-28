package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.domain.Anamnese;

@Repository
public interface AnamneseRepository extends JpaRepository<Anamnese, Integer> {

}
