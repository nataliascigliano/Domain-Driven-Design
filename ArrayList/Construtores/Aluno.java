package Aula11_Construtores;

public class Aluno {
	
	//atributos
	private int matricula;
	private String nome;
	private String curso;
	private boolean status;
	private float mediaGeral;
	
	//Construtores (s�o sempre p�blicos, para permitir que um objeto seja instanciado.
	public Aluno(){
		System.out.println("Objeto Aluno Criado!");
	}
	
	// construtores parametrizados permitem instanciar j� com as informa��es dentro
	public Aluno(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public Aluno(int matricula, String nome, String curso, boolean status){
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
		this.status = status;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public float getMediaGeral() {
		return mediaGeral;
	}

	public void setMediaGeral(float mediaGeral) {
		this.mediaGeral = mediaGeral;
	}

	
	//m�todo operacional
	public float calcularMedia(float n1, float n2, float n3) {
		return (n1+n2+n3)/3;
	}
	
	
	
	
	
	
	
	
	
	
}
