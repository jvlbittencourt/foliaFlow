package utils;

import jdk.jshell.execution.LoaderDelegate;
import model.Neighborhood;
import model.neighborhood.Parade;

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
    private Bairro neighborhood;
    private Bloco parade;
    private LocalDateTime dateTime;

    public Agenda(Bairro neighborhood, Bloco parade, LocalDateTime dateTime){
        this.idAgenda = id++;
        this.neighborhood = neighborhood;
        this.parade = parade;
        this.dateTime = dateTime;
        agendas.add(this);
    }
}*/

public class Schedule {
    private static HashMap<Neighborhood, HashMap<LocalDateTime, Parade>> scheduleByNeighborhood = new HashMap<>();

    public Schedule(Neighborhood neighborhood) {
        scheduleByNeighborhood.put(neighborhood, null);

    }

    public boolean verificaDisponibilidade(Neighborhood neighborhood, LocalDateTime dateTime, Parade parade) {
        return scheduleByNeighborhood.get(neighborhood).get(dateTime) == null;
    }

    public void setAgenda(Neighborhood neighborhood, LocalDateTime dateTime, Parade parade) {
        HashMap<LocalDateTime, Parade> temporarySchedule = new HashMap<>();
        temporarySchedule.put(dateTime, parade);
        scheduleByNeighborhood.put(neighborhood, temporarySchedule);
    }

}