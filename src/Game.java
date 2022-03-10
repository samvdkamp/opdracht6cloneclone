import java.time.LocalDate;
import java.lang.Math;

public class Game {

    String naam;
    int releaseJaar;
    double nieuwPrijs;

    public Game(String nm, int rJ, double nwpr){
        naam = nm;
        rJ = releaseJaar;
        nieuwPrijs = nwpr;
    }

    public String getNaam(){
        return naam;
    }

    public double huidigeWaarde(){
        return nieuwPrijs * Math.pow(0.7, 1);
    }

    public boolean equals(Game andereObject){
        if(this.naam == andereObject.getNaam() && this.releaseJaar == andereObject.releaseJaar){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: " + nieuwPrijs + " nu voor: " + huidigeWaarde() + "\n";
    }
}
