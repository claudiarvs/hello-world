// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class s01ativ04 {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		double p1,p2,t1,t2,Media;
		System.out.print( "Digite o valor da p1: " );
		p1 = teclado1.nextDouble();
		System.out.print( "Digite o valor da p2: ");
		p2 = teclado1.nextDouble();
		System.out.print( "Digite o valor do t1: ");
		t1 = teclado1.nextDouble();
		System.out.print( "Digite o valor do t2: ");
		t2 = teclado1.nextDouble();
		Media = ( ( p1*30) + ( p2*40) + ( t1*10) + ( t2*20))/ 100;
		System.out.print( "O valor da mÃ©dia Ã©: "+ Media);
	}
}

//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
