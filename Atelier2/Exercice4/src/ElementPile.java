public class ElementPile {
    private int valeur;
    private ElementPile suivant;

    public ElementPile(int valeur) {
        this.valeur = valeur;
        this.suivant = null;
    }

    public int getValeur() {
        return valeur;
    }

    public ElementPile getSuivant() {
        return suivant;
    }

    public void setSuivant(ElementPile suivant) {
        this.suivant = suivant;
    }
}