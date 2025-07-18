package com.igor.projectapi.repository;


import com.igor.projectapi.entity.StatusVeiculo;
import com.igor.projectapi.entity.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    Optional<Veiculo> findByPlaca(String placa);

    List<Veiculo> findByStatus(StatusVeiculo status);
}
