package br.com.alura;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestandoIterator {

	public static void main(String[] args) {
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");

//		letras.forEach(letra -> {
//		    System.out.println(letra);
//		});
		
		Iterator<String> letra = letras.iterator();
		
		while(letra.hasNext()) {
			System.out.println(letra.next());
		}
		
		

	}

}
