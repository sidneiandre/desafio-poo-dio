import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descriçao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descriçao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devSidnei = new Dev();
        devSinei.setNome("Sidnei");
        devSidnei.inscreverBoomtcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Sidnei:" + devSidnei.getConteudosInscritos());
        devSidnei.progredir();
        devSidnei.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Sidnei:" + devSidnei.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Sidnei:" + devSidnei.getConteudosConcluidos());
        System.out.println("XP:" + devSidnei.calcularTotalxp());

        System.out.println("-------");

        Dev devAndre = new Dev();
        devAndre.setNome("Andre");
        devAndre.inscreverBoomtcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Andre:" + devAndre.getConteudosInscritos());
        devAndre.progredir();
        devAndre.progredir();
        devAndre.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Andre:" + devAndre.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Andre:" + devAndre.getConteudosConcluidos());
        System.out.println("XP:" + devAndre.calcularTotalxp());




    }
}
