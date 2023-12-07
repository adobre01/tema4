package problema;

import java.awt.*;

public class Imprimante extends Echipament {
    private int ppm;
    private String dpi;
    private int p_car;
    private Tiparire tiparire;

    public Imprimante(){}

    public Imprimante(String denumire, int nr_inv, float pret, String zona_mag, Situatie situatie, Echipament.Tip tip, int ppm, String dpi, int p_car,
                      Tiparire tiparire) {
        super();
        this.ppm = ppm;
        this.dpi = dpi;
        this.p_car = p_car;
        this.tiparire = tiparire;

    }

    @Override public String toString() {
        return (super.toString() + ", PPM: " + ppm + ", DPI: " + dpi + ", Pagini/Carut: " + p_car + ", Tiparire: " + tiparire);
    }

    public void setMod(String mod) {
        tiparire = Tiparire.valueOf(mod);
    }

    public Tiparire getMod_tiparire() {
        return tiparire;
    }

    enum Tiparire {
        color,
        alb,
        negru
    }
}


