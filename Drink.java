public class Drink extends Food {
    protected int volume;
    protected String name;
    public int price;

    public Drink(String name, int price, int volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    public String toString() {
        return "name= " + name + ", price= " + price + ", volume= " + volume;
    }

    public void setPrice(int price) {
        if (price < 5)
            price = 5;
    }
}