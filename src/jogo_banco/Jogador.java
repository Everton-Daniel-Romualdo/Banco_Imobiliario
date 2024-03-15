package jogo_banco;

/**
 * Representacao de um jogador
 * 
 * @author Everton Daniel
 */
public class Jogador {
	/**
	 * O nome do jogador, seu indentificador unico
	 */
	private String nome;
	/**
	 * Representa o dinheiro que o jogador possui
	 */
	private int dinheiro;
	/**
	 * Valor que o jogador recebe ao dar um volta completa no tabuleiro 
	 */
	private int salario;
	/**
	 * Indica em que posicao o jogador esta no tabuleiro
	 */
	private int posicaoTabuleiro;
	
	/**
	 * Constroi o objeto jogador recebendo seu nome 
	 * @param nome O nome do jogador
	 */
	public Jogador(String nome) {
		this.nome = nome;
		this.dinheiro = 1000;
		this.salario = 100;
		this.posicaoTabuleiro = 0;
	}

	public int getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(int dinheiro) {
		this.dinheiro = dinheiro;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getPosicaoTabuleiro() {
		return posicaoTabuleiro;
	}

	public void setPosicaoTabuleiro(int posicaoTabuleiro) {
		this.posicaoTabuleiro = posicaoTabuleiro;
	}

	public String getNome() {
		return nome;
	}
	
	/**
	 * Adiciona o salario do jogador ao seu dinheiro
	 */
	public void pagarSalario() {
		this.dinheiro += this.salario;
	}
	
	/**
	 * Diminui o salario do jogador na quantidade recebida
	 * 
	 * @param valor Quanto o salario sera diminuido
	 */
	public void decrementarSalario(int valor) {
		this.salario -= valor;
	}
	
	/**
	 * Aumenta o salario do jogador adicionando o valor recebido
	 * @param valor
	 */
	public void incrementarSalario(int valor) {
		this.salario += valor;
	}
	
	/**
	 * Sobrescreve toString retornado os atributos do jogador
	 * 
	 * @return O nome, dinheiro e salario do jogador
	 */
	@Override
	public String toString() {
		return this.nome + "\n"
				+ "Dinheiro: $" + this.dinheiro
				+ "salario: $" + this.salario;
	}
}
