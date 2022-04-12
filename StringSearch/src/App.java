public class App {
    public static void main(String[] args) throws Exception {
        String[] books = {
                "Java in easy steps", "XML in easy steps",
                "HTML in easy steps", "CSS in easy steps",
                "Gone Whith he Wind", "Drop the Defense",
        };

        int counter1 = 0, counter2 = 0, counter3 = 0;
        for (int i = 1; i < books.length; i++) {
            System.out.print(books[i].substring(0, 4) + " | ");
            if (books[i].endsWith("in easy steps"))
                counter1++;
            if (books[i].startsWith("Java"))
                counter2++;
            if (books[i].indexOf("easy") == -1)
                counter3++;
        }

        System.out.println("\nНайдено " + counter1 + " названий из этой серии");
        System.out.println("Найдено " + counter2 + " навазаний c Java");
        System.out.println("Найдено " + counter3 + " других названий");
    }
}
