import java.util.Scanner;
public class SalarioMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Entre com o salário por hora: ");
		float salarioHora = input.nextFloat();
		System.out.print("Entre com as horas trabalhadas no mês: ");
		float horasTrabalhadasMes = input.nextFloat();
		
		Salario salario = new Salario(salarioHora, horasTrabalhadasMes);
		
		System.out.print("+ Salario Bruto: R$");
		System.out.println(salario.getSalarioBruto());
		System.out.print("- IR: R$");
		System.out.println(salario.getIr());
		System.out.print("- INSS: R$");
		System.out.println(salario.getInss());
		System.out.print("- Sindicato: R$");
		System.out.println(salario.getSindicato());
		System.out.print("= Salário Liquido: R$");
		System.out.println(salario.getSalarioLiquido());
		
		input.close();
	}
}
