package edu.hugo.montadora.linhademontagem;

import java.util.List;

public abstract class Veiculo {
	
	private String modelo;
	private String cor;
	private String tipo;
	
    private int progresso;

    abstract List<EtapaProducao> getEtapasProducao();
    abstract void veiculoSelecionado();
     
    public Veiculo(String modelo, String cor) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.tipo = "Veículo";
	}

	public void montar() {
		veiculoSelecionado();
        for (EtapaProducao etapa : getEtapasProducao()) {
            etapa.executar();
            System.out.println("Etapa concluída: " + etapa.getNome());
            progresso += etapa.getProgresso();
            System.out.println("Progresso: " + progresso + "% do(a) " + modelo);
        }
        System.out.println("Linha de montagem concluída!");
    }

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}	
	
	
}