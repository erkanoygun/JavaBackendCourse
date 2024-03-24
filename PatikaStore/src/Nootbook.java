public class Nootbook {
    private  int _id;
    private double _price;
    private int _discountRate;
    private int _stock;
    private String _name;
    private int _brandId;
    private int _memorySize;
    private double _screenSize;
    private ColorEnum _color;


    public Nootbook(int _id, double _price, int _discountRate, int _stock, String _name, int _brandId, int _memorySize, double _screenSize, ColorEnum _color) {
        this._id = _id;
        this._price = _price;
        this._discountRate = _discountRate;
        this._stock = _stock;
        this._name = _name;
        this._brandId = _brandId;
        this._memorySize = _memorySize;
        this._screenSize = _screenSize;
        this._color = _color;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int get_discountRate() {
        return _discountRate;
    }

    public void set_discountRate(int _discountRate) {
        this._discountRate = _discountRate;
    }

    public int get_stock() {
        return _stock;
    }

    public void set_stock(int _stock) {
        this._stock = _stock;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public int get_brandId() {
        return _brandId;
    }

    public void set_brandId(int _brandId) {
        this._brandId = _brandId;
    }

    public int get_memorySize() {
        return _memorySize;
    }

    public void set_memorySize(int _memorySize) {
        this._memorySize = _memorySize;
    }

    public double get_screenSize() {
        return _screenSize;
    }

    public void set_screenSize(double _screenSize) {
        this._screenSize = _screenSize;
    }

    public ColorEnum get_color() {
        return _color;
    }

    public void set_color(ColorEnum _color) {
        this._color = _color;
    }


}
