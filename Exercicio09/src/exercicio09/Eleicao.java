package exercicio09;
import java.util.Scanner;

public class Eleicao {
	
	public double TotalEleitores;
	public double Validos;
	public double Brancos;
	public double Nulos;
	
	
	public double PercentValidos() {
		return (Validos / TotalEleitores) * 100;
	}
	
	public double PercentBrancos() {
		return (Brancos / TotalEleitores) * 100;
	}
	
	public double PercentNulos() {
		return (Nulos / TotalEleitores) * 100;
	}

}