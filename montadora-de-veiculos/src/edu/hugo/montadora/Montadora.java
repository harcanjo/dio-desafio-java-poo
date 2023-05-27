package edu.hugo.montadora;

import edu.hugo.montadora.linhademontagem.Carro;
import edu.hugo.montadora.linhademontagem.Moto;
import edu.hugo.montadora.linhademontagem.Caminhao;

public class Montadora {

	public static void main(String[] args) {
		
		System.out.println("Olá, seja bem vindo(a)!");
		
		Carro carro = new Carro("Gol", "Preto");
		Moto moto = new Moto("Ninja", "Verde");
		Caminhao caminhao = new Caminhao("Actros", "Vermelho");

        carro.montar();
        moto.montar();
        caminhao.montar();

	}

}
