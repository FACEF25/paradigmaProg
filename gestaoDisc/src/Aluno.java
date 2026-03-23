public class Aluno {
    private int id, ra;
    private String nome, curso;

    //construtor sem parametros
    public Aluno() {
    }

    //construtor com parametros
    public Aluno(int id, int ra, String nome, String curso) {
        this.id = id;
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", ra=" + ra +
                ", nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}
