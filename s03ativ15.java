// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class s03ativ15 {
	//Declarando 'fora do main' para que possa ser acessado em outro m�dulos 
	//Declarando buffer de entrada de dados para N�MEROS (inclus�o autom�tica) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instru��o abaixo obriga o programa a rodar com configura��o de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		int N,valores,qtdNulos,qtdD3,qtdND3,qtdValores,a;
		System.out.print( "N: ");
		N = teclado1.nextInt();
		qtdNulos = 0;
		qtdD3 = 0;
		qtdND3 = 0;
		for (a=1;a<=N;a=a+1){
			System.out.print( "\nValores: ");
			valores = teclado1.nextInt();
			if (valores<0){
				qtdNulos = qtdNulos+1;
			}
			else if (valores%3==0){
				qtdD3 = qtdD3+1;
			}
			else {
				qtdND3 = qtdND3+1;
			}
		}
		System.out.print( "\nNulos= "+qtdNulos);
		System.out.print( "\nDivisiveis por 3= "+qtdD3);
		System.out.print( "\nNao divisiveis por 3= "+qtdND3);
	}
}

//Aten��o: Este conversor est� sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se h� erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endenta��o) do programa gerado
