import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Sessao {
    private int id, sala;
    private LocalDateTime horario;
    private Filme filme; // Agregação
    private ArrayList<Ingresso> ingressos; // Composição

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>();
    }

    public void vincularFilme(Filme f) {
        this.filme = f;
    }

    public void venderIngresso(int id, String assento, String tipo, float preco) {
        // A própria Sessão cria o objeto Ingresso (Composição)
        Ingresso novoIngresso = new Ingresso(id, assento, tipo, preco);
        this.ingressos.add(novoIngresso);
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String info = "SESSÃO #" + id + "\n" +
                "Horário: " + horario.format(fmt) + " | Sala: " + sala + "\n" +
                (filme != null ? filme.toString() : "Nenhum filme vinculado") + "\n" +
                "Ingressos Vendidos:\n";

        for (Ingresso i : ingressos) {
            info += " - " + i.toString() + "\n";
        }
        return info;
    }
}
