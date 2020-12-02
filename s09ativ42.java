// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class s09ativ42 {
	//Declarando 'fora do main' para que possa ser acessado em outro m�dulos 
	//Declarando buffer de entrada de dados para N�MEROS (inclus�o autom�tica) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instru��o abaixo obriga o programa a rodar com configura��o de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		int C[] = new int[100],n,min,max,x,indice;
		n = FValidaTamanho( 0,100);
		FLeVetor( C,n);
		x = teclado1.nextInt();
		indice = FBuscaInt( C,n,x);
		if (indice!=-1){
			System.out.print( x+" consta no indice "+indice);
		}
		else {
			System.out.print( x+" nao consta");
		}
	}
	// modulo que valida o tamanho do vetor
	public static int FValidaTamanho(int minimo, int maximo) {
		int n;
		do {
			System.out.print( "\nDigite o tamanho entre "+ minimo+ " e "+maximo+ ": ");
			n = teclado1.nextInt();
		} while(n<minimo || n>maximo);
		return n;
	}
	// Le os elementos do vetor
	public static void FLeVetor(int V[ ], int n) {
		int i;
		for (i=0;i<n;i++){
			V[i] = teclado1.nextInt();
		}
	}
	// Pesquisa um elemento “x” no vetor retornando sua posição ( ou -1)
	public static int FBuscaInt(int V[ ], int n, int x) {
		int i,pos;
		for (i=0;i<n;i++){
			if (V[i]==x){
				pos = i;
				return pos;
			}
		}
		else {
			pos = -1;
			return pos;
		}
	}
}

//Aten��o: Este conversor est� sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se h� erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endenta��o) do programa gerado
