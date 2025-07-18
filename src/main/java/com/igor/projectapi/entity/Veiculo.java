package com.igor.projectapi.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String placa;

    private String modelo;

    @Enumerated(EnumType.STRING)
    private StatusVeiculo status = StatusVeiculo.NO_PATIO;
}
