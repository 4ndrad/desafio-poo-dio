package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setTitulo("Curso Java");
		curso.setDescricao("descrição do curso");
		curso.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("descrição do curso");
		curso2.setCargaHoraria(8);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("descrição da mentoria");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso);
		System.out.println(curso2);
		System.out.println(mentoria);
	}
}
