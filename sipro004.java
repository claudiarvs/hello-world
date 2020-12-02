// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class sipro004 {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		final int N=50 ;
		final int M=40 ;
		int A[][] = new int[N][M],F1[] = new int[M],k,i,j,w,x,y,soma=0,somael=0,aux;
		System.out.print( "k = ");
		k = teclado1.nextInt();
		System.out.print( "\nw = ");
		w = teclado1.nextInt();
		LeMatriz( A,k,w);
		for (i=0;i<k;i++){
			for (j=0;j<w;j++){
				if (A[i][j]==0){
					soma = soma+1;
				}
			}
		}
		System.out.print( "\nx = ");
		x = teclado1.nextInt();
		System.out.print( "\ny = ");
		y = teclado1.nextInt();
		for (i=0;i<k;i++){
			F1[i] = 3*A[i][y];
		}
		for (j=0;j<w;j++){
			if (j>=y){
				somael = somael+A[x][j];
			}
		}
		System.out.print( "\nNulos: "+soma);
		System.out.print( "\nSoma: "+somael);
		System.out.print( "\nElemento "+x+","+y+": "+A[x][y]);
		System.out.print( "\nF1 invertido: ");
		for (i=0;i<k/2;i++){
			aux = F1[i];
			F1[i] = F1[k-i-1];
			F1[k-i-1] = aux;
		}
		for (i=0;i<k;i++){
			System.out.print( F1[i]+";");
		}
	}
	//-----------------------------
	public static void LeMatriz(int M[ ][ ], int k, int w) {
		int i,j,soma=0;
		for (i=0;i<k;i++){
			System.out.print( "\n");
			for (j=0;j<w;j++){
				System.out.print( "\nDigite um numero : ");
				M[i][j] = teclado1.nextInt();
			}
		}
	}
}

//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
