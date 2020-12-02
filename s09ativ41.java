// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class s09ativ41 {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		final int MAX=50 ;
		int A[][] = new int[MAX][MAX];
		int n;
		// declare outras variaveis que precisar
		n = FValidaDimensao( 3,MAX);
		// faca as chamadas dos modulos conforme contexto do problema no enunciado
		LeMatriz( A,n);
		ImprimeDiagonalPrincipal( A,n);
		ImprimeParesBordasCol( A,n);
	}
	// modulo que valida a dimensao da matriz
	public static int FValidaDimensao(int minimo, int maximo) {
		int n;
		do {
			System.out.print( "\nDigite a Dimensao entre "+ minimo+ " e "+maximo+ ": ");
			n = teclado1.nextInt();
		} while(n<minimo || n>maximo);
		return n;
	}
	// Le os elementos da matriz
	public static void LeMatriz(int M[ ][ ], int n) {
		int i,j;
		for (i=0;i<n;i++){
			System.out.print( "\n");
			for (j=0;j<n;j++){
				M[i][j] = teclado1.nextInt();
			}
		}
	}
	// Imprime diagonal principal
	public static void ImprimeDiagonalPrincipal(int M[ ][ ], int n) {
		int i,j;
		for (i=0;i<n;i++){
			for (j=0;j<n;j++){
				if (i==j){
					System.out.print( M[i][j]+";");
				}
			}
		}
		System.out.print( "\n");
	}
	// Imprime elementos pares das colunas-bordas
	public static void ImprimeParesBordasCol(int M[ ][ ], int n) {
		int i,j;
		for (i=0;i<n;i++){
			for (j=0;j<n;j++){
				if (j==0){
					if (M[i][j]%2==0){
						System.out.print( M[i][j]+";");
					}
				}
			}
		}
		System.out.print( "\n");
		for (i=0;i<n;i++){
			for (j=0;j<n;j++){
				if (j==n-1){
					if (M[i][j]%2==0){
						System.out.print( M[i][j]+";");
					}
				}
			}
		}
	}
}

//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
