import java.util.Random;

public class Drone {
    private String codigo;
    private float altura;
    private boolean emVoo;
    private int bateria;

    //construtor
    public Drone() {
        this.codigo = "";
        this.altura = 0.0f;
        this.emVoo = false;
        this.bateria = 0;
    }

    public Drone(String codigo, float altura, int bateria) {
        this.setCodigo(codigo);
        this.setAltura(altura);
        this.setBateria(bateria);
        this.emVoo = false;
    }

    //set e get
    public void setAltura(float altura) {
        if (this.altura < 0 || this.altura > 120.0) {
            System.out.println("Altura do voo abaixo da regulamentação");
        } else {
            this.altura = altura;
        }

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        if (bateria < 0 || bateria >100){
            System.out.println("Bateria deve ser entre 0 e 100");
        }else {
            this.bateria = bateria;
        }
    }

    public float getAltura() {
        return altura;
    }

    public boolean isEmVoo() {
        return emVoo;
    }

    public void setEmVoo(boolean emVoo) {
        this.emVoo = emVoo;
    }

    public void decolar(){
        if (this.bateria >20){
            if (testarMotores()) {
                this.emVoo = true;
                this.setAltura(2.9f);
                System.out.println("Drone" + codigo + "decolado");
            }
            else{
                System.out.println("Falha nos motores. Decolagem cancelada");
            }
        }
        else {
            System.out.println("Sem bateria suficiente");
        }

    }
    private boolean testarMotores(){
        System.out.println("Testando hélices...");
        System.out.println("Calibrando GPS...");
        Random random = new Random();
        return random.nextInt(11) < 8;
    }
    public void subir(float x) {
        if (emVoo) {
            setAltura(this.altura + x);
        } else {
            System.out.println("O drone precisa estar em voo para subir.");
        }
    }

    public void descer(float x) {
        if (emVoo) {
            setAltura(this.altura - x);
        } else {
            System.out.println("O drone precisa estar em voo para descer.");
        }
    }

}