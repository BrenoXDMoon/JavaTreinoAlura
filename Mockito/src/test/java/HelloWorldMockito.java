import br.com.alura.leilao.dao.LeilaoDao;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HelloWorldMockito {

    @Test
    void helloWorld(){
        LeilaoDao mock = Mockito.mock(LeilaoDao.class);
        Assert.assertTrue(mock.buscarTodos().isEmpty());
    }
}
