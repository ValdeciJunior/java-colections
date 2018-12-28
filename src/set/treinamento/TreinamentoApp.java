package set.treinamento;

import java.util.HashSet;
import java.util.Set;

public class TreinamentoApp {
	
	public static void main(String[] args) {
		Curso java8 = new Curso("Java8");
		Curso oracle12c = new Curso("oracle12c");
		
		Set<Curso> cursosA = new HashSet<>();
		Set<Curso> cursosB = new HashSet<>();
		
		cursosA.add(java8);
		cursosA.add(oracle12c);
		cursosB.add(java8);
		
		//interseção
		cursosA.retainAll(cursosB);
		System.out.println("A interceção B");
		System.out.println(cursosA);
		
		Cliente a = new Cliente();
		a.setCursos(cursosA);
		Cliente b = new Cliente();
		b.setCursos(cursosB);
		
	}

}
