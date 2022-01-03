package br.com.estudosdobreno;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<String> palavras = new ArrayList<String>();
        palavras.add("a23");
        palavras.add("e23234");
        palavras.add("b3221984");
        palavras.add("i");

        System.out.println(palavras);

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        palavras.forEach(s1-> System.out.println(s1));

        new Thread(() -> System.out.println("Executando um Runnable")).start();
    }
}
