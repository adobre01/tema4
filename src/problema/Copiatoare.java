package problema;

import java.text.Format;

public class Copiatoare extends Echipament {
    private int p_ton;
    private Format format;

    public Copiatoare(){}

    public Copiatoare(String denumire, int nr_inv, double pret, String zona_mag, Echipament.Tip tip, Situatie situatie, int p_ton,
                      Format)
    {
        super();
        this.p_ton=p_ton;
        this.format=format;

    }
    //public Copiatoare(Echipament e,int )
    public String toString()
    {
        return (super.toString() + ", Pagini/Toner: " + p_ton + ", Format Copiere: " + format);
    }

    public void setFormat(String form)
    {
        format=Format.valueOf(form);
    }

    public Format getFormat()
    {
        return format;
    }
    enum Format
    {
        A3,
        A4
    }

}
