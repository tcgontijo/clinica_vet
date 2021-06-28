package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.domain.Doencas;

@Repository
public interface DoencasRepository extends JpaRepository<Doencas, Integer> {

}
