package com.vinilaureto.havagas;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private boolean emailList;
    private String phone;
    private SexValue sex;
    private List<Formation> formations = new ArrayList<>();
    private String jobs;
    private String smartphone;

    public User(String name, String email, boolean emailList, String phone, boolean sex, String jobs) {
        this.name = name;
        this.email = email;
        this.emailList = emailList;
        this.phone = phone;
        if (sex) {
            this.sex = SexValue.MASC;
        } else {
            this.sex = SexValue.FEM;
        }
        this.jobs = jobs;
    }

    public void addFormation(Formation formation) {
        formations.add(formation);
    }

    public void setSmartphone(String smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public String toString() {
        return "Nome: " + name + '\n' +
                "E-mail='" + email + '\n' +
                "Aceitou a lista de email: " + (emailList ? "Aceitou" : "Negou") + '\n' +
                "Telefone: " + phone + '\n' +
                "Celular: " + smartphone + '\n' +
                "Sexo: " + sex + '\n' +
                "Formações: " + '\n' + formations + '\n' +
                "Vagas de interesse: " + jobs + '\n';
    }
}
