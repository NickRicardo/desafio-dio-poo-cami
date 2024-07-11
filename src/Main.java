import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Sofrendo com POO");
        curso.setDescricao("Descrição curso java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Sofrendo com API");
        curso2.setDescricao("Descrição curso java api");
        curso2.setCargaHoraria(8);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devNicolas = new Dev();
        devNicolas.setNome("Nicolas Santos");
        devNicolas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Nicolas" + devNicolas.getConteudosInscritos());
        devNicolas.progredir();
        System.out.println("Conteúdos Inscritos Nicolas" + devNicolas.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Nicolas" + devNicolas.getConteudosConcluidos());
        System.out.println("XP: " + devNicolas.calcularTotalXp() );

        System.out.println(" ");
        System.out.println("=========================================================================");
        System.out.println(" ");

        Dev devRicardo = new Dev();
        devRicardo.setNome("Ricardo Ferreira");
        devRicardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ricardo" + devRicardo.getConteudosInscritos());

        devRicardo.progredir();
        System.out.println("Progredindo");

        devRicardo.progredir();
        System.out.println("Progredindo");

        System.out.println("Conteúdos Inscritos Ricardo" + devRicardo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Ricardo" + devRicardo.getConteudosConcluidos());
        System.out.println("XP: " + devRicardo.calcularTotalXp() );
    }
}
