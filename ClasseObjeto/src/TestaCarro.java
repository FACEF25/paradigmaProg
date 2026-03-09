public class TestaCarro {
    public static void main(String args[]){
        //cria uma instancia da classe Carro* cria um objeto
        Carro obj1 = new Carro( "Fiat","Uno");

        //exibe os dados
        System.out.println(obj1.toString());
        obj1.ligar();
        obj1.acelerar(20);
        obj1.acelerar(40);
        obj1.acelerar(60);
        System.out.println(obj1.toString());

        obj1.frear(30);
        obj1.frear(45);
        obj1.frear(20);
        System.out.println(obj1.toString());


        Carro obj2 = new Carro ("Renault","Sandero");

        //exibe os dados
        System.out.println(obj2.toString());
        obj2.ligar();
        obj2.acelerar(20);
        obj2.acelerar(40);
        obj2.acelerar(80);
        System.out.println(obj2.toString());

        obj2.frear(30);
        obj2.frear(45);
        obj2.frear(20);
        obj2.frear(15);
        System.out.println(obj2.toString());


        obj1.desligar();
        obj2.desligar();
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());

    }

}
