package edu.hugo.montadora.linhademontagem;

public class Embalagem implements EtapaProducao {
    private static final int PROGRESSO_EMBALAGEM = 25;

    @Override
    public void executar() {
        System.out.println("Executando etapa de embalagem");
    }

    @Override
    public String getNome() {
        return "Embalagem";
    }

    @Override
    public int getProgresso() {
        return PROGRESSO_EMBALAGEM;
    }
}
