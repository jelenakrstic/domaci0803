package domaci0803;

public class Njiva extends Parcela {

    private double prinosNjive;

    public Njiva(double povrsina, double prinosNjive) {
        super(povrsina);
        this.prinosNjive = prinosNjive;
    }

    public void setPrinosNjive(int prinosNjive) {
        this.prinosNjive = prinosNjive;
    }

    public double getPrinosNjive() {
        return prinosNjive;
    }

    @Override
    public char getVrsta() {
        return 'N';
    }

    @Override
    public double prinos(int godina) {
        return getPovrsina() * prinosNjive * godina;
    }

    public String toString() {
        return super.toString() + ":" + prinosNjive;
    }
}


