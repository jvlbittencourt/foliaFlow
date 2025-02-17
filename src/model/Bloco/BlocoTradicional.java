package model.Bloco;

import enums.EstiloMusical;
import model.Bairro;

import java.util.Date;

public class BlocoTradicional extends Bloco{
    private Date primeiroAno;

    public BlocoTradicional(String name, EstiloMusical estiloMusical, Bairro bairro, int publicoAnoAnterior) {
        super(name, estiloMusical, bairro, publicoAnoAnterior);
    }
}
