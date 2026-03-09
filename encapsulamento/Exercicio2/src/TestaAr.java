public class TestaAr {

    public static void main(String args[]) {

        ArCondicionado obj1 = new ArCondicionado();

        obj1.setTemperatura(10); // fora da faixa
        obj1.setTemperatura(22); // válido
        obj1.setMarca("LG");
        obj1.setModelo("Dual Inverter");

        System.out.println("Marca: " + obj1.getMarca());
        System.out.println("Modelo: " + obj1.getModelo());
        System.out.println("Temperatura: " + obj1.getTemperatura());

        obj1.ativarModoTurbo();

        // Construtor com parâmetros
        ArCondicionado obj2 = new ArCondicionado("Samsung", "WindFree", 24,false);
        obj2.setLigado(true);
        System.out.println(obj2);
        System.out.println("Temperatura: " + obj2.getTemperatura());
        System.out.println(obj2);
    }
}
