package com.vinilaureto.havagas;

public class Medium implements Formation {
    private String year;

    public Medium(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Ensino médio: " + '\n' +
                "Ano de conclusão='" + year + '\n';
    }
}
