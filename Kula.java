public class Kula extends Punkt{

    private double promien;
    private String nazwa="Kula";

    public Kula(){
        super();
        this.setPromien(1);
    }

    public Kula(double masa, double promien){
        super(masa);
        this.setPromien(promien);
    }

    public double momBez(){
        return 0.2*this.getMasa()*this.getPromien()*this.getPromien();
    }

    public void opis(){
        System.out.println(this.getNazwa());
        System.out.println("Masa: "+this.getMasa());
        System.out.println("Promien: "+this.getPromien());
        System.out.println("Moment bezwladnosci: "+this.momBez());
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
