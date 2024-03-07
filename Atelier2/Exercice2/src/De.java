import java.util.Random;

public class De {
    private int valeur;
    Random random = new Random();
    public De(){

    }
    public int getValeur(){
        return valeur ;
    }
    public void lancer(){
        valeur = random.nextInt(6)+1;
    }
}
