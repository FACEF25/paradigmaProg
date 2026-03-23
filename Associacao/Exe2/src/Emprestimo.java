import java.time.LocalDateTime;

public class Emprestimo {
    private LocalDateTime dataEmp, dataDev;
    private Leitor leitor;
    private Livro livro;

    public Emprestimo(LocalDateTime dataEmp, LocalDateTime dataDev, Leitor leitor, Livro livro) {
        this.dataEmp = dataEmp;
        this.dataDev = dataDev;
        this.leitor = leitor;
        this.livro = livro;
    }

    public Emprestimo() {
    }

    public LocalDateTime getDataEmp() {
        return dataEmp;
    }

    public void setDataEmp(LocalDateTime dataEmp) {
        this.dataEmp = dataEmp;
    }

    public LocalDateTime getDataDev() {
        return dataDev;
    }

    public void setDataDev(LocalDateTime dataDev) {
        this.dataDev = dataDev;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "dataEmp=" + dataEmp +
                ", dataDev=" + dataDev +
                ", leitor=" + leitor.toString() +
                ", livro=" + livro.getTitulo() +
                '}';
    }
}
