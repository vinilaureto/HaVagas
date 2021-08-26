package com.vinilaureto.havagas;

public enum SexValue {
    MASC ("Masculino"),
    FEM ("Feminino");

    private String label;
    SexValue(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
