package com.igor.projectapi.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class RegistroViagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Veiculo veiculo;

    @ManyToOne
    private Funcionario motorista;

    private String destino;
    private String passageiros;

    private LocalDateTime dataSaida;
    private LocalDateTime dataRetorno;
}
