import java.util.ArrayList;

public class Venda {
    private int id;
    private Cliente cliente; // Agregação
    private ArrayList<ItemVenda> itens; // Composição

    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    // Método para compor a venda com novos itens
    public void adicionarItem(int idItem, int qtd, Produto p) {
        ItemVenda novoItem = new ItemVenda(idItem, qtd, p);
        this.itens.add(novoItem);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemVenda item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }
}