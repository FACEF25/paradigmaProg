public class TestaProjeto {
    public static void main(String[]args){
        //Criação de forma independente dos objetos
        Programador p1 = new Programador(1, "Isadora", "C#");
        Programador p2 = new Programador(2,"Lucas","Java");

        Projeto proj1 = new Projeto(1,"ABRIL26");

        proj1.adcProg(p1);
        proj1.adcProg(p2);
        proj1.listarEquipe();

    }
}
