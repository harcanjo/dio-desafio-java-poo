package edu.hugo.montadora.linhademontagem;

import java.util.ArrayList;

public class Caminhao extends Veiculo {
	
	private String tipo;	
	
	public Caminhao(String modelo, String cor) {
		super(modelo, cor);
		tipo = "Caminhão";
	}
	
	@Override
	public void veiculoSelecionado() {
    	System.out.println("Começar a montagem do " + tipo + ": " + this.getModelo() + ".");
    }

	@Override
    ArrayList<EtapaProducao> getEtapasProducao() {
        ArrayList<EtapaProducao> etapas = new ArrayList<>();
        etapas.add(new Pintura());
        etapas.add(new Montagem());
        etapas.add(new Testes());
        etapas.add(new Embalagem());
        return etapas;
    }
}