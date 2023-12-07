package problema;


public class Echipament {
    private  String denumire;
    private  int nr_inv;
    private float pret;
    private  String zona_mag;
    private Situatie situatie;
    private Tip tip;

    public Echipament(){}


    public Echipament(String denumire,int nr_inv,float pret,String zona_mag,Situatie situatie,Tip tip)
    {
        this.denumire=denumire;
        this.nr_inv=nr_inv;
        this.pret=pret;
        this.zona_mag=zona_mag;
        this.situatie=situatie;
        this.tip=tip;
    }

    @Override public String toString()
    {
        return ("Denumire: " + denumire + ", Nr. Inventar: " + nr_inv + ", Pret: " + pret + ",Zona mag: "+zona_mag+ ",Situatie: "+situatie+",Tip: "+tip);
    }
    enum Stare
    {
        Achizionat,
        Expus,
        Vandut
    }
    enum Tip
    {
        imprimanta,
        copiator,
        sistem_de_calcul
    }

    public Tip getTip()
    {
        return tip;
    }

    public String getDenumire()
    {
        return denumire;
    }

    public void setStare(String stare)
    {
        situatie=Situatie.valueOf(stare);
    }

    public String getStare()
    {
        return situatie.toString();
    }

}
