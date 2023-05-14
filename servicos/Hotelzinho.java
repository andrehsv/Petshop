public class Hotelzinho extends Servico {
	private int qtdHoras;

	public Hotelzinho(char tamanho, int qtdHoras) {
		super(tamanho);
		this.qtdHoras = qtdHoras;
		setPreco(calculaPreco());
	}

	public int getQtdHoras() {
		return qtdHoras;
	}

	public void setQtdHoras(int qtdHoras) {
		this.qtdHoras = qtdHoras;
	}

	@Override
	public double calculaPreco() {
		double precoTotal = 0;
		double precoP = 12,
				precoM = 18,
				precoG = 25;
		
		switch(getTamanho()) {
		case 'P':
			precoTotal = precoP * qtdHoras;
			break;
		case 'M':
			precoTotal = precoM * qtdHoras;
			break;
		case 'G':
			precoTotal = precoG * qtdHoras;
			break;
		}
		
		return precoTotal;
	}

	@Override
	public String toString() {
		return "Hotelzinho [qtdHoras=" + qtdHoras + ", codigo=" + getCodigo() + ", data=" + getData() + ", tamanho=" + getTamanho()
				+ ", preco=" + getPreco() + "]";
	}

}
