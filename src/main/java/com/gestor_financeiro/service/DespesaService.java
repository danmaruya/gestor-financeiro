package com.gestor_financeiro.service;

import com.gestor_financeiro.entity.Despesa;
import com.gestor_financeiro.messages.Mensagem;
import com.gestor_financeiro.repository.DespesaRepository;
import jakarta.validation.Valid;
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

    public Despesa retornarDespesaPorId(Integer id) {
        if (this.despesaRepository.existsById(id)) {
            return this.despesaRepository.findById(id).get();
        }
        throw new RuntimeException();
    }

    public Mensagem deletarDespesa(Integer id) {
        if (this.despesaRepository.existsById(id)) {
            this.despesaRepository.deleteById(id);
            Mensagem mensagem = new Mensagem();
            mensagem.setMensagem("Despesa deletada com sucesso!");
            return mensagem;
        }
        throw new RuntimeException();
    }

    public Despesa editarDespesa(@Valid Despesa despesa, Integer id) {
        if (this.despesaRepository.existsById(id)) {
            Despesa despesaAlterada = this.despesaRepository.getReferenceById(id);
            despesaAlterada.setNome(despesa.getNome());
            despesaAlterada.setCategoria(despesa.getCategoria());
            despesaAlterada.setData(despesa.getData());
            despesaAlterada.setValor(despesa.getValor());
            return this.despesaRepository.save(despesaAlterada);
        }
        throw new RuntimeException();
    }
}
