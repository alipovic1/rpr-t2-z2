package ba.unsa.etf.rpr.tutorijal02;

public class Interval {

    private double pocetna, krajnja;
    private boolean pocPripada, krajPripada;

    Interval (double pocetna, double krajnja, boolean pocPripada, boolean krajPripada) {
        if (pocetna > krajnja) throw new IllegalArgumentException ("Interval nije ok!");
        this.pocetna = pocetna;
        this.krajnja = krajnja;
        this.pocPripada = pocPripada;
        this.krajPripada = krajPripada;
    }

    Interval () {
        pocetna=0;
        krajnja=0;
        pocPripada=false;
        krajPripada=false;
    }

    public boolean isNull () {
        if (pocetna == 0 && krajnja == 0 && pocPripada == false && krajPripada == false)
            return true;
        return false;
    }

    public boolean isIn (double tacka) {
        if (tacka > pocetna && tacka < krajnja && pocPripada == false && krajPripada == false) return true;
        if (tacka >= pocetna && tacka <= krajnja && pocPripada == true && krajPripada == true) return true;
        if (tacka > pocetna && tacka <= krajnja && pocPripada == false && krajPripada == true) return true;
        if (tacka >= pocetna && tacka < krajnja && pocPripada == true && krajPripada == false) return true;
        return false;
    }

    @Override
    public String toString () {
        if (pocPripada == true && krajPripada == true) return  "[" + pocetna + "," + krajnja + "]";
        else if (pocPripada == true) return "[" + pocetna + "," + krajnja + ")";
        else if (krajPripada == true) return "(" + pocetna + "," + krajnja + "]";
        else {
            if (pocetna != 0 || krajnja != 0) return "(" + pocetna + "," + krajnja + ")";
        }
        return "()";

    }

    @Override
    public boolean equals (Object o) {
        if (o == this) return true;
        if (!(o instanceof Interval)) return false;
        Interval i = (Interval) o;
       if ((Double.compare(pocetna, i.pocetna)==0 && Double.compare(krajnja, i.krajnja)==0 && pocPripada == i.pocPripada && krajPripada == i.krajPripada)
            ||
         (!(Double.compare(pocetna, i.pocetna)==0 && Double.compare(krajnja, i.krajnja)==0 && (pocPripada != i.pocPripada || krajPripada != i.krajPripada))))
            return true;
        return false;

 /*   if (Double.compare(pocetna, i.pocetna)==0 && Double.compare(krajnja, i.krajnja)==0 && pocPripada == i.pocPripada && krajPripada == i.krajPripada)return true;
    if (Double.compare(pocetna, i.pocetna)==0 && Double.compare(krajnja, i.krajnja)==0 && pocPripada != i.pocPripada && krajPripada == i.krajPripada) return false;
    if (Double.compare(pocetna, i.pocetna)==0 && Double.compare(krajnja, i.krajnja)==0 && pocPripada == i.pocPripada && krajPripada != i.krajPripada) return false;
    if (Double.compare(pocetna, i.pocetna)==0 && Double.compare(krajnja, i.krajnja)==0 && pocPripada != i.pocPripada && krajPripada != i.krajPripada) return false;
    return true; */
    }
    // drugi test ne mogu skontati


}
