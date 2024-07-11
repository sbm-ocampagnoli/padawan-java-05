package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();

		// 1) adicione alguns alunos
		
		alunos.add("Otavio");
		alunos.add("Henrique");
		alunos.add("Walter");
		// 2) imprima o tamanho da colecao
		System.out.println(alunos.size());

		// 3) tente adicionar um aluno que existe
		
		boolean adicionou = alunos.add("Otavio");
		System.out.println("Otavio foi adicionado ao Set? " + adicionou);
		// 4) imprima novamente o tamanho da colecao
		
		System.out.println(alunos.size());

	}

}
