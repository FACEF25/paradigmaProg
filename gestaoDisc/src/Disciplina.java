import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome,professor;
    private ArrayList<Aluno> alunos; // Agregação
    private ArrayList<Avaliacao> avaliacoes; // Composição

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public void matricularAluno(Aluno a) {
        this.alunos.add(a);
    }

    public void criarAvaliacao(int id, String nome) {
        Avaliacao av = new Avaliacao(id, nome);
        this.avaliacoes.add(av);
    }

    public Avaliacao getAvaliacaoPorNome(String nome) {
        for (Avaliacao av : avaliacoes) {
            if (av.toString().contains(nome)) return av;
        }
        return null;
    }

    @Override
    public String toString() {
        return "DISCIPLINA: " + nome + " | Prof: " + professor +
                "\nALUNOS MATRICULADOS:" + alunos +
                "\nAVALIAÇÕES PROGRAMADAS:" + avaliacoes;
    }
}