package com.igor.projectapi.repository;

import com.igor.projectapi.entity.RegistroViagem;
import com.igor.projectapi.entity.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface RegistroViagemRepository extends JpaRepository<RegistroViagem, Long> {
    Optional<RegistroViagem> findTopByVeiculoAndDataRetornoIsNullOrderByDataSaidaDesc(Veiculo veiculo);
}
