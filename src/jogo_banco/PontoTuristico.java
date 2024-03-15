package jogo_banco;
/**
 * Representacao de um ponto turistico no jogo.
 * Faz parte de uma casa do tabuleiro e pode ser adquirido pelo jogador ou vendido pelo mesmo
 * 
 * @author Everton Daniel
 */
public class PontoTuristico {
	/**
	 * O nome do ponto turistico
	 */
	private String nome;
	/**
	 * Indica a quem o ponto turistico podendo ser um jogador ou o proprio banco
	 */
	private int valorPontoTuristico;
	private String dono;
	/**
	 * Indica em que casa do tabuleiro o ponto turistico foi adicionado
	 */
	private int posicaoNoTabuleiro;
	/**
	 * Classe casa que poder ser construida no ponto turistico
	 */
	private Casa casa;
	/**
	 * Classe hotel que pode ser construido no ponto turistico
	 */
	private Hotel hotel;
	/**
	 * Indica o aumento de salario concedido apenas possuindo o ponto sem nenhuma casa ou hotel construido
	 */
	private int aumentoSalarioPontoTuristico;
	/**
	 * O valor que é concebido ao salario do jogador que adquirir o ponto turistico
	 */
	private int aumentoSalarioConcebido;
	/**
	 * Representa todos os jogadores que pararam no ponto turistico
	 */
	private String[] visitante;
	/**
	 * Indica quanto um visitante que nao seja o seu dono deve pagar ao dono do ponto turistico 
	 */
	private int aluguel;
	
	/**
	 * Construi um ponto turistico recendo todos os seus atributos como parametros 
	 * 
	 * @param nome O nome do ponto turistico
	 * @param dono O dono do ponto turistico. Inicializado como pertecente ao banco
	 * @param posicaoNoTabuleiro A posicao que o ponto turistico esta no tabuleiro
	 * @param aumentoSalarioConcebido Quanto de salario o ponto turistico incrementa no salario do jogador
	 * @param casa Objeto casa que compoe o ponto turistico
	 * @param hotel Obejto hotel que compoe o ponto turistico
	 * @param aluguel Valor que o jogador deve pagar ao dono por visitar o ponto turistico
	 * @param quantidadeDeJogadores Quantos jogadores jogaram o jogo
	 */
	public PontoTuristico(String nome, int valorPontoTuristico, String dono, int posicaoNoTabuleiro, int aumentoSalarioPontoTuristico, Casa casa, Hotel hotel, int aluguel, int quantidadeDeJogadores) {
		this.nome = nome;
		this.valorPontoTuristico = valorPontoTuristico;
		this.dono = "banco";
		this.posicaoNoTabuleiro = posicaoNoTabuleiro;
		this.casa = casa;
		this.hotel = hotel;
		this.aumentoSalarioPontoTuristico = aumentoSalarioPontoTuristico;
		this.aumentoSalarioConcebido = aumentoSalarioPontoTuristico;
		this.visitante = new String[quantidadeDeJogadores];//Cuidado com o valor possivel ser void
		this.aluguel = aluguel;
	}

	public int getValorPontoTuristico() {
		return valorPontoTuristico;
	}

	public int getAumentoSalarioPontoTuristico() {
		return aumentoSalarioPontoTuristico;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public int getPosicaoNoTabuleiro() {
		return posicaoNoTabuleiro;
	}

	public void setPosicaoNoTabuleiro(int posicaoNoTabuleiro) {
		this.posicaoNoTabuleiro = posicaoNoTabuleiro;
	}

	public int getAluguel() {
		return aluguel;
	}

	public void setAluguel(int aluguel) {
		this.aluguel = aluguel;
	}

	public String getNome() {
		return nome;
	}

	public Casa getCasa() {
		return casa;
	}

	public Hotel getHotel() {
		return hotel;
	}
	
	/**
	 * Metodo auxiliar que percorre o array visitante e retorna um posicao que ainda nao a visitantes registrados
	 * 
	 * @return O indice de uma posicao vazia no array
	 */
	private int procurarVagaAtributoVisitante() {
		for(int i = 0;i < this.visitante.length;i++) {
			if(this.visitante[i] == null || this.visitante[i].equals("")) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Metodo auxliar que percorre o array visitante e retorna a posicao que um vitante indicado esta no array
	 * 
	 * @param nome O nome do visitante a ser buscado
	 * @return O indice do array que o visitante esta localizado
	 */
	private int procurarVisitante(String nome) {
		for(int i = 0; i < this.visitante.length;i++) {
			if(this.visitante[i].equals(nome)) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Faz uma busca e retorna o nome de todos os visitantes
	 * 
	 * @return Uma String com o nome de todos os visitantes
	 */
	private String listarVisitantes() {
		String lista = "|";
		for(int i = 0; i < this.visitante.length; i++) {
			if(this.visitante[i] != null && !this.visitante[i].equals("")) {
				lista += visitante[i] += "|";
			}
		}
		return lista;
	}

	/**
	 * Alem de pegar o salario concebido, internamente tambem atualiaza o valor do salario com os das casas e hoteis construidos
	 * 
	 * @return O aumento de salario concebido ao jogador que somado com os das casas e hoteis construidos
	 */
	public int getAumentoSalarioConcebido() {
		this.aumentoSalarioConcebido = this.aumentoSalarioPontoTuristico + this.casa.getAumentoSalarioConcebido()
		+ this.hotel.getAumentoSalarioConcebido();
		return aumentoSalarioConcebido;
	}
	
	/**
	 * Adiciona um visitante
	 * 
	 * @param nome O nome do visitante
	 */
	public void AdicionarVisitante(String nome) {
		int indice = this.procurarVagaAtributoVisitante();
		this.visitante[indice] = nome;
	}
	
	/**
	 * Remove um visitante 
	 * 
	 * @param nome O nome do visitante
	 */
	public void removerVisitante(String nome) {
		int indice = this.procurarVisitante(nome);
		this.visitante[indice] = "";
	}
	
	/**
	 * Override do toString mostrando um visao completa do ponto turistico
	 * 
	 * @return Uma String com os todos as caracteristiacas e status relevantes do ponto turistico
	 */
	@Override
	public String toString() {
		return this.nome + "\n"
				+ "Valor: $" + this.valorPontoTuristico + "\n"
				+ "Dono: $" + this.dono + "\n"
				+ "Quantidade de Casa/Hoteis: " + this.casa.getQuantidadeConstruida() + "/" + this.hotel.getQuantidadeConstruida()+ "\n"
				+ "Salario do ponto: $" + this.aumentoSalarioPontoTuristico + "\n"
				+ "Salario concebido: $" + this.aumentoSalarioConcebido + "\n"
				+ "Aluguel: $" + this.aluguel + "\n"
				+ "Visitantes: " + this.listarVisitantes();
	}
	
}
