package model;

import enums.Region;
import model.neighborhood.Parade;
import utils.Schedule;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Neighborhood {
    private static List<Neighborhood> neighborhoodParades = new ArrayList<Neighborhood>();
    private static HashMap<LocalDateTime, Parade> neighborhoodSchedule;

    private Schedule schedule;
    private String name;
    private Region region;

    public Neighborhood(String name, Region region) {
        this.name = name;
        this.region = region;
        this.schedule = new Schedule(this);
        neighborhoodParades.add(this);
    }

    public static HashMap<LocalDateTime, Parade> getNeighborhoodSchedule() {
        return neighborhoodSchedule;
    }

    // verificar depois melhor retorno
    public boolean setAgenda(Parade parade, LocalDateTime dateTime) {
        if (schedule.verificaDisponibilidade(this, dateTime, parade)) {
            schedule.setAgenda(this, dateTime, parade);
            return true;
        } else {
            return false;
        }
    }

    public Region getRegion() {
        return region;
    }

    public void setRegiao(Region region) {
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Neighborhood> getNeighborhoodParade() {
        return neighborhoodParades;
    }

    public static void setBlocosDoBairro(List<Neighborhood> neighborhoodParades) {
        Neighborhood.neighborhoodParades = neighborhoodParades;
    }

    @Override
    public String toString() {
        return "Bairro{" +
                "schedule=" + schedule +
                ", name='" + name + '\'' +
                ", region=" + region +
                '}';
    }
}
