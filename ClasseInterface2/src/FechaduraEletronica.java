class FechaduraEletronica implements Autenticavel, DispositivoLigavel {
    private boolean autenticado = false;
    private boolean aberta = false;
    private final String senhaCorreta = "1234";

    @Override
    public void validarAcesso(String senha) {
        if (this.senhaCorreta.equals(senha)) {
            this.autenticado = true;
            System.out.println("Acesso validado com sucesso!");
        } else {
            this.autenticado = false;
            System.out.println("Senha incorreta. Acesso negado.");
        }
    }

    @Override
    public void ligar() {
        if (autenticado) {
            this.aberta = true;
            System.out.println("Fechadura DESTRANCADA.");
        } else {
            System.out.println("Erro: Autentique-se primeiro para destrancar.");
        }
    }

    @Override
    public void desligar() {
        this.aberta = false;
        this.autenticado = false; // Reset de segurança
        System.out.println("Fechadura TRANCADA.");
    }
}