public class Pile {
    private ElementPile sommet;
    public Pile() {
        this.sommet = null;
    }
    public boolean estVide() {
        return sommet == null;
    }

    public void empile(int valeur) {
        ElementPile nouvelElement = new ElementPile(valeur);
        nouvelElement.setSuivant(sommet);
        sommet = nouvelElement;
    }

    public int depile() {
        if (estVide()) {
            throw new IllegalStateException("La pile est vide");
        }
        int valeurSommet = sommet.getValeur();
        sommet = sommet.getSuivant();
        return valeurSommet;
    }

    public int sommet() {
        if (estVide()) {
            throw new IllegalStateException("La pile est vide");
        }
        return sommet.getValeur();
    }

    public void affiche() {
        ElementPile courant = sommet;
        while (courant != null) {
            System.out.println(courant.getValeur());
            courant = courant.getSuivant();
        }
    }

    // Classe interne représentant un élément de pile
    private static class ElementPile {
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
}