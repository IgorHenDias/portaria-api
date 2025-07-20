package com.igor.projectapi.controller;

import com.igor.projectapi.entity.*;
import com.igor.projectapi.repository.FuncionarioRepository;
import com.igor.projectapi.service.ViagemService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/viagens")
public class ViagemController {

    @Autowired
    private ViagemService viagemService;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @PostMapping("/saida")
    public void registrarSaida(@RequestBody SaidaRequest req) {
        viagemService.registrarSaida(req.getPlacaVeiculo(), req.getIdMotorista(), req.getDestino(), req.getPassageiros());
    }

    @PostMapping("/retorno")
    public void registrarRetorno(@RequestBody RetornoRequest req) {
        viagemService.registrarRetorno(req.getPlacaVeiculo());
    }

    @GetMapping("/veiculos")
    public List<Veiculo> listarPorStatus(@RequestParam("status") StatusVeiculo status) {
        return viagemService.listarPorStatus(status);
    }

    @GetMapping("/registros")
    public List<RegistroViagem> listarHistorico() {
        return viagemService.listarHistorico();
    }

    @GetMapping("/funcionarios")
    public List<Funcionario> listarFuncionarios() {
        return funcionarioRepository.findAll();
    }
}
