package domaci0803;

public class Glavni {

    public static void main(String[] args) {

        Parcela[] parcele = new Parcela[3];
        int godina = 3;

        parcele[0] = new Suma(100, 70, 150, 2);
        parcele[1] = new Njiva(20, 30);
        parcele[2] = new Njiva(40, 35);

        System.out.println(parcele[0].prinos(godina));
        System.out.println(parcele[1].prinos(godina));
        System.out.println(parcele[2].prinos(godina));
    }
}


