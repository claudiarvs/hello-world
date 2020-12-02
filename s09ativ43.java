// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class s09ativ43 {
	//Declarando 'fora do main' para que possa ser acessado em outro m�dulos 
	//Declarando buffer de entrada de dados para N�MEROS (inclus�o autom�tica) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instru��o abaixo obriga o programa a rodar com configura��o de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		final int MAX=50 ;
		int A[][] = new int[MAX][MAX];
		int n,x,y;
		// declare outras variaveis que precisar
		n = FValidaDimensao( 3,MAX);
		FLeMatriz( A,n);
		x = teclado1.nextInt();
		y = teclado1.nextInt();
		FImprimeVizinhos( A,n,x,y);
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
	public static void FLeMatriz(int M[ ][ ], int n) {
		int i,j;
		for (i=0;i<n;i++){
			System.out.print( "\n");
			for (j=0;j<n;j++){
				M[i][j] = teclado1.nextInt();
			}
		}
	}
	// Imprime os elementos vizinhos do elemento M[x][y]
	public static void FImprimeVizinhos(int M[ ][ ], int n , int x, int y) {
		//acima,esquerda,direita,abaixo;
		if (x==0 && y==0){
			System.out.print( M[x+1][y]+";");
			System.out.print( M[x][y+1]+";");
		}
		else if (x==0 && y==n-1){
			System.out.print( M[x+1][y]+";");
			System.out.print( M[x][y-1]+";");
		}
		else if (x==n-1 && y==0){
			System.out.print( M[x][y+1]+";");
			System.out.print( M[x-1][y]+";");
		}
		else if (x==n-1 && y==n-1){
			System.out.print( M[x-1][y]+";");
			System.out.print( M[x][y-1]+";");
		}
		else if (y==0 && x!=0 && x!=n-1){
			System.out.print( M[x+1][y]+";");
			System.out.print( M[x][y+1]+";");
			System.out.print( M[x-1][y]+";");
		}
		else if (y==n-1 && x!=0 && x!=n-1){
			System.out.print( M[x+1][y]+";");
			System.out.print( M[x-1][y]+";");
			System.out.print( M[x][y-1]+";");
		}
		else if (x==0 && y!=0 && y!=n-1){
			System.out.print( M[x][y-1]+";");
			System.out.print( M[x][y+1]+";");
			System.out.print( M[x+1][y]+";");
		}
		else if (x==n-1 && y!=0 && y!=n-1){
			System.out.print( M[x][y+1]+";");
			System.out.print( M[x][y-1]+";");
			System.out.print( M[x-1][y]+";");
		}
		else {
			System.out.print( M[x-1][y]+";");
			System.out.print( M[x][y-1]+";");
			System.out.print( M[x][y+1]+";");
			System.out.print( M[x+1][y]+";");
		}
	}
}

//Aten��o: Este conversor est� sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se h� erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endenta��o) do programa gerado
