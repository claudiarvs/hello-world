// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class s04ativ20 {
	//Declarando 'fora do main' para que possa ser acessado em outro m�dulos 
	//Declarando buffer de entrada de dados para N�MEROS (inclus�o autom�tica) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instru��o abaixo obriga o programa a rodar com configura��o de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		int razao,ptermo,qtdtermos,a,n;
		System.out.print( "Primeiro termo: ");
		ptermo = teclado1.nextInt();
		System.out.print( "Razão: ");
		razao = teclado1.nextInt();
		System.out.print( "Quantidade de termos: ");
		qtdtermos = teclado1.nextInt();
		System.out.print( ptermo+ "; ");
		n = 1;
		while (n<qtdtermos){
			a = ptermo+razao;
			System.out.print( a+"; ");
			ptermo = a;
			n = n+1;
		}
	}
}

//Aten��o: Este conversor est� sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se h� erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endenta��o) do programa gerado
