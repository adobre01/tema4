package problema;

public class Sistem_calcul extends Echipament {
    private String tip_mon;
    private float vit_proc;
    private float c_hdd;
    private  Sistem_operare sistem;

    public Sistem_calcul(){}
    public Sistem_calcul(String denumire, int nr_inv, double pret, String zona_mag,Situatie situatie, Echipament.Tip tip, String tip_mon, float vit_proc, float c_hdd, Sistem_operare sistem){
        super();
        this.tip_mon=tip_mon;
        this.vit_proc=vit_proc;
        this.c_hdd=c_hdd;
        this.sistem=sistem;

    }
    @Override public String toString()
    {
        return (super.toString() + ", Monitor: " + tip_mon + ", Viteza procesor: " + vit_proc+",Capacitate: "+c_hdd+",Sistem de operare: "+sistem);
    }
    public void setSistem(String sist)
    {
        sistem=Sistem_operare.valueOf(sist);
    }

    public Sistem_operare getSistem()
    {
        return sistem;
    }
    enum sistem_operare
    {
        Windows,
        Linux
    }


}
