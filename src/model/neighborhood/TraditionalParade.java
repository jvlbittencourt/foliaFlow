package model.neighborhood;

import enums.MusicalStyle;
import model.Neighborhood;

import java.util.Date;

public class TraditionalParade extends Parade {
    private Date firstYear;

    public TraditionalParade(String name, MusicalStyle estiloMusical, Neighborhood bairro, int publicoAnoAnterior) {
        super(name, estiloMusical, bairro, publicoAnoAnterior);
    }
}
