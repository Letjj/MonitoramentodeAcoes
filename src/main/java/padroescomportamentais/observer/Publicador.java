package padroescomportamentais.observer;

import java.util.ArrayList;
import java.util.List;

public class Publicador {
    private List<Observador> observadores = new ArrayList<>();
    private boolean alterado = false;

    // Mantém o mesmo nome do método original para compatibilidade
    public void addObserver(Observador o) {
        observadores.add(o);
    }

    public void removeObserver(Observador o) {
        observadores.remove(o);
    }

    // Mantém o mesmo nome do método original
    protected void setChanged() {
        this.alterado = true;
    }

    // Mantém o mesmo nome do método original
    public void notifyObservers() {
        if (this.alterado) {
            for (Observador o : observadores) {
                o.update(this, null);
            }
            this.alterado = false;
        }
    }
}
