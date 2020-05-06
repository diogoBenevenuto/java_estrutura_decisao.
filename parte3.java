package exercico_condiconal;

import java.util.Scanner;

public class parte3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		Scanner leitor = new Scanner (System.in);
		
			System.out.println("Digite um numero: ");
			num = leitor.nextInt();
			
			if (num > 21 )
				System.out.println("positivo");
			
			if (num < 21 )
				System.out.println("negativo");
		
		
		
	}

}
