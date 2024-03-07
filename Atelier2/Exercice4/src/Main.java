public class Main {
    public static void main(String[] args) {
        Pile pile = new Pile();
        System.out.println("La pile est vide ? " + pile.estVide());


        pile.empile(10);
        pile.empile(20);
        pile.empile(30);
        pile.affiche();
        System.out.println("Sommet de la pile : " + pile.sommet());


        System.out.println("Dépile : " + pile.depile());


        pile.affiche();
        System.out.println("La pile est vide ? " + pile.estVide());
    }
}