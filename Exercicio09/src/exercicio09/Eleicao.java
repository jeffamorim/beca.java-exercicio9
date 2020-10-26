package exercicio09;
import java.util.Scanner;

public class Eleicao {

	public int totaleleitores;
	public int validos;
	public int brancos;
	public int nulos;
	public int totalvalidos;
	public int totalnulos;
	public int totalbrancos;
	
	public void obterDados() {
		System.out.println("Digite o total de eleitores");
		totaleleitores = new Scanner(System.in).nextInt();
		
		System.out.println("Digite o total de votos validos");
		validos = new Scanner(System.in).nextInt();
		
		System.out.println("Digite o total de votos nulos");
		nulos = new Scanner(System.in).nextInt();
		
		System.out.println("Digite o total de votos brancos");
		brancos = new Scanner(System.in).nextInt();
	}
	
	public void percentual() {
		
		totalvalidos = (validos / totaleleitores) * 100;
		
		totalnulos = (nulos / totaleleitores) * 100;
		
		totalbrancos = (brancos / totaleleitores) * 100;
		
		
		System.out.println("total de votos validos" +validos + "%");
		System.out.println("total de votos nulos" +nulos + "%");
		System.out.println("total de votos brancos" +brancos + "%");
	}
}
