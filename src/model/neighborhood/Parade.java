package model.neighborhood;

import enums.MusicalStyle;
import model.Neighborhood;

import java.time.LocalDateTime;
import java.util.List;

public class Parade {
    private static List<Parade> blocos;

    private String name;
    private MusicalStyle musicalStyle;
    private Neighborhood neighborhood;
    private LocalDateTime dateAndTime;
    private int previousPublic;

    public Parade(String name, MusicalStyle musicalStyle, Neighborhood neighborhood, int previousPublic) {
        this.name = name;
        this.neighborhood = neighborhood;
        this.musicalStyle = musicalStyle;
        this.previousPublic = previousPublic;
    }

    @Override
    public String toString() {
        return "Bloco{" +
                "name='" + name + '\'' +
                ", musicalStyle=" + musicalStyle +
                ", neighborhood=" + neighborhood +
                ", dateAndTime=" + dateAndTime +
                ", previousPublic=" + previousPublic +
                '}';
    }
}
