package Break;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i == 1 & j == 1) {
                    System.out.println("Продолжение работі внутреннего цикда при i=" + i + " j=" + j);
                    continue;
                }
                if (i == 2) {
                    System.out.println("Выход из внутрешнего цикла при i=" + i + " j =" + j);
                    break;
                }
                System.out.println("Итерация i=" + i + " j =" + j);
            }
        }
    }
}
