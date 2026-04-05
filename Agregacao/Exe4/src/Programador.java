public class Programador {
    private int id;
    private String nome, lingPrinc;

    public Programador() {
    }

    public Programador(int id, String nome, String lingPrinc) {
        this.id = id;
        this.nome = nome;
        this.lingPrinc = lingPrinc;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLingPrinc() {
        return lingPrinc;
    }

    public void setLingPrinc(String lingPrinc) {
        this.lingPrinc = lingPrinc;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", lingPrinc='" + lingPrinc + '\'' +
                '}';
    }
}
