package com.vinilaureto.havagas;

public class Master implements Formation {
    private String year;
    private String institution;
    private String title;
    private String orientation;

    public Master(String year, String institution, String title, String orientation) {
        this.year = year;
        this.institution = institution;
        this.title = title;
        this.orientation = orientation;
    }

    @Override
    public String toString() {
        return "Mestrado: "+
                "Ano de conclusão: " + year + '\n' +
                "Instituição: " + institution + '\n' +
                "Título da dissertação: " + title + '\n' +
                "Orientação: " + orientation + '\n';
    }
}
