package padroescomportamentais.observer;

public class Acao extends Publicador {

    private String simbolo;
    private String nomeEmpresa;
    private Double preco;

    public Acao(String simbolo, String nomeEmpresa, Double preco) {
        this.simbolo = simbolo;
        this.nomeEmpresa = nomeEmpresa;
        this.preco = preco;
    }

    public void atualizarPreco(Double novoPreco) {
        this.preco = novoPreco;
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Acao{" +
                "simbolo='" + simbolo + '\'' +
                ", nomeEmpresa='" + nomeEmpresa + '\'' +
                ", preco=" + preco +
                '}';
    }
}