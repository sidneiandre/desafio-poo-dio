package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    @java.lang.Override
    public double calcularxp() {
        return XP-PADRAO * cargaHoraria;
    }

    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Curso{" +
                "titulo='" + getTitulo()+ '\'' +
                ", descricao='" + getDesccricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}
