package com.igor.projectapi.service;

import com.igor.projectapi.entity.*;
import com.igor.projectapi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service

public class ViagemService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private RegistroViagemRepository registroViagemRepository;

    public void registrarSaida(String placa, Long motoristaId, String destino, String passageiros) {
        Veiculo veiculo = veiculoRepository.findByPlaca(placa)
                .orElseThrow(() -> new RuntimeException("Veículo não encontrado"));

        if (veiculo.getStatus() != StatusVeiculo.NO_PATIO) {
            throw new RuntimeException("Veículo não está no pátio.");
        }

        Funcionario motorista = funcionarioRepository.findById(motoristaId)
                .orElseThrow(() -> new RuntimeException("Motorista não encontrado"));

        RegistroViagem registro = new RegistroViagem();
        registro.setVeiculo(veiculo);
        registro.setMotorista(motorista);
        registro.setDestino(destino);
        registro.setPassageiros(passageiros);
        registro.setDataSaida(LocalDateTime.now());

        veiculo.setStatus(StatusVeiculo.EM_VIAGEM);

        veiculoRepository.save(veiculo);
        registroViagemRepository.save(registro);
    }

    public void registrarRetorno(String placa) {
        Veiculo veiculo = veiculoRepository.findByPlaca(placa)
                .orElseThrow(() -> new RuntimeException("Veículo não encontrado"));

        if (veiculo.getStatus() != StatusVeiculo.EM_VIAGEM) {
            throw new RuntimeException("Veículo nào está em viagem");
        }

        RegistroViagem registro = registroViagemRepository
                .findTopByVeiculoAndDataRetornoIsNullOrderByDataSaidaDesc(veiculo)
                .orElseThrow(() -> new RuntimeException("Registro de viagem não encontrado."));

        registro.setDataRetorno(LocalDateTime.now());
        veiculo.setStatus(StatusVeiculo.NO_PATIO);

        registroViagemRepository.save(registro);
        veiculoRepository.save(veiculo);
    }

    public List<Veiculo> listarPorStatus(StatusVeiculo status) {
        return veiculoRepository.findByStatus(status);
    }

    public List<RegistroViagem> listarHistorico() {
        return registroViagemRepository.findAll();
    }
}
