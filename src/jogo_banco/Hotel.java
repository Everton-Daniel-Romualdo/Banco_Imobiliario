package jogo_banco;
/**
 * Representacao de um construicao do tipo hotel que pode ser construido em um ponto turistico
 * @author Everton Daniel
 */
public class Hotel {
	private int valorConstrucao;
	private int quantidadeConstruida;
	private int aumentoSalarioUnidade;
	private int aumentoSalarioConcebido;
	
	/**
	 * Construi o objeto hotel recendo quando ele custa e quanto incrementa no salario do jogador por unidade
	 * 
	 * @param valor Seu valor de construcao
	 * @param aumentoSalarioConcebido O aumento de salario que sera dado por quantidade construida ao jogador
	 */
	public Hotel(int valor,  int salarioUnidade) {
		this.valorConstrucao = valor;
		this.quantidadeConstruida = 0;
		this.aumentoSalarioUnidade = salarioUnidade;
		this.aumentoSalarioConcebido = salarioUnidade;
	}

	public int getQuantidadeConstruida() {
		return quantidadeConstruida;
	}
	/**
	 * Alem de setar a quantida de hotel construida tambem atualiza o valor do aumento do salario ao jogaodor
	 * 
	 * @param quantidadeConstruida Quantidade de hoteis que serao construidos
	 */
	public void setQuantidadeConstruida(int quantidadeConstruida) {
		this.quantidadeConstruida = quantidadeConstruida;
		this.aumentoSalarioConcebido = this.quantidadeConstruida * this.aumentoSalarioUnidade;
	}

	public int getAumentoSalarioConcebido() {
		return aumentoSalarioConcebido;
	}

	public int getValor() {
		return valorConstrucao;
	}
	
}
