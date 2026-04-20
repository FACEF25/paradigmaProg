public class Main {
    public static void main(String[] args) {
        // Testando a Fechadura
        FechaduraEletronica minhaPorta = new FechaduraEletronica();
        minhaPorta.validarAcesso("1234");
        minhaPorta.ligar();

        System.out.println("---");

        // Testando o Termostato
        TermostatoSmart meuClima = new TermostatoSmart();
        meuClima.ligar();
        System.out.println("Temperatura atual: " + meuClima.lerTemperatura() + "°C");
    }
}