package model.Bloco;

import enums.ClassificacaoIndicativa;
import enums.EstiloMusical;
import model.Bairro;

public class BlocoInfantil extends Bloco{
    private ClassificacaoIndicativa faixaEtaria;

    public BlocoInfantil(String name, EstiloMusical estiloMusical, Bairro bairro, int publicoAnoAnterior) {
        super(name, estiloMusical, bairro, publicoAnoAnterior);
    }
}
