package br.com.alura.leilao.service;

import br.com.alura.leilao.dao.PagamentoDao;
import br.com.alura.leilao.model.Lance;
import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.model.Pagamento;
import br.com.alura.leilao.model.Usuario;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class GeradorDePagamentoTest {

    @Mock
    private PagamentoDao pagamentoDao;

    @Captor
    private ArgumentCaptor<Pagamento> captor;

    private GeradorDePagamento gerador;


    @BeforeEach
    void beforeEach(){
        MockitoAnnotations.initMocks(this);
        this.gerador = new GeradorDePagamento(pagamentoDao);
    }



    @Test
    void deveriaCriarPagamentoParaVencedorLeilao(){
        Leilao leilao = leilao();
        Lance vencedor = leilao.getLanceVencedor();
        gerador.gerarPagamento(vencedor);

        Mockito.verify(pagamentoDao).salvar(captor.capture());

        Pagamento pagamento = captor.getValue();
        Assert.assertEquals(LocalDate.now().plusDays(1), pagamento.getVencimento());
        Assert.assertFalse(pagamento.getPago());
        Assert.assertEquals(vencedor.getUsuario(), pagamento.getUsuario());
        Assert.assertEquals(leilao, pagamento.getLeilao());

    }

    private Leilao leilao() {
        Leilao leilao = new Leilao("Celular",
                new BigDecimal("500"),
                new Usuario("Fulano"));

        Lance lance = new Lance(new Usuario("Ciclano"),
                new BigDecimal("900"));

        leilao.propoe(lance);
        leilao.setLanceVencedor(lance);
        return leilao;
    }
}
