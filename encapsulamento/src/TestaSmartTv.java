public class TestaSmartTv {
    public static void main(String args[]){
        SmartTv obj1 = new SmartTv();


        obj1.setVolume(120);
        obj1.setVolume(40);
        obj1.setMarca("LG");
        obj1.setModelo("Modelo AMOLED" );
        obj1.getMarca();
        obj1.getModelo();

        //Construtor
        SmartTv obj2 =new SmartTv("Samsung", "QLed 32", 25);
        System.out.println("Volume:" + obj2.getVolume());
    }
}
