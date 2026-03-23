package exe2;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//OBJETO TUDO

public class Reserva {
    private int codigo,poltrona;
    private LocalDateTime data;
    private Passageiro passageiro;
    private Voo voo;
    public Reserva() {
    }

    public Reserva(int codigo, int poltrona, LocalDateTime data, Passageiro passageiro, Voo voo) {
        this.codigo = codigo;
        this.poltrona = poltrona;
        this.data = data;
        this.passageiro = passageiro;
        this.voo = voo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    @Override
    public String toString() {
        //vamos formatar a data no brasil
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'as' HH'h'mm");
        return "reserva{" +
                "codigo=" + codigo +
                ", poltrona=" + poltrona +
                ", data=" + data.format(formatoBR) +
                '}';
    }


}
