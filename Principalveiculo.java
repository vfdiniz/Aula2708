package Atividades;

public class Principalveiculo {
	public static void main(String[] args) {
		Carro carro = new Carro();
		Onibus onibus = new Onibus();
		carro.ligar();
		carro.desligar();
		carro.engatar();
		carro.manobrar();
		carro.acelerar();
		carro.frear();
		System.out.println("");
		onibus.ligar();
		onibus.desligar();
		onibus.manobrar();
		onibus.engatar();
		onibus.acelerar();
		onibus.frear();
		
		
	}
	
}
