
public class Salario {
	public static final float IR = 0.11f;
	public static final float INSS = 0.08f;
	public static final float SINDICATO = 0.05f;
	
	private float salarioHora;
	private float horasTrabalhadasMes;
	
	public Salario(float salarioHora, float horasTrabalhadasMes) {
		setSalarioHora(salarioHora);
		setHorasTrabalhadasMes(horasTrabalhadasMes);
	}

	public float getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(float salarioHora) {
		if (salarioHora > 0) {
			this.salarioHora = salarioHora;
		}
	}

	public float getHorasTrabalhadasMes() {
		return horasTrabalhadasMes;
	}

	public void setHorasTrabalhadasMes(float horasTrabalhadasMes) {
		if (horasTrabalhadasMes >= 0) {
			this.horasTrabalhadasMes = horasTrabalhadasMes;
		}
	}
	
	public float getSalarioBruto() {
		return salarioHora * horasTrabalhadasMes;
	}
	
	public float getIr() {
		return getSalarioBruto() * IR;
	}
	
	public float getInss() {
		return getSalarioBruto() * INSS;
	}
	
	public float getSindicato() {
		return getSalarioBruto() * SINDICATO;
	}
	
	public float getDescontos() {
		return getIr() + getInss() + getSindicato();
	}
	
	public float getSalarioLiquido() {
		return getSalarioBruto() - getDescontos();
	}
}
