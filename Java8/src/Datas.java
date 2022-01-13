import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		//Usando a API de Datas do JAVA 8
		
		//Criando uma variavel com a data de hoje
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		//Atribuindo a uma variavel um objeto data, com uma data determinada
		LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
		
		//Calculando quantos anos se passaram desde as olimpiadas do rio
		int anos = hoje.getYear() - olimpiadasRio.getYear();
		System.out.println(anos);
		
		//Calculando o periodo, o tempo que já se passou desde as olimpiadas do rio, usando a class Period
		Period  periodo = Period.between(olimpiadasRio, hoje);
		//Imprimindo o tempo que já se passou, em anos, meses e dias
		System.out.println("Já se passaram "+periodo.getYears()+" anos, "+periodo.getMonths()+" meses e "+periodo.getDays()+" dias desde as olimpidas do rio.");
	
		//Adcionando mais 4 anos na data da olimpiada do rio, para saber em que ano foi a olimpiada seguinte
		LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
		System.out.println(proximasOlimpiadas);
		
		//Criando um formatador de datas e determinando o padrão que será formatado
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		//Formatando a data da proxima olimpiada, para o padrão que determinei no formatador
		String valorFormatado = proximasOlimpiadas.format(formatador);
		System.out.println(valorFormatado);
		
		//Criando formatador especifico para ter hora e minuto
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
				
		//Usando a class LocalDateTime para pegar a data, hora, minuto e segundo, pois o LocalDate pega apenas data
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		//Criando uma variavel com uma hora e minuto especificos
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);
	}
}