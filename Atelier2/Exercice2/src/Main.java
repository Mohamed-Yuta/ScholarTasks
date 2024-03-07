import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Question 2");
        De de = new De();
        de.lancer();
        System.out.println("le nombre est : " + de.getValeur());

        System.out.println("*****************************");

        System.out.println("Question 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre svp :");
        int n = scanner.nextInt();
        De de2 = new De();
        for (int i =0 ; i<n ; i++){
            de2.lancer();
            System.out.println("le nombre est : " + de2.getValeur());
        }

        System.out.println("*****************************");

        System.out.println("Question 4");
        System.out.println("Entrez un nombre svp :");

        int nombre = scanner.nextInt();
        De de3 = new De();
        De de4 = new De();
        int count = 0 ;


        for (int i =0 ; i<nombre;i++){
            de3.lancer();
            de4.lancer();
            System.out.println("Le nombre de dé 1 est : " + de3.getValeur());
            System.out.println("Le nombre de dé 2 est : "+de4.getValeur());
            if (de3.getValeur()==de4.getValeur()){
                System.out.println("tu as gangé");
                count ++ ;
            }
        }
        System.out.println("tu as gagné " + count + " fois !!!");

    }
}