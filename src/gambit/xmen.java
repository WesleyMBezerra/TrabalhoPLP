package gambit;

abstract class xmen {
	
	public String nome;
	public String poder;
	public int idade;
	public String classePoder;
	
	static private int numeroDePersonagens;
	
	
	public xmen(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
		
		
		System.out.println("Um novo personagem foi criado");
		numeroDePersonagens += 1;
		
	}
	
	static int numeroPersonagens() {
		
		return xmen.numeroDePersonagens;
	}
	
	
	public void descricao() {
		
		System.out.println("Nome: " + nome +"\nPoder: "+ this.poder+"\n");
		
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getClassePoder() {
		return classePoder;
	}
	public void setClassePoder(String classePoder) {
		this.classePoder = classePoder;
	}
	
	
	public String getPoder() {
		return poder;
	}
	
	public void setPoder(String poder) {
		this.poder = poder;
	}
	
	
	public abstract void Habilidade();

}
