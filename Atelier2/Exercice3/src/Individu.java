import javax.swing.plaf.IconUIResource;

public class Individu {
    private String nom ;
    private String adresse ;
    private String numeroTele;
    private static int count = 0;
    public Individu(){
        count ++ ;
    }

    public Individu(String nom, String adresse, String numeroTele) {
        this.nom = nom;
        this.adresse = adresse;
        this.numeroTele = numeroTele;
        count ++ ;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getNumeroTele() {
        return numeroTele;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNumeroTele(String numeroTele) {
        this.numeroTele = numeroTele;
    }

    @Override
    public String toString() {
        return "Individu{" +
                "nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", numeroTele='" + numeroTele + '\'' +
                '}';
    }
    public static void instanceCount(){
        System.out.println("Le nombre d'objets crées est :" + count);
    }

}
