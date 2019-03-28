package domaci0803;

public class Suma extends Parcela {

    private double povrsinaStabla;
    private double prinosStablo;
    private int periodSazrevanja;

    public Suma(double povrsina, double povrsinaStabla, double prinosStablo, int periodSazrevanja) {
        super(povrsina);
        this.povrsinaStabla = povrsinaStabla;
        this.prinosStablo = prinosStablo;
        this.periodSazrevanja = periodSazrevanja;
    }

    @Override
    public double prinos(int godina) {
        return getPovrsina() / povrsinaStabla * prinosStablo * (godina / periodSazrevanja);
    }

    @Override
    public char getVrsta() {
        return 'S';
    }

    public String toString() {
        return super.toString() + ":(" + povrsinaStabla + ", " + prinosStablo + ", " + periodSazrevanja + ")";
    }
}


