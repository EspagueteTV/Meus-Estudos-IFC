package exercicios;

import java.util.Scanner;

public class Calculadora {
	
	Scanner teclado = new Scanner(System.in);

// ----- Atributos -----
	double parcela1;
	double parcela2;
	double soma;
	double diferenca;
	double produto;
	double quociente;
	
// ----- M�todos -----
	
	public void lerParcela1() {
		System.out.print("Digite o valor da 1� Parcela: ");
			parcela1 = teclado.nextDouble();
	}
	
	public void lerParcela2() {
		System.out.print("Digite o valor da 2� Parcela: ");
			parcela2 = teclado.nextDouble();
	}
	
	public void somar() {
		this.soma = parcela1 + parcela2;
	}
	
	public void subtrair() {
		this.diferenca = parcela1 - parcela2;
	}
	
	public void multiplicar() {
		this.produto = parcela1 * parcela2;
	}
	
	public void dividir() {
		this.quociente = parcela1 / parcela2; 
	}
}