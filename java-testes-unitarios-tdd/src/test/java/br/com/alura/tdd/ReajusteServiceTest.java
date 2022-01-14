package br.com.alura.tdd;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.ReajusteService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTest {

    @Test
    void reajusteDe3PorcentoQuandoDesempenhoForADesejar(){
        ReajusteService service = new ReajusteService();

        Funcionario funcionario = new Funcionario("Breno", LocalDate.now(), new BigDecimal("1000"));

        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

        Assertions.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    void reajusteDe3PorcentoQuandoDesempenhoForBom(){
        ReajusteService service = new ReajusteService();

        Funcionario funcionario = new Funcionario("Breno", LocalDate.now(), new BigDecimal("1000"));

        service.concederReajuste(funcionario, Desempenho.BOM);

        Assertions.assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    void reajusteDe3PorcentoQuandoDesempenhoForOtimo(){
        ReajusteService service = new ReajusteService();

        Funcionario funcionario = new Funcionario("Breno", LocalDate.now(), new BigDecimal("1000"));

        service.concederReajuste(funcionario, Desempenho.OTIMO);

        Assertions.assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
