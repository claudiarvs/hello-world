// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class sipro002 {
	//Declarando 'fora do main' para que possa ser acessado em outro m�dulos 
	//Declarando buffer de entrada de dados para N�MEROS (inclus�o autom�tica) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instru��o abaixo obriga o programa a rodar com configura��o de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		int A[][] = new int[50][8],i,j,x,y,somatot=0,soma=0,n,m,valor=0;
		System.out.print( "n = ");
		n = teclado1.nextInt();
		m = 8;
		for (i=0;i<n;i++){
			System.out.print( "\n");
			for (j=0;j<m;j++){
				A[i][j] = teclado1.nextInt();
				somatot = somatot+A[i][j];
			}
		}
		for (i=0;i<n;i++){
			System.out.print( "\n");
			for (j=0;j<m;j++){
				System.out.print( A[i][j]+";");
			}
		}
		System.out.print( "\nSoma: "+somatot);
		System.out.print( "\nx = ");
		x = teclado1.nextInt();
		System.out.print( "Dif. Disciplina "+x+": ");
		for (i=0;i<n-1;i++){
			valor = A[i+1][x]-A[i][x];
			System.out.print( valor+";");
		}
		System.out.print( "\ny = ");
		y = teclado1.nextInt();
		for (j=0;j<m;j++){
			soma = soma+A[y][j];
		}
		System.out.print( "Soma das notas do estudante "+y+": "+soma);
	}
}

//Aten��o: Este conversor est� sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se h� erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endenta��o) do programa gerado
