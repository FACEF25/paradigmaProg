import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private int id;
    private String nome;
    private List<Programador> equipe; //nome da lista q ira agregar os progs

    public Projeto(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.equipe = new ArrayList<>();
    }

    //METODO QUE ADICIONA PROGRAMADOR NO PROJETO
    public void adcProg(Programador prog){
        this.equipe.add(prog);
    }

    //METODO PRA LISTAR PROGRAMADORES(TODOS)
    public void listarEquipe(){
        System.out.println("Equipe: " + nome);
        if (equipe.isEmpty()){
            System.out.println("Não possui programador no momento");
        }else{
            for (Programador prog : equipe){
                System.out.println(prog);
            }
        }
    }
}
