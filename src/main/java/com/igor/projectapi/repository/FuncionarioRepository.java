package com.igor.projectapi.repository;


import com.igor.projectapi.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
}
