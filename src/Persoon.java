import java.util.ArrayList;

public class Persoon {

    String naam;
    double budget;
    ArrayList<Game> games = new ArrayList<Game>();

    public Persoon(String nm, double bud){
        naam = nm;
        budget = bud;
    }

    public double getBudget(){
        return budget;
    }

    public boolean koop(Game g){
        if(g.huidigeWaarde() <= budget) {
            for (Game game : games) {
                if (game.equals(g)) {
                    return false;
                }
            }
            games.add(g);
            budget = budget - g.huidigeWaarde();
            return true;
        }
        else{
            return false;
        }
    }

    public boolean verkoop(Game g, Persoon koper) {
        for (Game game : games) {
            if (game.equals(g)) {
                if(koper.koop(g)){
                    games.remove(game);
                    budget = budget + g.huidigeWaarde();
                    return true;
                }

            }
        }
        return false;
    }

    public Game zoekGameOpNaam(String nm){
        for(Game game: games){
            if(game.getNaam().equals(nm)){
                return game;
            }
        }
        return null;
    }


    public String toString(){
        return naam + "heeft een budget van " + budget + " en bezit de volgende games: \n" + games.toString();
    }
}
