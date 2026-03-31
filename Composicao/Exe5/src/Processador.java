public class Processador {
    private String marca, modelo;
    private int frequencia;

    public Processador() {
    }

    public Processador(String marca, String modelo, int frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", frequencia=" + frequencia +
                '}';
    }
}
