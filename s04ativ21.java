// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class s04ativ21 {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		double peso,alt,imc;
		System.out.print( "Peso: ");
		peso = teclado1.nextDouble();
		System.out.print( "Altura: ");
		alt = teclado1.nextDouble();
		imc = peso/( alt*alt);
		System.out.print( "IMC = "+imc);
		if (imc<18.5){
			System.out.print( "\nAbaixo do peso ideal");
		}
		else if (imc>=18.5 && imc<=24.9){
			System.out.print( "\nNo peso ideal");
		}
		else if (imc>24.9 && imc<=29.9){
			System.out.print( "\nAcima do peso ideal");
		}
		else if (imc>29.9 && imc<=34.9){
			System.out.print( "\nObesidade grau I");
		}
		else if (imc>34.9 && imc<=39.9){
			System.out.print( "\nObesidade grau II");
		}
		else {
			System.out.print( "\nObesidade grau III");
		}
	}
}

//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
