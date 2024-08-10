package exercicios;
import java.util.*;

class SomaDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Digite um numero: ");
		int num1 = sc.nextInt();
		System.out.println("Digite outro numero: ");
		int num2 = sc.nextInt();
		int soma = num1 + num2;
		System.out.println("A soma eh: " + soma);
	}
}
