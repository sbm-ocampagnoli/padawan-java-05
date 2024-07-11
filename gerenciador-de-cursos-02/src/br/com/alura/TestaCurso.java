package br.com.alura;

import java.util.List;

public class TestaCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes do java",
				"Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		System.out.println(aulas);

		// javaColecoes.getAulas().add(new Aula("Aula de Lista Ligadas.", 20));

		javaColecoes.adiciona(new Aula("Aula de Lista Ligadas.", 20));


	}
}
