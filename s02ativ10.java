// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class s02ativ10 {
	//Declarando 'fora do main' para que possa ser acessado em outro m�dulos 
	//Declarando buffer de entrada de dados para N�MEROS (inclus�o autom�tica) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instru��o abaixo obriga o programa a rodar com configura��o de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		double codigo,anoAtual,anoVencimento,anosValidade;
		System.out.print( "Código: ");
		codigo = teclado1.nextDouble();
		if (codigo==1){
			System.out.print( "ALIMENTO-NAO-PERECIVEL");
		}
		else {
			if (codigo==2 || codigo==3){
				System.out.print( "ALIMENTO PERECIVEL");
				System.out.print( " Digite o ano atual: ");
				anoAtual = teclado1.nextDouble();
				System.out.print( "Digite o ano de Vencimento: ");
				anoVencimento = teclado1.nextDouble();
				anosValidade = ( anoVencimento - anoAtual);
				System.out.print( "ANOS DE VALIDADE: "+ anosValidade);
			}
			else {
				if (codigo>=4 && codigo<=9){
					System.out.print( "VESTUARIO");
				}
				else {
					System.out.print( "INVALIDO");
				}
			}
		}
	}
}

//Aten��o: Este conversor est� sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se h� erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endenta��o) do programa gerado
