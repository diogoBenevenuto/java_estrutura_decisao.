package exercico_condiconal;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num; 
		
		Scanner leitor = new Scanner (System.in); 
		
		System.out.println("Digite um numero inteiro: ");
		num = leitor.nextInt();
		
		
		if (num > 10)
			System.out.println("numero par");
		
		else if (num < 10)
			System.out.println("numero impar");
		
		
	}

}
