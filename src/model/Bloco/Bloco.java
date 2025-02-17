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

    public Bloco(String name, EstiloMusical estiloMusical, Bairro bairro, int publicoAnoAnterior){
        this.nome = nome;
        this.bairro = bairro;
        this.estiloMusical = estiloMusical;
        this.publicoAnoAnterior = publicoAnoAnterior;
    }

    @Override
    public String toString() {
        return "Bloco{" +
                "nome='" + nome + '\'' +
                ", estiloMusical=" + estiloMusical +
                ", bairro=" + bairro +
                ", dataHora=" + dataHora +
                ", publicoAnoAnterior=" + publicoAnoAnterior +
                '}';
    }
}
