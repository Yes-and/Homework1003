public class recursionReverse {

    // Reverse a string using index i, which is incremented everytime the method is called
    public static void reverseString(String s, int i) {
        int j = s.length();
        if(i < j) {

            // Form a string, where the previously added letters are kept, last letter is added after them and then the rest of the string is added
            String k = s.substring(0,i) + s.substring(j-1, j) + s.substring(i, j-1);
            s = k;
            i++;
            // System.out.println("String is currently: " + s + "   and index is currently: " + i);
            reverseString(s,i);
        } else {
            System.out.println("Reversed string is: " + s);
        }
    }
    public static void main(String[] args) {
        reverseString("windows", 0);
        reverseString("Dusan", 0);
    }
}
