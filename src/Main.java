import geometrijski_likovi.Trokut;

public class Main {
    public static void main(String[] args) {
        Trokut trokut1 = new Trokut("Test trokut", 3.0, 4.0, 5.0);

        System.out.println("Naziv: " + trokut1.getNaziv());
        System.out.println("Stranice: A=" + trokut1.getStranicaA() +
                ", B=" + trokut1.getStranicaB() +
                ", C=" + trokut1.getStranicaC());


        trokut1.setNaziv("Testni trokut - novo ime");
        trokut1.setStranicaA(6.0);
        System.out.println("Novi naziv: " + trokut1.getNaziv());
        System.out.println("Nova vrijednost stranice A: " + trokut1.getStranicaA());


        System.out.println();
        Trokut trokut2 = new Trokut("Drugi trokut", 2.5, 2.5, 3.0);
        System.out.println("Naziv: " + trokut2.getNaziv());
        System.out.println("Stranice: A=" + trokut2.getStranicaA() +
                ", B=" + trokut2.getStranicaB() +
                ", C=" + trokut2.getStranicaC());



        System.out.println();
        Trokut trokut3 = new Trokut("geometrijski_likovi.Trokut broj tri", 5.0, 5.0, 5.0);
        System.out.println("Naziv: " + trokut3.getNaziv());
        System.out.println("Stranice: A=" + trokut3.getStranicaA() +
                ", B=" + trokut3.getStranicaB() +
                ", C=" + trokut3.getStranicaC());




        trokut3.setStranicaA(7.0);
        trokut3.setStranicaB(8.0);
        trokut3.setStranicaC(9.0);
        System.out.println("Trokut3 nakon izmjena:");
        System.out.println("A=" + trokut3.getStranicaA() +
                ", B=" + trokut3.getStranicaB() +
                ", C=" + trokut3.getStranicaC());
    }
}
