//OBJETO PARTE
public class Questao {
    private int numero;
    private String enunciado;
    private float valor;
    public Questao() {
    }

    public Questao(int numero, String enunciado, float valor) {
        this.numero = numero;
        this.enunciado = enunciado;
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Questao{" +
                "nome='" + nome + '\'' +
                ", enunciado='" + enunciado + '\'' +
                ", valor=" + valor +
                '}';
    }
}
