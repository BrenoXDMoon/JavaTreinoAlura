package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;

import br.com.alura.modelo.Aula;

public class TestandoArrayList {

	
	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revistando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        // antes de ordenar por minutos:
        System.out.println(aulas);
        
        /*dentro do comparing eu posso colocar qualquer método da classe
         * desde que seja público, e poderia ser dentro do nosso exemplo
         * Comparator.comparing(Aula::getTitulo) que iria ordenar por
         * ordem alfabética, mas é meio inútil pra esse cenário pois
         * tem só 1 atributo String, mas para outra onde vc tenha 2
         * ou mais atributos String acho interessante.
         */
        aulas.sort(Comparator.comparing(Aula::getTempoEmMinutos));

        // depois de ordenar:
        System.out.println(aulas);
	}
}
