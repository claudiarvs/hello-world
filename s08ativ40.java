// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class s08ativ40 {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		//declarando matrizes;
		int A[][] = new int[3][3];
		int B[][] = new int[4][4];
		int k1=0,k2=0,soma1=0,soma2=0;
		//chama a funÃ§Ã£o para ler a matriz A;
		LeMatriz( A, 3);
		//chama a funÃ§Ã£o para ler a matriz B;
		LeMatriz( B, 4);
		//chama a funÃ§Ã£o para imprimir a matriz A;
		ImprimeMatriz( A, 3);
		//chama a funÃ§Ã£o para imprimir a matriz B;
		ImprimeMatriz( B, 4);
		// VocÃª deve escrever abaixo a parte que solicita o valor de "k1 e k2"
		System.out.print( "k1 = ");
		k1 = teclado1.nextInt();
		System.out.print( "\nk2 = ");
		k2 = teclado1.nextInt();
		soma1 = SomaElementosColuna( A,3, k1);
		soma2 = SomaElementosColuna( B,4, k2);
		System.out.print( "\nSoma da coluna " + k1 + " de A = "+ soma1);
		System.out.print( "\nSoma da coluna " + k2 + " de B = "+ soma2);
	}
	// ------------
	public static void LeMatriz(int M[ ][ ], int n) {
		int i,j;
		for (i=0;i<n;i++){
			System.out.print( "\n");
			for (j=0;j<n;j++){
				M[i][j] = teclado1.nextInt();
			}
		}
	}
	// ------------
	public static void ImprimeMatriz(int M[ ][ ], int n) {
		int i,j;
		for (i=0;i<n;i++){
			System.out.print( "\n");
			for (j=0;j<n;j++){
				System.out.print( M[i][j]+";");
			}
		}
		System.out.print( "\n");
	}
	// ------------
	public static int SomaElementosColuna(int M[ ][ ], int n, int k) {
		int soma=0;
		int i;
		for (i=0;i<n;i++){
			System.out.print( "\n");
			soma = soma+M[i][k-1];
		}
		return soma;
	}
}

//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
