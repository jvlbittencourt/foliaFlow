package model.Bloco;

import enums.EstiloMusical;
import model.Bairro;

import java.time.LocalDateTime;
import java.util.List;

public class Bloco {
    private static List<Bloco> blocos;

    private String nome;
    private EstiloMusical estiloMusical;
    private Bairro bairro;
    private LocalDateTime dataHora;
    private int publicoAnoAnterior;
}
