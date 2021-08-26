package com.vinilaureto.havagas;

public class Graduation implements Formation {
    private String year;
    private String institution;

    public Graduation(String year, String institution) {
        this.year = year;
        this.institution = institution;
    }

    @Override
    public String toString() {
        return "Graduação: " +
                "Ano de conclusão: " + year + '\n' +
                "Instituição: " + institution + '\n';
    }
}
