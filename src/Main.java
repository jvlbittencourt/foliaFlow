import enums.EstiloMusical;
import enums.Regiao;
import model.Bairro;
import model.Bloco.Bloco;
import model.Bloco.BlocoInfantil;
import model.Bloco.BlocoTematico;
import model.Bloco.BlocoTradicional;

public class Main {
    public static void main(String[] args) {
        Bairro laranjeiras = new Bairro("Laranjeiras", Regiao.ZS );
        Bairro ipanema = new Bairro("ipanema", Regiao.ZS );
        Bairro lapa = new Bairro("Lapa", Regiao.ZC );
        Bairro centro = new Bairro("Centro", Regiao.ZC );
        Bairro jacarepagua = new Bairro("Jacarepagua", Regiao.ZO );
        Bairro bangu = new Bairro("bangu", Regiao.ZO );

        BlocoTradicional bolaPreta = new BlocoTradicional("Bola Preta", EstiloMusical.MARCHINHA, centro, 100000 );
        BlocoInfantil hihappy = new BlocoInfantil("hihappy", EstiloMusical.INFANTIL, ipanema, 5000 );
        BlocoTematico beatles = new BlocoTematico("Beatles", EstiloMusical.ROCK, lapa, 150000);
        Bloco batucar = new Bloco("Batucar para ser Feliz", EstiloMusical.SAMBA, jacarepagua, 10000);
        Bloco bandaBangu = new BlocoTradicional("Banda de Bangu", EstiloMusical.MARCHINHA, bangu, 25000);
        BlocoTematico fluzao = new BlocoTematico("Fluzão", EstiloMusical.MARCHINHA, laranjeiras, 10000);

        System.out.println(bolaPreta.toString());
        System.out.println(hihappy.toString());
        System.out.println(batucar.toString());
        System.out.println(bandaBangu.toString());
        System.out.println(beatles.toString());
        System.out.println(fluzao.toString());



    }
}
