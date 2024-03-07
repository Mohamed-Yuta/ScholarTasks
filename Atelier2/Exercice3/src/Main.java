import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    private int nbre = 0 ;
    private List<Individu> list ;
    public Main(){
        list = new ArrayList<>();
    }
    public void addIndividu(Individu individu){
        list.add(individu);
        nbre ++ ;
    }
    public void deleteIndividu(Individu individu){
        list.remove(individu);
        System.out.println("Individu supprimé");
    }
    public void showAll(){
        list.forEach(System.out::println);
    }
    public static void main(String[] args) {

        Main main = new Main();
        Stream.of("Amine","Hassan","Ahmed").forEach(nom->{
            Individu individu = new Individu();
            individu.setNom(nom);
            individu.setAdresse(nom+"@gmail.com");
            individu.setNumeroTele("06666666666");
            main.list.add(individu);
        });
        Individu.instanceCount();
        main.showAll();
    }
}