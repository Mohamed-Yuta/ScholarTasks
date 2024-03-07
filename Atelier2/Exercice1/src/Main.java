public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(2);
        point.setY(4.5);

        point.afficher();
        point.deplacer(1,2);
        point.afficher();

        System.out.println("La distance est :"+point.distance(new Point(1,2)));
        System.out.println(point.homothétie(4));
        point.rho();
        point.theta();
        point.afficherPolaires();

        System.out.println(point.rotation(5));
    }
}