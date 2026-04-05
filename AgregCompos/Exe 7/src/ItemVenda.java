public class ItemVenda {
    private int id, quantidade;
    private Produto produto; // Agregação dentro da composição

    public ItemVenda(int id, int quantidade, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public double calcularSubtotal() {
        return quantidade * produto.getPreco();
    }
}
