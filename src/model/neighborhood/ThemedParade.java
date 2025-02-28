package model.neighborhood;

import enums.MusicalStyle;
import model.Neighborhood;

public class ThemedParade extends Parade {
    private String tema;

    public ThemedParade(String name, MusicalStyle estiloMusical, Neighborhood bairro, int publicoAnoAnterior) {
        super(name, estiloMusical, bairro, publicoAnoAnterior);
    }
}
