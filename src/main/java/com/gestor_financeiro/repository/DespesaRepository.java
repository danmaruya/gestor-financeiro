package com.gestor_financeiro.repository;

import com.gestor_financeiro.entity.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DespesaRepository extends JpaRepository <Despesa, Integer>{
}
