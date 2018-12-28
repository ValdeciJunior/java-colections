package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ArrayListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<>();
		lista.add("vermelho");
		lista.add("verde");
		lista.add("verde");
		lista.add("amarelo");
		Collections.sort(lista);
		System.out.println(lista);

	}

}
