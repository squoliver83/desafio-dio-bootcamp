import entities.Bootcamp;
import entities.Curso;
import entities.Dev;
import entities.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devSamuel = new Dev();
        devSamuel.setNome("Samuel");
        devSamuel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Samuel:" + devSamuel.getConteudosInscritos());
        devSamuel.progredir();
        devSamuel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Samuel:" + devSamuel.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Samuel:" + devSamuel.getConteudosConcluidos());
        System.out.println("XP:" + devSamuel.calcularXpTotal());

        System.out.println("---------");

        Dev devFabiana = new Dev();
        devFabiana.setNome("Fabiana");
        devFabiana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Fabiana:" + devFabiana.getConteudosInscritos());
        devFabiana.progredir();
        devFabiana.progredir();
        devFabiana.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Fabiana:" + devFabiana.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Fabiana:" + devFabiana.getConteudosConcluidos());
        System.out.println("XP:" + devFabiana.calcularXpTotal());

    }
}
