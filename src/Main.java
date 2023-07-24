public class Main {
    public static void main(String[] args) {
        SwimAble[] oceanarium = {new Shark("Мегаладон"),
                new Shark("Мегаладон1"),
                new Shark("Мегаладон2"),
                new Shark("Мегаладон3"),
                new Shark("Мегаладон4"),
                new Shark("Мегаладон5"),
                new Duck("utka1"),
                new Duck("utka2"),
                new Duck("utka3"),
                new Duck("utka4"),
                new Duck("utka5"),
                new Turtle("bek1"),
                new Turtle("bek2"),
                new Turtle("bek3"),
                new Turtle("bek4"),
                new Turtle("bek5")};
        for (int i = 0; i < oceanarium.length; i++) {
            oceanarium[i].Swim();
        }
    }
}
