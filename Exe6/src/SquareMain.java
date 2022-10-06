import java.util.Scanner;

public class SquareMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		
		System.out.print("Informe o lado do quadrado: ");
		float size = input.nextFloat();
		
		Square square = new Square(size);
		builder.append("Size: ");
		builder.append(square.getSize());
		builder.append(System.getProperty("line.separator"));
		builder.append("Area: ");
		builder.append(square.getArea());
		
		System.out.println(builder.toString());
		
		input.close();
	}

}
