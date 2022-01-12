import java.util.ArrayList;
import java.util.List;

public class OrdenaStrings {
	public static void main(String[] args) {
		// Criando a lista de strings e adcionando itens
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");

		//Substituindo os ifs pelo método compare da class Integer que faz a mesma função de devolver positivo, negativo ou zero
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		System.out.println(palavras);

		// Passo 1 - Criando e instanciando uma class anonima e passando ela por parametro para o método forEach de palavras
		// Passo 2 - Como o forEach já sabe que ele irá receber um consumer e sabe que este consumer só tem 1 método para 
		// implementar, posso usar uma expresão lambda para deixar o código mais enxuto
		// Expressão lambda - Como só tem 1 parametro não preciso informar o tipo e nem colocar os parenteses
		palavras.forEach(s -> System.out.println(s));
	}
}