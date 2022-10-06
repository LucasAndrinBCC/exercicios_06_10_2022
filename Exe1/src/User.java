
public class User {
	private String nome;
	private String sobrenome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length() > 0) {
			this.nome = nome;
		}
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		if (sobrenome.length() > 0) {
			this.sobrenome = sobrenome;
		}
	}
	
	public String nomeCompleto() {
		StringBuilder saida = new StringBuilder();
		saida.append(nome);
		saida.append(" ");
		saida.append(sobrenome);
		return saida.toString();
	}
	
	@Override
	public String toString() {
		return "User [nome=" + nome + ", sobrenome=" + sobrenome + "]";
	}
}
