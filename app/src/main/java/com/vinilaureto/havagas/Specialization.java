package com.vinilaureto.havagas;

public class Specialization implements Formation {
    private String year;
    private String institution;

    public Specialization(String year, String institution) {
        this.year = year;
        this.institution = institution;
    }

    @Override
    public String toString() {
        return "Especialização: " +
                "Ano de conclusão: " + year + '\n' +
                "Instituição: " + institution + '\n';
    }
}
