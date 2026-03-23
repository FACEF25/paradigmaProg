public class TestaDrone {
    public static void main(String[] args) {
        // Criando um drone com bateria suficiente
        Drone meuDrone = new Drone("DR700", 0, 80);

        System.out.println("--- Iniciando Operação ---");
        meuDrone.decolar();

        if (meuDrone.isEmVoo()) {
            meuDrone.subir(50.0f);
            System.out.println("Altura após subir: " + meuDrone.getAltura() + "m");

            // Tentando subir acima do limite (120m)
            meuDrone.subir(80.0f);

            meuDrone.descer(10.0f);
            System.out.println("Altura final: " + meuDrone.getAltura() + "m");
        }

        System.out.println("\n--- Teste de Bateria Baixa ---");
        Drone droneFraco = new Drone("DR100", 0, 15);
        droneFraco.decolar();
    }
}