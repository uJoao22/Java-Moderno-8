import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {

		//Criando a lista de strings e adcionando itens
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casad o código");
		palavras.add("caelum");

		//Instancianco a class ComparadorPorTamanho
//		Comparator<String> comparator = new ComparadorPorTamanho();
		
		//Usando o Collections para ordenar as strings, forma antiga
		//Collections.sort(palavras, comparator);
		
		palavras.sort(new ComparadorPorTamanho()); //JAVA 8
		
		System.out.println(palavras);

		//Forma antiga de iterar a lista
//		for (String p : palavras) {
//			System.out.println(p);
//		}
		
//		Consumer<String> consumidor = new ImprimenaNaLinha();
		palavras.forEach(new ImprimenaNaLinha());
		
	}

}

//JAVA 8
class ImprimenaNaLinha implements Consumer<String>{
	@Override
	public void accept(String s) {
		System.out.println(s);
	}
}

//Criando a class do comparador
class ComparadorPorTamanho implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length())
			return -1;
		
		if(s1.length() > s2.length())
			return 1;
			
		return 0;
	}
}