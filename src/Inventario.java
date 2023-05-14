import java.util.ArrayList;
import java.util.List;

public class Inventario {
	private List<Servico> inventario = new ArrayList<>();
	
	public void adicionaItem(Servico s) {
		inventario.add(s);
		s.setCodigo(inventario.indexOf(s));
	}
	
	public void listarItens() {
		for(Servico s : inventario) {
			System.out.println(s);
		}
	}
}
