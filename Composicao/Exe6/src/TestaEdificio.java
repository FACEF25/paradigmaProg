public class TestaEdificio {
    public static void main(String [] args){
        Edificio ed1 = new Edificio("Nova Floresta", "Rua Flamboyamt,8");

        ed1.construirApe(101,1);
        ed1.construirApe(102,1);
        ed1.construirApe(201,2);
        ed1.construirApe(202,2);


        ed1.exibirInfo();
    }
}
