
public class Tosa extends Servico {

	public Tosa(char tamanho) {
		super(tamanho);
		setPreco(calculaPreco());
	}

	@Override
	public double calculaPreco() {
		double precoTotal = 0;
		double precoP = 22,
				precoM = 30,
				precoG = 40;
		
		switch(getTamanho()) {
		case 'P':
			precoTotal = precoP;
			break;
		case 'M':
			precoTotal = precoM;
			break;
		case 'G':
			precoTotal = precoG;
			break;
		}
		
		return precoTotal;
	}

	@Override
	public String toString() {
		return "Tosa [codigo=" + getCodigo() + ", data=" + getData() + ", tamanho=" + getTamanho() + ", preco=" + getPreco() + "]";
	}
}
