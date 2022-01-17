package br.com.alura.tdd;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.ReajusteService;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTest {

    private ReajusteService service;
    private Funcionario funcionario;

    @BeforeAll
    public static void initializeTestCases(){
        System.out.println("Iniciando suite de testes");
    }

    @BeforeEach
    public void init(){
        service = new ReajusteService();
        funcionario = new Funcionario("Breno", LocalDate.now(), new BigDecimal("1000"));
    }

    @AfterEach
    public void endTask(){
        System.out.println("Finalizado teste unitário");
    }

    @AfterAll
    public static void end(){
        System.out.println("Finalização de todos os testes");
    }

    @Test
    void reajusteDe3PorcentoQuandoDesempenhoForADesejar(){

        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        Assertions.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    void reajusteDe3PorcentoQuandoDesempenhoForBom(){

        service.concederReajuste(funcionario, Desempenho.BOM);
        Assertions.assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    void reajusteDe3PorcentoQuandoDesempenhoForOtimo(){

        service.concederReajuste(funcionario, Desempenho.OTIMO);
        Assertions.assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
