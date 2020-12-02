// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class prova2q1 {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		final int MAX=50 ;
		int T1[] = new int[MAX],C1[] = new int[MAX],i,j,y,x,z,temp=0;
		System.out.print( "y = ");
		y = teclado1.nextInt();
		for (i=0;i<y;i++){
			System.out.print( "\nTempo: ");
			T1[i] = teclado1.nextInt();
			x = FValidaCateg( 1,5);
			C1[i] = x;
		}
		System.out.print( "\nDigite a categoria a pesquisar (  1 a 5) ou o digite -1 para encerrar: ");
		z = teclado1.nextInt();
		while (z!=-1){
			for (i=0;i<y;i++){
				if (z==C1[i]){
					System.out.print( "\nCategoria: "+z);
					System.out.print( "\nMÃºsica: "+i);
					System.out.print( " Tempo: "+T1[i]);
					System.out.print( "\nTempo Medio: ");
					System.out.print( "\nDigite a categoria a pesquisar (  1 a 5) ou o digite -1 para encerrar: ");
					z = teclado1.nextInt();
				}
				else {
					System.out.print( "\nCategoria sem musicas cadastradas!");
					z = teclado1.nextInt();
				}
			}
		}
	}
	public static int FValidaCateg(int minimo, int maximo ) {
		int categ;
		System.out.print( "\nCategoria: ");
		categ = teclado1.nextInt();
		if (categ<minimo || categ>maximo){
			do {
				System.out.print( "\nErro! Valor deve estar entre "+ minimo+ " e "+maximo+ ". Redigite: ");
				categ = teclado1.nextInt();
			} while(categ<minimo || categ>maximo);
		}
		return categ;
	}
	//-----------------------------------------------
}

//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
