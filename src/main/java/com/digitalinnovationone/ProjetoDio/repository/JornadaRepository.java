package com.digitalinnovationone.ProjetoDio.repository;

import com.digitalinnovationone.ProjetoDio.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
