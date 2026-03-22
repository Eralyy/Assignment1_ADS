public class Task9_CountChars {

    public static int countChars(String s) {
        if (s.equals("")) return 0;
        return 1 + countChars(s.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(countChars("hello"));
    }
}