// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class prova2q2 {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		final int N=40 ;
		final int M=30 ;
		int T[][] = new int[N][M],y,z,w,i,j,valor=0,quant=0,med=0;
		System.out.print( "y = ");
		y = teclado1.nextInt();
		System.out.print( "\nz = ");
		z = teclado1.nextInt();
		for (i=0;i<y;i++){
			System.out.print( "\n");
			for (j=0;j<z;j++){
				T[i][j] = -3;
			}
		}
		char continua;
		for (i=0;i<y;i++){
			System.out.print( "\nDigite uma nota ou -3 : ");
			j = 0;;
			continua  =  'S';
			while (j<z && continua=='S'){
				System.out.print( "\nDigite a nota ou -3 : ");
				T[i][j] = teclado1.nextInt();
				quant = quant+1;
				med= ( med+T[i][j])/i;
				if (med<=2.0){
					System.out.print( med+" (  reputacao baixa)");
				}
				if (T[i][j]==-3){
					continua  =  'N';
				}
				j++;
			}
		}
		System.out.print( "\nw = ");
		w = teclado1.nextInt();
		System.out.print( "\nAvaliacoes filme "+w+": ");
		for (j=0;j<z;j++){
			System.out.print( T[w][j]);
		}
		for (i=0;i<y-1;i++){
			if (T[w][i]!=-3){
				valor = T[w][i+1]-T[w][i];
				System.out.print( " (  "+valor+")");
			}
			else {
				System.out.print( "\nSem Avaliacao!");
			}
		}
		for (i=0;i<y;i++){
			for (j=0;j<z;j++){
				System.out.print( "\nFilme: "+i);
				System.out.print( " Notas: "+quant);
				System.out.print( " Media: "+med);
			}
		}
	}
	//RA:11201920696, CLAUDIA REGINA VIEIRA SILVEIRA;
}

//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
