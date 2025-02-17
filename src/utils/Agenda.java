package utils;

import jdk.jshell.execution.LoaderDelegate;
import model.Bairro;
import model.Bloco.Bloco;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/*
public class Agenda {
    private static List<Agenda> agendas = new ArrayList<>();
    private static long id = 0;

    private long idAgenda;
    private Bairro bairro;
    private Bloco bloco;
    private LocalDateTime dataHora;

    public Agenda(Bairro bairro, Bloco bloco, LocalDateTime dataHora){
        this.idAgenda = id++;
        this.bairro = bairro;
        this.bloco = bloco;
        this.dataHora = dataHora;
        agendas.add(this);
    }
}*/

public class Agenda{
    private static HashMap<Bairro, HashMap<LocalDateTime, Bloco>> agendaPorBairro = new HashMap<>();

    public Agenda (Bairro bairro) {
        agendaPorBairro.put(bairro,null);

    }
    public boolean verificaDisponibilidade(Bairro bairro, LocalDateTime dataHora, Bloco bloco) {
        return agendaPorBairro.get(bairro).get(dataHora) == null;
    }

    public void setAgenda(Bairro bairro, LocalDateTime dataHora, Bloco bloco){
        HashMap<LocalDateTime, Bloco> agendaTemp = new HashMap<>();
        agendaTemp.put(dataHora, bloco);
        agendaPorBairro.put(bairro, agendaTemp);
    }





}