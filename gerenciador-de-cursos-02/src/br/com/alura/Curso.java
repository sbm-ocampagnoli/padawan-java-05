package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
//	    int tempoTotal = 0;
//	    for (Aula aula : aulas) {
//	        tempoTotal += aula.getTempo();
//	    }
//	    return tempoTotal;
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "[Curso:" + this.getNome() + ",tempo total:" + this.getTempoTotal() + ", aulas: [" + this.aulas + "] ]";
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	@Override
	public boolean equals(Object obj) {
		Aluno outroAluno = (Aluno) obj;
		return this.nome.equals(outroAluno.getNome());
	}

	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

	public void matricula(Aluno aluno) {
		// adiciona no Set de alunos
		this.alunos.add(aluno);
		// cria a relação no Map
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Aluno buscaMatriculado(int numero) {
	    return this.matriculaParaAluno.get(numero);
	}

}
