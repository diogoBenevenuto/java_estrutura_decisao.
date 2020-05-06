package exercico_condiconal;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int num1 = 0;
			int num2 = 0;
			
			int soma = num1+num2;
		
			Scanner leitor = new Scanner (System.in);
			
				System.out.println("digite um numero: ");
				num1 = leitor.nextInt();
				
				System.out.println("digite um numero: ");
				num2 = leitor.nextInt();
				 
				soma = num1 + num2;
			
			if (soma > 10)
				System.out.println("soma: " +soma);
			
			
			
		}

}
