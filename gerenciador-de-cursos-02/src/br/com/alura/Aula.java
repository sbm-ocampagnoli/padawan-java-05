package br.com.alura;

public class Aula implements Comparable<Aula> {

	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}

	private String titulo;
	private int tempo;

	public int getTempo() {
		return tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
	}
	
	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.getTitulo());
	}

}
