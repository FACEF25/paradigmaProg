import java.util.ArrayList;
import java.util.List;

public class Time {
    private int id;
    private String nome, tecnico;
    private List<Atleta> elenco;

    public Time(int id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        this.elenco = new ArrayList<>();
    }

    // Regra: Método que recebe o objeto Atleta PRONTO
    public void contratarAtleta(Atleta a) {
        this.elenco.add(a);
    }

    public void mostrarElenco() {
        System.out.println("Time: " + nome + " | Técnico: " + tecnico);
        for (Atleta a : elenco) {
            System.out.println(" - " + a);
        }
    }
}