package br.com.mcsit.basico;

public class Aluno extends Pessoa{
	
	private int ra;
	private String curso;
	
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
