public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 15.99f, "синий"),
                new Pants(Size.L, 29.99f, "черный"),
                new Skirt(Size.S, 19.99f, "красный"),
                new Tie(Size.XS, 9.99f, "зеленый")
        };
       Atelier atelier = new Atelier();

       System.out.println("Одежда для мужчин:");
       atelier.dressMen(clothes);

       System.out.println("\nОдежда для женщин:");
       atelier.dressWomen(clothes);
    }
}
