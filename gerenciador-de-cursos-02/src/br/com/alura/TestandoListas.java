package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		String aula01 = "Conhecendo mais de listas";
		String aula02 = "Modelando a classe aula";
		String aula03 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<String>();

		aulas.add(aula01);
		aulas.add(aula02);
		aulas.add(aula03);

		System.out.println(aulas.toString());

		aulas.remove(0);

		System.out.println(aulas);

		for (String aula : aulas) {
			System.out.println(aula);
		}

		String primeiraAula = aulas.get(0);

		System.out.println("A primeira aula é: " + primeiraAula + ".");

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i) + ".");
		}

		aulas.add("Outra aula de listas.");

		System.out.println("Aulas sem Ordenar: ");
		for (String aulaSemOrdenar : aulas) {
			System.out.println(aulaSemOrdenar);
		}

		// ordenando listas - testando

		Collections.sort(aulas);

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + (i + 1) + " - " + aulas.get(i));
		}

	}
}
