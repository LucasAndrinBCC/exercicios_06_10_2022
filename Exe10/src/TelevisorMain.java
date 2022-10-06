import java.util.Scanner;

public class TelevisorMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Televisor tv = new Televisor();
		
		System.out.println(tv.toString());
		
		System.out.println("Aumentando volume: ");
		for (int i = 0; i < 11; i++) {
			System.out.println(tv.aumentarVolume());
		}
		
		System.out.println("Diminuindo volume: ");
		for (int i = 0; i < 11; i++) {
			System.out.println(tv.diminuirVolume());
		}
		
		System.out.println("Alterando canal: ");
		for (int i = 0; i < 11; i++) {
			System.out.println(tv.alterarCanal(i));
		}
		
		input.close();
	}

}
