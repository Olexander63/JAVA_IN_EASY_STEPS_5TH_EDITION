package Comparison;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String txt = "Fantastic";
        String lang = "Java";
        boolean state = (txt == lang);
        System.out.println("Проверка строк на равенство:" + state);
        state = (txt != lang);
        System.out.println("Проверка строк на неравенство: " + state);
        int dozen = 12;
        int score = 20;
        state =(dozen > score);
        System.out.println("Проверка на больше: " + state);
        state =(dozen < score);
        System.out.println("Проверка на меньше: " + state);
    }
}
