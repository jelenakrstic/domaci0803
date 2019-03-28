package domaci0803;

public abstract class Parcela {

    private static int uid = 1;

    private int id;
    private double povrsina;

    public Parcela(double povrsina) {
        this.id = uid++;
        this.povrsina = povrsina;
    }

    public int getId() {
        return id;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public abstract char getVrsta();

    @Override
    public String toString() {
        return getVrsta() + "-" + id + "[ " + povrsina + "]";
    }

    public abstract double prinos(int godina);

}


