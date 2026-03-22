public class Task8_CheckDigits {

    public static boolean isDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isDigits(s, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(isDigits("123456", 0) ? "Yes" : "No");
    }
}