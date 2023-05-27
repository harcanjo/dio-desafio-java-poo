package edu.hugo.montadora.linhademontagem;

public class Pintura implements EtapaProducao {
    private static final int PROGRESSO_PINTURA = 25;

    @Override
    public void executar() {
        System.out.println("Executando etapa de pintura");
    }

    @Override
    public String getNome() {
        return "Pintura";
    }

    @Override
    public int getProgresso() {
        return PROGRESSO_PINTURA;
    }
}