package com.jgmonteiro.tutorialzup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jgmonteiro.tutorialzup.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
