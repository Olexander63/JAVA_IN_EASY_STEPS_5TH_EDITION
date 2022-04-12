public class App {
    public static void main(String[] args) throws Exception {
        String lang = "Java";
        String series = " in easy steps";

        String title = lang.concat(series);
        System.out.print("\"" + title + "\" срдержит");
        System.out.println(title.length() + " символов");
    }
}
