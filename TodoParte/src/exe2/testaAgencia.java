package exe2;

import java.time.LocalDateTime;

public class testaAgencia {
    public static void main (String[] args){
        Passageiro p1 = new Passageiro("123434", "Fulano");
        System.out.println(p1.toString());
        LocalDateTime data = LocalDateTime.of(2026, 1,30,22,45);

        Voo v1 = new Voo(1,"SP", "MG", data);

        Reserva r1 = new Reserva(1,25,LocalDateTime.now(), p1, v1);
        System.out.println(r1.toString());
    }

}
