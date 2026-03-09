public class ArCondicionado {

    private String marca,modelo;
    private int temp;
    private boolean ligado;
    //construtor
    public ArCondicionado(){
        this.marca = "";
        this.modelo = "";
        this.temp = 0;
        this.ligado = false;
    }
    public ArCondicionado(String marca, String modelo, int temp, boolean ligado){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setTemperatura(temp);
        this.setLigado(ligado);
    }


    public void setMarca(String marca) {
        if (marca != null && marca.length() >= 3) {
            this.marca = marca;
        } else {
            System.out.println("Marca inválida");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setTemperatura(int temp) {
        if (temp >= 16 && temp <= 30) {
            this.temp = temp;
        } else {
            System.out.println("Temperatura fora da faixa");
        }
    }

    public int getTemperatura() {
        return temp;
    }

    public void setLigado(boolean ligado) {
        if (this.ligado){
            System.out.println("O ar já esta ligado");
        }else {
            this.ligado = true;
            System.out.println("O ar foi ligado");
        }
    }

    public boolean isLigado() {
        return ligado;
    }
    public void ativarModoTurbo() {

        if (verificarCompressor()) {
            setTemperatura(16);
            System.out.println("Modo Turbo ativado!");
        } else {
            System.out.println("Falha no compressor. Turbo não ativado.");
        }

    }

    private boolean verificarCompressor() {

        int numero = (int) (Math.random() * 5); // gera número de 0 a 4

        if (numero > 2) {
            return true;
        } else {
            return false;
        }

    }

    public String toString() {
        return "Marca: " + marca +
                "\nModelo: " + modelo +
                "\nTemperatura: " + temp +
                "\nLigado: " + ligado;
    }
}
