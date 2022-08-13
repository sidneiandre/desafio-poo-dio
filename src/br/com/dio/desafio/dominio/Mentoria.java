package br.com.dio.desafio.dominio;

public class Mentoria extends Conteudo {

import java.time.LocalDate;
    private LocalDate data;

    @java.lang.Override
    public double calcularxp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDesccricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
