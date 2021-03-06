public class Pret extends Punkt{

    private double dlugosc;
    private String nazwa="Pret";

    public Pret(){          //konstruktor domyslny
        super();
        this.setDlugosc(1);
    }

    public Pret(double masa, double dlugosc){           //konstruktor z parametrami
        super(masa);
        this.setDlugosc(dlugosc);
    }

    public double momBez(){
        return (this.getMasa()*this.getDlugosc()*this.getDlugosc())/12;
    }

    public double momBezSt(double x){
        return momBez()+getMasa()*x*x;
    }

    public void opis(){
        System.out.println(this.getNazwa());
        System.out.println("Masa: "+this.getMasa());
        System.out.println("Dlugosc: "+this.getDlugosc());
        System.out.println("Moment bezwladnosci: "+this.momBez());
    }

    public void setDlugosc(double dlugosc){         //akcesor z kontrola wartosci
        if(dlugosc>0){
            this.dlugosc=dlugosc;
        }
        else{
            this.dlugosc=1;
        }
    }

    public double getDlugosc(){
        return this.dlugosc;
    }

    public String getNazwa(){
        return this.nazwa;
    }

    public static void main(String[] args) {
    }



}
