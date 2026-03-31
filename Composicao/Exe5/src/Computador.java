public class Computador {
    private int id;
    private String marca;
    private Processador processador;
//  UM PROCESSADOR PRA UM COMPUTADOR
    public Computador(int id, String marca,String procMarca, String procModelo,int procFrequencia) {
        this.id = id;
        this.marca = marca;
        this.processador = new Processador(procMarca, procModelo , procFrequencia);
    }

    public Computador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "id=" + id +
                ", marca='" + marca + '\'' + processador +
                '}';
    }
}
