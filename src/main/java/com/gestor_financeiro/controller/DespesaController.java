package com.gestor_financeiro.controller;

import com.gestor_financeiro.entity.Despesa;
import com.gestor_financeiro.service.DespesaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/despesas")
public class DespesaController {
    private DespesaService despesaService;

    @Autowired
    public DespesaController(DespesaService despesaService) {
        this.despesaService = despesaService;
    }

    @PostMapping
    public Despesa cadastrarDespesa(@Valid @RequestBody Despesa despesa) {
        return this.despesaService.cadastrarDespesa(despesa);
    }

    @GetMapping
    public List<Despesa> retornarTodasAsDespesas() {
        return this.despesaService.retornarTodasAsDespesas();
    }
}
