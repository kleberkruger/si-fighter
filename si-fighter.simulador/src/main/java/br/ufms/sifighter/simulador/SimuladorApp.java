package br.ufms.sifighter.simulador;

import br.ufms.sifighter.core.Acao;
import br.ufms.sifighter.core.lutador.Lutador;

public class SimuladorApp {

    public static void main(String[] args) {
        Lutador kruger = Lutador.get("Freddy Kruger");
        kruger.executar(Acao.AVANCAR_ESQUERDA);
    }
}
