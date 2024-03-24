import java.util.*;

public class StartProgram {
    static private List<Brand> _brands;
    static private List<MobilePhone> _mobilePhones;
    static private List<Nootbook> _notBooks;

    static private int _initilazeNotebookId;
    static private int _initilazeMobileId;
    static Scanner input = new Scanner(System.in);

    public StartProgram(){
        _initilazeNotebookId = 1;
        _initilazeMobileId = 1;
        _mobilePhones = new ArrayList<>();
        _notBooks = new ArrayList<>();
        GenerateBrands();


        System.out.println("PatikaStore Ürün Yönetim Paneli");

        while (true)
        {
            boolean retVal;
            System.out.println(
                    "1 - Notebook İşlemleri\n" +
                    "2 - Cep Telefonu İşlemleri\n" +
                    "3 - Marka Listele\n" +
                    "4 - Ürün Sil\n" +
                    "0 - Çıkış Yap: ");
            int choise = input.nextInt();
            retVal = Options(choise);
            if(!retVal)
                break;
        }

    }

    private boolean Options(int choise){
        boolean returnVal;
        switch (choise){
            case 0:
                returnVal = QuitProgram();
                break;
            case 1:
                returnVal = NotBookProcess();
                break;
            case 2:
                returnVal = MobilPhoneProcess();
                break;
            case 3:
                returnVal = ShowBrands();
                break;
            case 4:
                returnVal = RemoveProduct();
                break;
            default:
                returnVal = ShowBrands();
                break;
        }

        return returnVal;
    }

    static boolean NotBookProcess(){

        System.out.println("1-Notbook Ürün Ekle\n2-Ana Menüye Don: ");
        int choise = input.nextInt();
        if (choise == 1){
            ProductAdd(false);
            ShowProducts(1);
        }
        return true;

    }
    static boolean MobilPhoneProcess(){
        System.out.println("1-Mobil Telefon Ürün Ekle\n2-Ana Menüye Don: ");
        int choise = input.nextInt();
        if (choise == 1){
            ProductAdd(true);
            ShowProducts(2);
        }
        return true;
    }
    static boolean ShowBrands(){
        for (Brand i : _brands)
            System.out.println(i.get_name());
        return true;

    }

    static void ShowProducts(int choise){
        if(choise == 1){
            for (Nootbook i : _notBooks){
                System.out.println("-----------------------------------------------");
                System.out.println("" +
                        "Ürün Id: "+i.get_id()+
                        "\nÜrün Adı: "+i.get_name()+
                        "\nÜrün Fiyatı: "+i.get_price()+
                        "\nÜrün Rengi: "+i.get_color()+
                        "\nÜrün Hafızası: "+i.get_memorySize()+
                        "\nÜrün Ekran Boyutu: "+i.get_screenSize()+
                        "\nÜrün Stok Miktarı: "+i.get_stock()+
                        "\nÜrün Markası: "+GetBrandName(i.get_brandId()));
            }

        }
        else{
            for (MobilePhone i : _mobilePhones){
                System.out.println("-----------------------------------------------");
                System.out.println("" +
                        "Ürün Id: "+i.get_id()+
                        "\nÜrün Adı: "+i.get_name()+
                        "\nÜrün Fiyatı: "+i.get_price()+
                        "\nÜrün Rengi: "+i.get_color()+
                        "\nÜrün Hafızası: "+i.get_memorySize()+
                        "\nÜrün Ekran Boyutu: "+i.get_screenSize()+
                        "\nÜrün Stok Miktarı: "+i.get_stock()+
                        "\nRam miktarı: "+i.get_ramSize()+
                        "\nÜrün Markası: "+GetBrandName(i.get_brandId()));
            }
        }
    }
    static boolean QuitProgram(){
        System.out.println("QuitProgram");
        return false;
    }

    static private void ProductAdd(boolean isPhoneAdded)
    {
        int mobilPhoneBrandId = 1;
        int noteBookBrandId = 1;
        int ramSize = 0;
        int batterySize = 0;
        ColorEnum color;

        System.out.println("Ürün adı: ");
        String name = input.next();
        System.out.println("Ürün fiyatı: ");
        int price = input.nextInt();
        System.out.println("İndirim Oranı: ");
        int discountRate = input.nextInt();
        System.out.println("Stok miktarı: ");
        int stock = input.nextInt();
        System.out.println("Hafıza miktarı: ");
        int memorySize = input.nextInt();
        System.out.println("Ekran Oranı: ");
        double screenSize = input.nextDouble();
        System.out.println("Renk\n1-Siyah  |  2-Kırmızı  |  3-Mavi: ");
        int choiseColor = input.nextInt();

        if(isPhoneAdded){
            System.out.println("Ram miktarı: ");
            ramSize = input.nextInt();
            System.out.println("Batarya boyutu: ");
            batterySize = input.nextInt();
        }

        switch (choiseColor){
            case 1:
                color = ColorEnum.Black;
                break;
            case 2:
                color = ColorEnum.Red;
                break;
            case 3:
                color = ColorEnum.Blue;
                break;
            default:
                color = ColorEnum.Black;
                break;
        }
        while (true){
            boolean isThereBrand = false;
            System.out.println("Ürün markası: ");
            String brandName = input.next();
            for (Brand brand : _brands){
                if(brand.get_name().equalsIgnoreCase(brandName)){
                    isThereBrand = true;
                    noteBookBrandId = brand.get_id();
                    mobilPhoneBrandId = brand.get_id();
                    break;
                }
            }
            if(isThereBrand)
                break;
        }

        if(!isPhoneAdded)
        {
            _notBooks.add(new Nootbook(_initilazeNotebookId,price,discountRate,stock,name,noteBookBrandId,
                    memorySize,screenSize,color));
            _initilazeNotebookId++;
        }
        else
        {
            _mobilePhones.add(
                    new MobilePhone(_initilazeMobileId,price,discountRate,stock,name,mobilPhoneBrandId,
                            memorySize,screenSize,ramSize,batterySize,color));
            _initilazeMobileId++;
        }

        System.out.println("****Ürün Başarılı Şekilde Eklendi****");
    }

    static private boolean RemoveProduct(){
        boolean isPhoneRemove = false;
        boolean isRemove = false;
        System.out.println("Silmek istediğiniz ürün?\n1-Telefon | 2-NoteBook: ");
        int choise = input.nextInt();
        if (choise == 1)
            isPhoneRemove = true;

        System.out.println("Ürün Id Girin: ");
        int productId = input.nextInt();

        if(isPhoneRemove){
            isRemove = _mobilePhones.removeIf(product -> product.get_id() == productId);
        }
        else {
            isRemove = _notBooks.removeIf(product -> product.get_id() == productId);
        }

        if(isRemove)
            System.out.println("-----------Ürün Başarılı Şekilde Silindi----------");
        else
            System.out.println("-----------Ürün Bulunamadı----------");
        return true;
    }

    static private String GetBrandName(int brandId){
        String brandName = "Default";
        for (Brand brand : _brands){
            if(brand.get_id() == brandId){
                brandName = brand.get_name();
                break;
            }
        }

        return brandName;
    }

    private void GenerateBrands(){
        _brands = new ArrayList<>(Arrays.asList(
                new Brand(1,"Samsung"),
                new Brand(2,"Lenovo"),
                new Brand(3,"Apple"),
                new Brand(4,"Huawei"),
                new Brand(5,"Casper"),
                new Brand(6,"Asus"),
                new Brand(7,"HP"),
                new Brand(8,"Xiaomi"),
                new Brand(9,"Monster")
        ));
    }
}
