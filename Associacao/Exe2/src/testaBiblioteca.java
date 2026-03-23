import java.time.LocalDateTime;

public class testaBiblioteca {
    public static void main(String[] args){
        Leitor le1 = new Leitor ("Maria Marcela",1);
        System.out.println(le1.toString());
        Livro li1 = new Livro (1,"A Droga da Obediencia", "Carlos");
        System.out.println(li1.toString());

        LocalDateTime data = LocalDateTime.of(2026, 1,30,14,45);

        Emprestimo e1 = new Emprestimo( LocalDateTime.now(), LocalDateTime.now(), le1,li1);
        System.out.println(e1.toString());
    }
}
