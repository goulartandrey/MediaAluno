package app;

public class Aluno {
	
	public String nome;
	public int nota1, nota2, nota3;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, int nota1, int nota2, int nota3) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	public int getNota3() {
		return nota3;
	}

	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}

	public double calcularMedia() {
		return ((nota1*0.3)+(nota2+nota3)*0.35);
	}
	public String getResultado() {
		double media = this.calcularMedia();
		if(media >=6) {
			return "Resultado final: Aprovado!";
		}else {
			return"Resultado final: Reprovado!";
		}
	}
}
