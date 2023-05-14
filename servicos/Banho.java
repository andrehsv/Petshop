
public class Banho extends Servico {
	private String tamanhoPelo;
	
	public Banho(char tamanho, String tamanhoPelo) {
		super(tamanho);
		this.tamanhoPelo = tamanhoPelo;
		setPreco(calculaPreco());
	}
	
	public String getTamanhoPelo() {
		return tamanhoPelo;
	}

	public void setTamanhoPelo(String tamanhoPelo) {
		this.tamanhoPelo = tamanhoPelo;
	}
	
	@Override
	public double calculaPreco() {
		double precoTotal = 0;
		double precoP = 20,
				precoM = 30,
				precoG = 40;
		
		switch(getTamanho()) {
		case 'P':
			switch(getTamanhoPelo()) {
			case "curto":
				precoTotal = precoP;
				break;
			case "medio":
				precoTotal = precoP + 10;
				break;
			case "grande":
				precoTotal = precoP + 20;
				break;
			}
			break;
		case 'M':
			switch(getTamanhoPelo()) {
			case "curto":
				precoTotal = precoM;
				break;
			case "medio":
				precoTotal = precoM + 10;
				break;
			case "grande":
				precoTotal = precoM + 20;
				break;
			}
			break;
		case 'G':
			switch(getTamanhoPelo()) {
			case "curto":
				precoTotal = precoG;
				break;
			case "medio":
				precoTotal = precoG + 10;
				break;
			case "grande":
				precoTotal = precoG + 20;
				break;
			}
			break;
		}
		
		return precoTotal;
	}

	@Override
	public String toString() {
		return "Banho [tamanhoPelo=" + tamanhoPelo + ", codigo=" + getCodigo() + ", data=" + getData() + ", tamanho=" + getTamanho()
				+ ", preco=" + getPreco() + "]";
	}

}
