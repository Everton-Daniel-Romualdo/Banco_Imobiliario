package jogo_banco;
/**
 * Representacao de uma construcao do tipo casa que pode ser construida em um ponto turistico
 * 
 * @author Everton Daniel
 */
public class Casa {
	private int valorConstrucao;
	private int quantidadeConstruida;
	private int aumentoSalarioUnidade;
	private int aumentoSalarioConcebido;
	
	/**
	 * Construi o objeto casa recebendo o seus valor de construcao e o salario que ele concede por unidade construida
	 * 
	 * @param valor O valor de construcao
	 * @param salarioUnidade O valor do aumento de salario por unidade
	 */
	public Casa(int valor,  int salarioUnidade) {
		this.valorConstrucao = valor;
		this.quantidadeConstruida = 0;
		this.aumentoSalarioUnidade = salarioUnidade;
		this.aumentoSalarioConcebido = salarioUnidade;
	}
	public int getQuantidadeConstruida() {
		return quantidadeConstruida;
	}
	
	/**
	 * Alem de setar a quantidade construida tambem atualiza o aumentoSalarioConcebido do jogador
	 * 
	 * @param quantidadeConstruida Quantas casas foram construidas
	 */
	public void setQuantidadeConstruida(int quantidadeConstruida) {
		this.quantidadeConstruida = quantidadeConstruida;
		this.aumentoSalarioConcebido = this.quantidadeConstruida * this.aumentoSalarioUnidade;
	}
	
	public int getValor() {
		return valorConstrucao;
	}
	
	public int getAumentoSalarioConcebido() {
		return aumentoSalarioConcebido;
	}
	
}
