package edu.hugo.montadora.linhademontagem;

import java.util.ArrayList;

public class Moto extends Veiculo {
	
    private String tipo;
        
	public Moto(String modelo, String cor) {
		super(modelo, cor);
		tipo = "Moto";
	}
	
	@Override
	public void veiculoSelecionado() {
    	System.out.println("Começar a montagem da " + tipo + ": " + this.getModelo() + ".");
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