package hu.petrik.dbdemo;

public class Dolgozo {
    private int id;
    private String nev;
    private String nem;
    private int kor;
    private int fizetes;

    public Dolgozo(int id, String nev, String nem, int kor, int fizetes) {
        this.id = id;
        this.nev = nev;
        this.nem = nem;
        this.kor = kor;
        this.fizetes = fizetes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setNem(String nem) {
        this.nem = nem;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setFizetes(int fizetes) {
        this.fizetes = fizetes;
    }

    public int getId() {
        return id;
    }

    public String getNev() {
        return nev;
    }

    public String getNem() {
        return nem;
    }

    public int getKor() {
        return kor;
    }

    public int getFizetes() {
        return fizetes;
    }

    @Override
    public String toString() {
        return String.format("%4d. %30s (%3d) %6s %9d", this.id, this.nev, this.kor, this.nem, this.fizetes );
    }
}
