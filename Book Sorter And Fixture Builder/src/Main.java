import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//    TreeSet<Book> books = new TreeSet<>();
//    books.add(new Book("Akan",100,"Ahmet","2024"));
//    books.add(new Book("Çayır",100,"Ahmet","2024"));
//    books.add(new Book("Başak",100,"Ahmet","2024"));
//    books.add(new Book("Kara",100,"Ahmet","2024"));
//    books.add(new Book("Yüksek",100,"Ahmet","2024"));
//
//    for (Book i : books){
//        System.out.println(i.get_bookName());
//    }

        GenerateFixture genFiksture = new GenerateFixture();

        List<String> teams = new ArrayList<>();
        teams.add("Galatasaray");
        teams.add("Fenerbahçe");
        teams.add("Bursaspor");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");
        teams.add("Trabzonspor");
        //teams.add("BoluSpor");

        System.out.println(genFiksture.GenerateMatch(teams).size());
        genFiksture.ShowMatches(genFiksture.GenerateMatch(teams), teams.size());

    }
}