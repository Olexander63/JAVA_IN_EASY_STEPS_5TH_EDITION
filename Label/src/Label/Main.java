package Label;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
           outerLoop: for (int j = 1; j < 4; j++) {
                if (i==1 && j==1){
                    System.out.println("outerLoop продолжает работу при i="+i+" j="+j);
                    continue outerLoop;
                }

                if ( i ==2 && j==3){
                    System.out.println("Выход outerLoop при i=" +i+" j="+ j);
                    break  outerLoop;
                }
                System.out.println("Итерация i=" + i + " j=" + j);
            }
        }
    }
}
