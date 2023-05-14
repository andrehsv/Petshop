import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Inventario i = new Inventario();
		String promptInicial = 
				"-----------\n" +
				"  PETSHOP  \n" +
				"-----------\n" +
				"<servico> <tamanho_do_animal> <tamanho_do_pelo> <qtd_horas>";
		Scanner sc = new Scanner(System.in);
		System.out.println(promptInicial);
		while(true) {
			String entrada = sc.nextLine();
			String[] entradaArray = entrada.split(" ");
			String servico = entradaArray[0];
			char tamanho = entradaArray[1].toUpperCase().charAt(0);
			String tamanhoPelo = entradaArray[2];
			int qtdHoras = Integer.parseInt(entradaArray[3]);
			
			switch(servico) {
			case "banho":
				Banho b = new Banho(tamanho, tamanhoPelo);
				i.adicionaItem(b);
				break;
			case "tosa":
				Tosa t = new Tosa(tamanho);
				i.adicionaItem(t);
				break;
			case "hotelzinho":
				Hotelzinho h = new Hotelzinho(tamanho, qtdHoras);
				i.adicionaItem(h);
				break;
			default:
				System.out.println("Erro");
				break;
			}
			
			i.listarItens();
		}
		
	}

}
