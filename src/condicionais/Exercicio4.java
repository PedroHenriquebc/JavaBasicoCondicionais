package condicionais;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 Fa�a um programa que pede duas notas de um aluno. Em seguida ele deve calcular a 
		 m�dia do aluno e dar o seguinte resultado:
  		 A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
  		 A mensagem "Reprovado", se a m�dia for menor do que sete;
  		 A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez. 
		 */
		
		Scanner sc = new Scanner(System.in);
		double media;
		System.out.println("Digite a nota 1: ");
		double n1 = sc.nextDouble();
		System.out.println("Digite a nota 2: ");
		double n2 = sc.nextDouble();
		
		media = (n1 + n2) / 2;
		
		if (media >= 7.0) {
			System.out.println("Aprovado, sua m�dia foi: " + media);
		} else if (media == 10.0) {
			System.out.println("Aprovado com distin��o, sua m�dia foi: " + media);
		} else {
			System.out.println("Reprovado, sua m�dia foi: " + media);
		}
		
		sc.close();
	}

}
