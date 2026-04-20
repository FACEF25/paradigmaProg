class TermostatoSmart implements DispositivoLigavel, SensorTemperatura {
    private boolean ligado = false;

    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("Termostato ligado e monitorando...");
    }

    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("Termostato desligado.");
    }

    @Override
    public double lerTemperatura() {
        if (ligado) {
            return 22.5; // Simulação de leitura
        } else {
            System.out.println("Aviso: Dispositivo desligado. Retornando valor padrão.");
            return 0.0;
        }
    }
}