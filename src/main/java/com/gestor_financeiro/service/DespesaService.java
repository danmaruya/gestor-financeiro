package com.gestor_financeiro.service;

import com.gestor_financeiro.entity.Despesa;
import com.gestor_financeiro.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesaService {
    private DespesaRepository despesaRepository;

    @Autowired
    public DespesaService(DespesaRepository despesaRepository) { this.despesaRepository = despesaRepository; }

    public Despesa cadastrarDespesa(Despesa despesa) {
        return this.despesaRepository.save(despesa);
    }

    public List<Despesa> retornarTodasAsDespesas() {
        return this.despesaRepository.findAll();
    }
}
