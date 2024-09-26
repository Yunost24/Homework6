public class Tie extends Clothes implements MenClothing{

    public Tie(Size size, float coast, String color) {
        super(size, coast, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужской галстук: размер: " + size + " цена: " + coast + " цвет: " + color);
    }

}
