package For;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i < 4; i++) {

            for (int j = 1; j < 4; j++) {
                System.out.println("\tВнутренный цикл j=" + j);
                System.out.println("\t\tВсего num=" + (++num));
            }
            System.out.println("Внешний цикл i=" + i);
        }

    }
}
