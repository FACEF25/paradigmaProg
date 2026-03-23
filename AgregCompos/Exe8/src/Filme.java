public class Filme {
    private int id,duracao;
    private String titulo, genero;

    public Filme() {
    }

    public Filme(String genero, String titulo, int duracao, int id) {
        this.genero = genero;
        this.titulo = titulo;
        this.duracao = duracao;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", duracao=" + duracao +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
