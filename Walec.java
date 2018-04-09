public class Walec extends Punkt{

    private double wysokosc, promien;
    private String nazwa="Walec";

    public Walec(){
        super();
        this.setWysokosc(1);
        this.setPromien(1);
    }

    public Walec(double masa, double wysokosc, double promien){
        super(masa);
        this.setWysokosc(wysokosc);
        this.setPromien(promien);
    }

    public double momBez(){
        return 0.5*this.getMasa()*this.getPromien()*this.getWysokosc();
    }

    public void opis(){
        System.out.println(this.getNazwa());
        System.out.println("Masa: "+this.getMasa());
        System.out.println("Promien: "+this.getPromien());
        System.out.println("Wysokosc: "+this.getWysokosc());
        System.out.println("Moment bezwladnosci: "+this.momBez());
    }


    public void setWysokosc(double wysokosc){
        if(wysokosc>0) {
            this.wysokosc=wysokosc;
        }
        else{
            this.wysokosc=1;
        }
    }

    public double getWysokosc(){
        return this.wysokosc;
    }

    public void setPromien(double promien){
        if(promien>0){
            this.promien=promien;
        }
        else{
            this.promien=1;
        }
    }

    public double getPromien(){
        return this.promien;
    }

    public String getNazwa(){
        return this.nazwa;
    }

    public static void main(String[] args) {
    }



}