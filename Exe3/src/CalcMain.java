import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 * Faça um programa que tenha uma função para calcular as quatro operações
 * básicas de 2 números;
 */
public class CalcMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int first = input.nextInt();
		
		System.out.print("Informe um número: ");
		int second = input.nextInt();
		
		Calc calc = new Calc(first, second);
		
		System.out.println(calc.division());
		
		input.close();
	}

}
