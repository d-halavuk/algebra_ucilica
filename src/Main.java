import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Krug krug1 = new Krug("k1",10);
        Krug krug2 = new Krug("k2",  5);

        Pravokutnik pravokutnik1 = new Pravokutnik("p1",10,5);
        Pravokutnik pravokutnik2 = new Pravokutnik("p2",3,3);

        Ucilica ucilica = new Ucilica();

        ucilica.getLikovi().add(krug1);
        ucilica.getLikovi().add(krug2);
        ucilica.getLikovi().add(pravokutnik1);
        ucilica.getLikovi().add(pravokutnik2);

        Collections.sort(ucilica.getLikovi());

        for(GeometrijskiLik lik : ucilica.getLikovi()) {
            System.out.println(lik.toString());
        }
    }
}