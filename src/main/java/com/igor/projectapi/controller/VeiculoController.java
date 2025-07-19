package com.igor.projectapi.controller;

import com.igor.projectapi.entity.Veiculo;
import com.igor.projectapi.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @PostMapping
    public Veiculo cadastrarVeiculo(@RequestBody Veiculo veiculo){
        return veiculoRepository.save(veiculo);
    }
}
