package com.gerenciamento.escolar;

import java.util.List;

public class Disciplina extends Aluno {
	private String disciplina;
	private int codigodisciplina;
	private String professorresponsavel;
	private List<String> alunosmatriculados =  new List<String>();

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public int getCodigodisciplina() {
		return codigodisciplina;
	}

	public void setCodigodisciplina(int codigodisciplina) {
		this.codigodisciplina = codigodisciplina;
	}

	public String getProfessorresponsavel() {
		return professorresponsavel;
	}

	public void setProfessorresponsavel(String professorresponsavel) {
		this.professorresponsavel = professorresponsavel;
	}

	public List<String> getAlunosmatriculados() {
		return alunosmatriculados;
	}

	public void setAlunosmatriculados(List<String> alunosmatriculados) {
		this.alunosmatriculados = alunosmatriculados;
	}
	   public void adicionarAlunos(String nome , int matricula) {
		   if(nome != null && matricula != 0 ) {
			   nome.add(alunosmatriculados);
		   }
		   
	   }
	}
