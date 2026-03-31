import java.util.ArrayList;
import java.util.List;

public class Edificio {
    // UM EDIFICIO PARA VARIOS APARTAMENTOS
    //SEM APARTAMENTO SEM EDIFICIO
    private String nome, endereco;
    private List<Apartamento> apartamentos;

    public Edificio(String nome,String endereco) {

        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    public void construirApe(int numero,int andar){
        Apartamento ap1 = new Apartamento(numero,andar);
        this.apartamentos.add(ap1);
    }

    public void exibirInfo(){
        System.out.println("Edificio:" + nome + "Endereço:" + endereco);
        System.out.println("Unidades");
        for (Apartamento apto :apartamentos){
            System.out.println("-" +apto);
        }
    }
}
