import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Servico {
	private int codigo;
	private String data;
	private char tamanho;
	private double preco;
	
	public Servico(char tamanho) {
		data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		this.tamanho = tamanho;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public char getTamanho() {
		return tamanho;
	}

	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public abstract double calculaPreco();
	
}
