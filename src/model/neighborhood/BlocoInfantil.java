package model.neighborhood;

import enums.ClassificacaoIndicativa;
import enums.MusicalStyle;
import model.Neighborhood;

public class BlocoInfantil extends Parade {
    private ClassificacaoIndicativa ageRange;

    public BlocoInfantil(String name, MusicalStyle musicalStyle, Neighborhood neighborhood, int previousPublic) {
        super(name, musicalStyle, neighborhood, previousPublic);
    }
}
