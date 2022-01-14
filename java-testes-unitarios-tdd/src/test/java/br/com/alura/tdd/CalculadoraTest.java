package br.com.alura.tdd;

import br.com.alura.tdd.modelo.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void somaDeDoisNumeros() {
        Calculadora calculadora = new Calculadora();

        int soma = calculadora.somar(1, 4);

        Assertions.assertEquals(5, soma);
    }

}
