import java.time.LocalDateTime;

public class testaConsulta {
    public static void main(String[] args){
        Paciente p1 = new Paciente (1,"Maria", "4535645644");
        System.out.println(p1.toString());
        Medico m1 = new Medico (1,"Isadora", "Ginecologista");
        System.out.println(m1.toString());

        LocalDateTime data = LocalDateTime.of(2026, 1,30,14,45);

        Consulta c1 = new Consulta( LocalDateTime.now(), 129.9f, m1, p1);
        System.out.println(c1.toString());
    }
}
