import java.util.Date;

public class TestaTodoParte {
    public static void main (String [] args){
        //Cliente é independente do pedido
        Cliente cli1 = new Cliente (100, "Isadora", "123", "Rua 10");

        Pedido ped1 = new Pedido(1, new Date() ,cli1);
        System.out.println(ped1.toString());
    }
}
