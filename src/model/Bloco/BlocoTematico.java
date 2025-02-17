package model.Bloco;

import enums.EstiloMusical;
import model.Bairro;

public class BlocoTematico extends Bloco{
    private String tema;

    public BlocoTematico(String name, EstiloMusical estiloMusical, Bairro bairro, int publicoAnoAnterior) {
        super(name, estiloMusical, bairro, publicoAnoAnterior);
    }
}
