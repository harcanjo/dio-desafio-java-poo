package edu.hugo.montadora.linhademontagem;

public class Montagem implements EtapaProducao {
    private static final int PROGRESSO_MONTAGEM = 25;

    @Override
    public void executar() {
        System.out.println("Executando etapa de montagem");
    }

    @Override
    public String getNome() {
        return "Montagem";
    }

    @Override
    public int getProgresso() {
        return PROGRESSO_MONTAGEM;
    }
}