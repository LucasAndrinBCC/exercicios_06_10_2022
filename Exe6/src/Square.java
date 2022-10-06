/**
 * 
 * @author Lucas Andrin
 *
 * Crie uma classe que modele um quadrado:
 * Atributos: Tamanho do lado
 * Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área;
 */
public class Square {
	private float size;
	
	Square(float size) {
		setSize(size);
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}
	
	public float getArea() {
		return size * size;
	}
}
