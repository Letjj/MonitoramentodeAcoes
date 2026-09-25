package padroescomportamentais.observer;

public class Investidor implements Observador {

    private String nome;
    private String notificacao;

    public Investidor(String nome) {
        this.nome = nome;
    }

    public String getNotificacao() {
        return this.notificacao;
    }

    public void assinarAlerta(Acao acao) {
        acao.addObserver(this);
    }

    @Override
    public void update(Publicador publicador, Object arg) {
        this.notificacao = this.nome + ", preço atualizado na " + publicador.toString();
    }
}
