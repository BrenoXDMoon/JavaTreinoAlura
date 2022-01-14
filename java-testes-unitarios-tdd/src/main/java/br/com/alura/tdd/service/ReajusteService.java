package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {

        if(desempenho == Desempenho.A_DESEJAR){
            funcionario.reajustarSalario(funcionario.getSalario().multiply(new BigDecimal("0.03")));

        } else if(desempenho == Desempenho.BOM){
            funcionario.reajustarSalario(funcionario.getSalario().multiply(new BigDecimal("0.15")));

        }else if(desempenho == Desempenho.OTIMO){
            funcionario.reajustarSalario(funcionario.getSalario().multiply(new BigDecimal("0.20")));
        }

    }
}
