public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Сообщение из главного метода.");

        sub();

    }

    public static void sub() {
        System.out.println("Сообщение из метода sub.");
    }
}
