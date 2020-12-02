// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class s03ativ16 {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		int N,valores,menorId,a,idade,idadeF;
		System.out.print( "N: ");
		N = teclado1.nextInt();
		menorId = 0;
		System.out.print( "Digite a idade: ");
		idadeF = teclado1.nextInt();
		for (a=1;a<N;a=a+1){
			System.out.print( "Digite a idade: ");
			idade = teclado1.nextInt();
			while (idade<0){
				System.out.print( "\nErro: Redigite idade!");
				idade = teclado1.nextInt();
			}
			if (idade<idadeF){
				idadeF = idade;
			}
		}
		System.out.print( "Menor idade = "+idadeF);
	}
}

//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
