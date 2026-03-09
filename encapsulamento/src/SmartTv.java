public class SmartTv {
    private String marca,modelo;
    private int volume;
    private boolean conectInternet;
    //construtor
    public SmartTv(){
        this.marca = "";
        this.modelo = "";
        this.conectInternet = false;
    }
    public SmartTv(String marca, String modelo, int volume){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
        this.conectInternet = false;
    }

    //set e get
    public void setVolume (int volume){
        if(volume >=0 && volume <=100){
            this.volume = volume;
        }
        else System.out.println("Volume inválido");
    }

    public int getVolume(){

        return this.volume;
    }

    public void setMarca (String marca){
        //a marca precisa ter a primeira letra em maiusculo
        char aux = marca.charAt(0);
        boolean upper = Character.isUpperCase(aux);
        if (upper){
            this.marca = marca;
        }
        else
            System.out.println("Marca Inválida");
        }

    public String getMarca(){
        return this.marca;
    }

    public void setModelo (String modelo){
       if(modelo.length() <= 30){
        this.modelo = modelo;
    }
    }


    public String getModelo(){
        return this.modelo;
    }

    public void AbrirYoutube(){
        if (this.ConectaInternet()) {
            System.out.println("Abrindo YouTube");
        }else System.out.println("Sem internet para abrir o Youtube");
    }

    //esse metodo so pode ser usado nessa classe
    private boolean ConectaInternet(){
        System.out.println("Buscando sinal de wifi...");
        System.out.println("Verificando credenciais...");
        System.out.println("Autenticando IP no roteador...");
        int random =(int) (Math.random() * 10);
        if (random< 5){
            this.conectInternet = true;
            return true;
        }else{
            this.conectInternet = false;
            return false ;
        }
    }
    public void aumentaSom(int x){
        this.setVolume(this.volume + x);
    }
    public void diminuiSom(int x){
        this.setVolume(this.volume - x);
    }

    public String toString(){
        return "Marca:" + this.marca +"Modelo:" +this.modelo + "Volume:" + this.volume + "Conectado na internet" + (this.conectInternet ? "Sim" : "Não");
    }
}
