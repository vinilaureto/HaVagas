package com.vinilaureto.havagas;

public class Basic implements Formation {
    private String year;

    public Basic(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Ensino básico: " + '\n' +
                "Ano de conclusão='" + year + '\n';
    }
}
