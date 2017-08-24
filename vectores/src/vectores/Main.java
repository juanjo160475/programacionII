package vectores;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> lista = new ArrayList<String>();
		lista.add("papel higienico");
		lista.add("leche");
		lista.add("cafe");
		lista.add("manteca");

		Iterator<String> it = lista.iterator();

		while (it.hasNext()) {
			String elem = it.next();
			if (elem.equals("manteca"))
				
				{it.remove();}

		}

		for (String elemento : lista) {

			System.out.println(elemento);
		}

	}

}
