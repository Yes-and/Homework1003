public class ReverseString {

    // Reverse a string using a list (by looping backwards)
    public static String reverse (String s) {
        String[] temp = s.split("");
        String placeholder = "";
        for(int i = temp.length-1; i >= 0; i--) {
            placeholder += temp[i];
        }
        return placeholder;
    }

    public static void main(String[] args) {
        String[] words = {"hello", "apocalypse", "reverse"};
        for(String k:words) {
            System.out.println(reverse(k));
        }
    }
}
