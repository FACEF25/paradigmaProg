public class TestaAcademico {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1,  2024001,"Maria Silva", "Engenharia de Software");
        Aluno aluno2 = new Aluno(2, 2024002, "Maria Laura", "Sistemas de Informação");

        Disciplina disc1 = new Disciplina(101, "Programação Orientada a Objetos", "Dr. Alan Turing");

        disc1.matricularAluno(aluno1);
        disc1.matricularAluno(aluno2);

        disc1.criarAvaliacao(1, "Prova Semestral");

         Avaliacao prova = disc1.getAvaliacaoPorNome("Prova Semestral");
        if (prova != null) {
            prova.adicionarQuestao(1, "Explique o conceito de Herança.", 3.5f);
            prova.adicionarQuestao(2, "Diferencie Agregação de Composição.", 3.5f);
            prova.adicionarQuestao(3, "O que é polimorfismo?", 3.0f);
        }

        System.out.println(disc1.toString());
    }
}