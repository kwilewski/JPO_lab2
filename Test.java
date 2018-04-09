import java.util.*;
public class Test {

    public static void main(String[] args) {
        Walec w2 = new Walec(2, 5, 10);
        Kula k2 = new Kula(5, 8);
        Pret p2 = new Pret(3, 7);
        w2.opis();
        k2.opis();
        p2.opis();

        ArrayList<Punkt> tab = new ArrayList<Punkt>();
        for (int i=0;i<4;i++) {
            tab.add(new Walec(i+1,3*i,5*i-6));
            tab.add(new Kula(2*i+5,6*i));
            tab.add(new Pret(i-1,i+2));
        }
        for (int i=0;i<12;i++) {
            tab.get(i).opis();
        }
        for (int i=0;i<12;i++) {
            System.out.println("Moment bezwladnosci w odleglosci 5: "+tab.get(i).MBS(5));
        }
    }

}
