// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class sipro001 {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		final int N=50 ;
		int F[] = new int[N],F1[] = new int[N],F2[] = new int[N],F3[] = new int[N],k,i,j,a,soma1=0,soma2=0,soma3=0;
		k = FValidaDimensao( 4,N);
		for (i=0;i<k;i++){
			F[i] = teclado1.nextInt();
		}
		for (j=0;j<k;j++){
			a = F[j];
			if (a==0 || a<0){
				soma1 = soma1+1;
				F1[j] = a;
				F2[j] = 0;
				F3[j] = 0;
			}
			else if (a%2==0){
				soma2 = soma2+1;
				F1[j] = 0;
				F2[j] = a;
				F3[j] = 0;
			}
			else {
				soma3 = soma3+1;
				F1[j] = 0;
				F2[j] = 0;
				F3[j] = a;
			}
		}
		System.out.print( "F1 = ");
		for (j=0;j<k;j++){
			System.out.print( F1[j]+";");
		}
		System.out.print( "quantidade: "+soma1);
		System.out.print( "\nF2 = ");
		for (j=0;j<k;j++){
			System.out.print( F2[j]+";");
		}
		System.out.print( "quantidade: "+soma2);
		System.out.print( "\nF3 = ");
		for (j=0;j<k;j++){
			System.out.print( F3[j]+";");
		}
		System.out.print( "quantidade: "+soma3);
	}
	//------------------------------------------------------
	public static int FValidaDimensao(int minimo, int maximo) {
		int n;
		do {
			System.out.print( "\nDigite a Dimensao entre "+ minimo+ " e "+maximo+ ": ");
			n = teclado1.nextInt();
		} while(n<minimo || n>maximo);
		return n;
	}
}

//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
