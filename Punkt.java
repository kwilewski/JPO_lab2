public class Punkt {

    private double masa;        //prywatne pole masy

    public Punkt(){        //konstruktor domyślny
        this.masa=1;
    }

    public Punkt(double masa){       //konstruktor z parametrem
        setMasa(masa);
    }

    public double momBez(){          //Metoda obliczajaca glowny moment bezładnosci
        int I=0;
        return I;

        }

    public double MBS(double x){        //Metoda przyjmująca parametr obliczajaca moment bezwladności z tw. Steinera
        return momBez()+getMasa()*x*x;

    }

    public void opis(){         //Metoda zwracająca stały opis obiektu
        System.out.println("Punkt Materialny");
    }

    public void setMasa(double masa){          //mutator
        if(masa>0){
            this.masa = masa;
        }
        else{
            this.masa=1;
        }
    }

    public double getMasa(){           //akcesor
        return this.masa;
    }

    public static void main(String[] args) {
    }


}

