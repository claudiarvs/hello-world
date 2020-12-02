// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class s02ativ09 {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		int votosA,votosB,votosC,vagas,quocienteEleitoral,quocientePartidario,totalvv,qpA,qpB,qpC;
		System.out.print( "Votos Partido A = ");
		votosA = teclado1.nextInt();
		System.out.print( "Votos Partido B = ");
		votosB = teclado1.nextInt();
		System.out.print( "Votos Partido C = ");
		votosC = teclado1.nextInt();
		System.out.print( "Vagas = ");
		vagas = teclado1.nextInt();
		totalvv = ( votosA+votosB+votosC);
		quocienteEleitoral  =  totalvv/vagas;
		System.out.print( "Quociente Eleitoral = "+ quocienteEleitoral);
		qpA = ( votosA/quocienteEleitoral);
		qpB = ( votosB/quocienteEleitoral);
		qpC = ( votosC/quocienteEleitoral);
		if (qpA==0){
			System.out.print( " Ha partido com Quociente Partidario igual a zero!");
		}
		if (qpB==0){
			System.out.print( " Ha partido com Quociente Partidario igual a zero!");
		}
		if (qpC==0){
			System.out.print( " Ha partido com Quociente Partidario igual a zero!");
		}
		else {
			System.out.print( " Nenhum partido obteve Quociente Partidario igual a zero.");
		}
	}
}

//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
