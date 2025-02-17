package model;

import enums.Regiao;
import model.Bloco.Bloco;
import utils.Agenda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bairro {
    private static List<Bairro> blocosDoBairro = new ArrayList<Bairro>();
    private static HashMap<LocalDateTime, Bloco> agendaDoBairro;

    private Agenda agenda;
    private String nome;
    private Regiao regiao;

    public Bairro(String nome, Regiao regiao){
        this.nome = nome;
        this.regiao = regiao;
        this.agendaDoBairro = new HashMap<>();
        this.agenda = new Agenda(this);
        blocosDoBairro.add(this);
    }

    public static HashMap<LocalDateTime, Bloco> getAgendaDoBairro() {
        return agendaDoBairro;
    }

    //verificar depois melhor retorno
    public boolean setAgenda(Bloco bloco, LocalDateTime dataHora){
        if (agenda.verificaDisponibilidade(this,dataHora,bloco)){
            agenda.setAgenda(this, dataHora, bloco);
            return true;
        }else{
            return false;
        }
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static List<Bairro> getBlocosDoBairro() {
        return blocosDoBairro;
    }

    public static void setBlocosDoBairro(List<Bairro> blocosDoBairro) {
        Bairro.blocosDoBairro = blocosDoBairro;
    }

    @Override
    public String toString() {
        return "Bairro{" +
                "agenda=" + agenda +
                ", nome='" + nome + '\'' +
                ", regiao=" + regiao +
                '}';
    }
}
