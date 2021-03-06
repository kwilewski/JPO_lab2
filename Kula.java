public class Kula extends Punkt{

    private double promien;
    private String nazwa="Kula";

    public Kula(){          //konstruktor domyslny
        super();
        this.setPromien(1);
    }

    public Kula(double masa, double promien){           //konstruktor z parametrami
        super(masa);
        this.setPromien(promien);
    }

    public double momBez(){
        return 0.2*this.getMasa()*this.getPromien()*this.getPromien();
    }

    public double momBezSt(double x){
        return momBez()+getMasa()*x*x;
    }

    public void opis(){
        System.out.println(this.getNazwa());
        System.out.println("Masa: "+this.getMasa());
        System.out.println("Promien: "+this.getPromien());
        System.out.println("Moment bezwladnosci: "+this.momBez());
    }

    public void setPromien(double promien){         //akcesor z kontrola wartosci
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
