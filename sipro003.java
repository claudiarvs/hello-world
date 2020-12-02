// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class sipro003 {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		final int MAX=50 ;
		int w,F1[] = new int[MAX],F2[] = new int[MAX],i,j,k,metade;
		System.out.print( "w = ");
		w = FValidaDimensao( 4,MAX);
		for (i=0;i<w;i++){
			F1[i] = teclado1.nextInt();
		}
		System.out.print( "\nk = ");
		k = teclado1.nextInt();
		metade = w/2;
		for (j=0;j<w;j++){
			if (j<metade){
				F2[j] = 9;
			}
			else if (j>=metade){
				if (k%3==0){
					F2[j] = F1[j];
				}
				else {
					F2[j] = 4*F1[j];
				}
			}
		}
		System.out.print( "\nÃšltimo F1: "+F1[w-1]);
		System.out.print( "\n");
		System.out.print( "\nF2: ");
		FImprimeVetor( F2,w);
	}
	//--------------------
	public static int FValidaDimensao(int minimo, int maximo) {
		int k;
		k = teclado1.nextInt();
		if (k<minimo || k>maximo){
			do {
				System.out.print( "\nValor deve estar entre "+ minimo+ " e "+maximo+ ". Redigite: ");
				k = teclado1.nextInt();
			} while(k<minimo || k>maximo);
		}
		return k;
	}
	//--------------------------------
	public static void FImprimeVetor(int Vet[ ], int w) {
		int j;
		for (j=0;j<w;j++){
			System.out.print( Vet[j]+";");
		}
	}
}

//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
