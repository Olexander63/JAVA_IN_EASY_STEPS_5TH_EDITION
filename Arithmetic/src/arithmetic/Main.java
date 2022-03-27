package arithmetic;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num = 100;
        int factor= 20;
        int sum;

        sum = num  + factor; // 100+ 20

        System.out.println("Результат сложения: " + sum);
        sum = num - factor ; //100-20
        System.out.println("Результат вычитания: " + sum);


        sum  =  num * factor; //100x20
        System.out.println("Результат умножения: " + sum);
        sum = num / factor; // 100/20
        System.out.println("Результат деления: " + sum);
    }
}
