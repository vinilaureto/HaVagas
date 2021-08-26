package com.vinilaureto.havagas;

public class Phd implements Formation {
    private String year;
    private String institution;
    private String title;
    private String orientation;

    public Phd(String year, String institution, String title, String orientation) {
        this.year = year;
        this.institution = institution;
        this.title = title;
        this.orientation = orientation;
    }

    @Override
    public String toString() {
        return "Doutorado: "+
                "Ano de conclusão: " + year + '\n' +
                "Instituição: " + institution + '\n' +
                "Título da tese: " + title + '\n' +
                "Orientação: " + orientation + '\n';
    }
}
