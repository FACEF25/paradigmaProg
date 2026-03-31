public class ItemPedido {

    // OBJETO PARTE(COMPOSIÇÃO) RELAÇÃO DE DEPENDENCIA DO OBJETO TUDO
    private int id, qtde;
    private Produto produto;

    public ItemPedido(){

    }
    public ItemPedido(int id, int qtde, Produto produto){
        this.id = id;
        this.qtde = qtde;
        this.produto = produto;
    }

    public int getId(){
        return id;
    }

    public int getQtde(){
        return qtde;
    }


    public Produto getProduto() {
        return produto;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setQtde(int qtde){
        this.qtde = qtde;
    }

    public void setProduto(Produto produto){
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "id=" + id +
                ", qtde=" + qtde +
                ", produto=" + produto +
                '}';
    }
}
