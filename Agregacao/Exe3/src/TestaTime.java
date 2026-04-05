public class TestaTime {
    public static void main(String[] args) {
        Atleta armador = new Atleta(10, "Jorge","Armador");
        Time franca = new Time(1,"SESI Franca", "Helio Rubens");
        franca.contratarAtleta(armador);

        franca.mostrarElenco();

        franca= null;

        if(armador != null){
            System.out.println("o atleta armador continua existindo na memória" +armador);

        }
    }
}
