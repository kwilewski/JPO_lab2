public class Pret extends Punkt{

    private double dlugosc;
    private String nazwa="Pret";

    public Pret(){
        super();
        this.setDlugosc(1);
    }

    public Pret(double masa, double dlugosc){
        super(masa);
        this.setDlugosc(dlugosc);
    }

    public double momBez(){
        return (this.getMasa()*this.getDlugosc()*this.getDlugosc())/12;
    }

    public void opis(){
        System.out.println(this.getNazwa());
        System.out.println("Masa: "+this.getMasa());
        System.out.println("Dlugosc: "+this.getDlugosc());
        System.out.println("Moment bezwladnosci: "+this.momBez());
    }

    public void setDlugosc(double dlugosc){
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
