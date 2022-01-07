package br.com.estudosdobreno;

import br.com.estudosdobreno.modelo.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploCursos {
    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparingInt(Curso::getAlunos));
        //cursos.forEach(c -> System.out.println(c.getNome()));

        System.out.println("Filtrando cursos pela quantidade de alunos");

        cursos.stream()
                .filter(c-> c.getAlunos() >= 50)
                .forEach(c -> System.out.println(c.getNome()));

        System.out.println("Total de alunos dos cursos");

        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .map(Curso::getAlunos)
                .forEach(System.out::println);


        //convertendo uma stream de Cursos para stream de String
        Stream<String> nomes = cursos.stream().map(Curso::getNome);


        //pegando o primeiro elemento da stream depois de filtrar
        cursos.stream()
                .filter(c -> c.getAlunos() >= 50)
                .findFirst();

        //calculando a idade média de alunos de todos os cursos
        cursos.stream().mapToInt(Curso::getAlunos).average();

        //convertendo uma Stream<Curso> para List<Curso>(sim, eu reatribui uma lista gerada pela stream para a lista que já existia)
        cursos = cursos.stream().collect(Collectors.toList());
    }
}
