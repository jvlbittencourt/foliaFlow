import enums.MusicalStyle;
import enums.Region;
import model.Neighborhood;
import model.neighborhood.BlocoInfantil;
import model.neighborhood.Parade;
import model.neighborhood.ThemedParade;
import model.neighborhood.TraditionalParade;

public class Main {
    public static void main(String[] args) {
        Neighborhood laranjeiras = new Neighborhood("Laranjeiras", Region.ZS);
        Neighborhood ipanema = new Neighborhood("ipanema", Region.ZS);
        Neighborhood lapa = new Neighborhood("Lapa", Region.ZC);
        Neighborhood centro = new Neighborhood("Centro", Region.ZC);
        Neighborhood jacarepagua = new Neighborhood("Jacarepagua", Region.ZO);
        Neighborhood bangu = new Neighborhood("bangu", Region.ZO);

        TraditionalParade bolaPreta = new TraditionalParade("Bola Preta", MusicalStyle.MARCHINHA, centro, 100000);
        BlocoInfantil hihappy = new BlocoInfantil("hihappy", MusicalStyle.INFANTIL, ipanema, 5000);
        ThemedParade beatles = new ThemedParade("Beatles", MusicalStyle.ROCK, lapa, 150000);
        Parade batucar = new Parade("Batucar para ser Feliz", MusicalStyle.SAMBA, jacarepagua, 10000);
        Parade bandaBangu = new TraditionalParade("Banda de Bangu", MusicalStyle.MARCHINHA, bangu, 25000);
        ThemedParade fluzao = new ThemedParade("Fluzão", MusicalStyle.MARCHINHA, laranjeiras, 10000);

        System.out.println(bolaPreta.toString());
        System.out.println(hihappy.toString());
        System.out.println(batucar.toString());
        System.out.println(bandaBangu.toString());
        System.out.println(beatles.toString());
        System.out.println(fluzao.toString());

    }
}
