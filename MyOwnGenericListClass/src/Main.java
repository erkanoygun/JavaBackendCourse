//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MyGenericList<Integer> myList = new MyGenericList<>();

        System.out.println("Dizideki Eleman Sayısı : " + myList.Size());
        System.out.println("Dizinin Kapasitesi : " + myList.getCapacity());

        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);

        System.out.println("Dizideki Eleman Sayısı : " + myList.Size());
        System.out.println("Dizinin Kapasitesi : " + myList.getCapacity());

        myList.add(50);
        myList.add(60);
        myList.add(70);
        myList.add(80);
        myList.add(90);
        myList.add(100);
        myList.add(110);

        System.out.println("Dizideki Eleman Sayısı : " + myList.Size());
        System.out.println("Dizinin Kapasitesi : " + myList.getCapacity());



    }
}