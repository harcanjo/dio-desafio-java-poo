package edu.hugo.montadora.linhademontagem;

public class Testes implements EtapaProducao {
    private static final int PROGRESSO_TESTES = 25;

    @Override
    public void executar() {
        System.out.println("Executando etapa de testes");
    }

    @Override
    public String getNome() {
        return "Testes";
    }

    @Override
    public int getProgresso() {
        return PROGRESSO_TESTES;
    }
}