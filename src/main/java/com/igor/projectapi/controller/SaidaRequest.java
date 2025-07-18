package com.igor.projectapi.controller;

import lombok.Data;


@Data
public class SaidaRequest {
    private String placaVeiculo;
    private Long idMotorista;
    private String destino;
    private String passageiros;
}
