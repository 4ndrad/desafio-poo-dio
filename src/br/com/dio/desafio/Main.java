package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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
		
//		System.out.println(curso);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("descrição do Bootcamp");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devNatan = new Dev();
		devNatan.setNome("Natan");
		devNatan.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos de " + devNatan.getNome() + devNatan.getConteudoInscritos());
		devNatan.progredir();
		devNatan.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos de " + devNatan.getNome() + devNatan.getConteudoInscritos());
		System.out.println("Conteúdos concluídos de " + devNatan.getNome() + devNatan.getConteudoConcluidos());
		System.out.println("XP:" + devNatan.calcularTotalXp());
		
		System.out.println("------------");
		
		Dev devPaloma = new Dev();
		devPaloma.setNome("Paloma");
		devPaloma.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos de " + devPaloma.getNome() + devPaloma.getConteudoInscritos());
		devPaloma.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos de " + devPaloma.getNome() + devPaloma.getConteudoInscritos());
		System.out.println("Conteúdos concluídos de " + devPaloma.getNome() + devPaloma.getConteudoConcluidos());
		System.out.println("XP:" + devPaloma.calcularTotalXp());
		
	}
}
