public class App {
    public static void main(String[] args) {

        try {
            int num = Integer.parseInt(args[0]);
            int square = (int) Math.pow(num, 2);
            int cube = (int) Math.pow(num, 3);
            int sqrt = (int) Math.sqrt(num);
        } catch (Exception e) {

            System.out.println(num + " в квадрате равно" + square);
            System.out.println(num + " в кубе равно" + cube);
            System.out.println("Квадратній корень из" + num + " равен" + sqrt);
        }

    }
}
