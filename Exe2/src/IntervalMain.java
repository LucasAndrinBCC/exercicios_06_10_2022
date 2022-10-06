import java.util.Scanner;

/**
 * 
 * @author Lucas Andrin
 * 
 * Faça um programa que mostre os números que constam no intervalo entre
 * dois números que serão informados, se o usuário entrar com os valores em
 * ordem inversa o programa deve fazer dar um aviso ao usuário que irá fazer
 * a inversão.
 */
public class IntervalMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		int first = input.nextInt();
		System.out.print("Informe o segundo número: ");
		int second = input.nextInt();
		
		Interval interval = new Interval(first, second);
		
		if (interval.isInversed()) {
			System.out.println("Valores foram invertidos!");
		}
		
		System.out.println(interval.arrayIntervalToString());
		
		input.close();
	}

}
