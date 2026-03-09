public class Carro {
    public String marca,modelo;
    public float velocidade;
    public boolean motor;

//métodos de classe

    //metodo construtor= constroi o objeto e inicializa as variaveis
    public Carro(String marca, String modelo){
        this.marca = marca; // this.marca= valor do objeto e marca é o valor do usuario
        this.modelo = modelo;
        this.velocidade = 0 ;
        this.motor = false;
    }

    //ligar o carro
    public void ligar(){
        if(!this.motor) { // !-NOT
            this.motor = true;
            this.velocidade = 0;
            System.out.println("O carro foi ligado");
        }
    }
    //desligar o carro
    public void desligar(){
        if(this.motor) {
            this.motor = false;
            this.velocidade = 0;
            System.out.println("O carro foi desligado");
        }
    }

    //Acelerar o carro de x unidades
    public void acelerar(float x){
        this.ligar();
        this.velocidade = this.velocidade + x;
        System.out.println("Velocidade Atual:" + this.velocidade);
    }

    //Desacelerar o carro de x unidades
    public void frear(float x){
        if (this.motor && this.velocidade -x >=0){
        this.velocidade -= x;
        System.out.println("Nova velocidade:" + this.velocidade);
        }
        else System.out.println("Não foi possivel frear");
    }

    //converte objeto em String
public String toString() {
    return "Marca: " + this.marca + "\nModelo: " + this.modelo + "\nVelocidade: " + this.velocidade + "\nMotor: " + (this.motor? "ligado":"desligado");
}
}