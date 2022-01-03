package br.com.estudosdobreno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class Main {

    public static void main(String[] args) {
	    List<String> palavras = new ArrayList<String>();
        palavras.add("a23");
        palavras.add("D123");
        palavras.add("e23234");
        palavras.add("b3221984");
        palavras.add("d123");
        palavras.add("i");

        System.out.println(palavras);

        palavras.sort(comparing(String::length));

        palavras.forEach(System.out::println);

        palavras.sort(String.CASE_INSENSITIVE_ORDER);

        palavras.forEach(System.out::println);
    }
}
