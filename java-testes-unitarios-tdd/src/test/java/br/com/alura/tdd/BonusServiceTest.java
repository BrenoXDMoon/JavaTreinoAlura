package br.com.alura.tdd;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BonusServiceTest{

    @Test
    public void bonusDeveriaSerzeroParaFuncionarioComSalarioAlto(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Breno", LocalDate.now(), new BigDecimal("25000")));


        Assertions.assertEquals(BigDecimal.ZERO, bonus);
    }

    @Test
    public void bonusDeveriaSerDezPorcentoDoSalario(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Breno", LocalDate.now(), new BigDecimal("2500")));

        Assertions.assertEquals(new BigDecimal("250.0"), bonus);
    }

    @Test
    public void bonusDeveriaSerDezPorcentoDoSalarioParaSalarioExatoDe10000(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Breno", LocalDate.now(), new BigDecimal("10000")));

        Assertions.assertEquals(new BigDecimal("1000.0"), bonus);
    }
}
