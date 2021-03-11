public class recursionClean {
    public static void cleanString(String s, int i) {
        // So that I don't have to use .length everytime
        int k = s.length();

        // Iterate the code until the penultimate index is reached
        if(i < k-2) {

            // Check if two adjacent letters are the same
            if(s.substring(i, i+1).equals(s.substring(i+1, i+2))) {
                
                // If so, remove the current letter using the substring
                String t = (s.substring(0,i) + s.substring(i+1, k));
                s = t;
                cleanString(s,i);
            } else {
                i++;
                cleanString(s,i);
            }

        // Check if the last two letters are the same, if so remove the last letter
        } else if(s.substring(k-2, k-1).equals(s.substring(k-1, k))) {
            String j = s.substring(0, k-1);
            s = j;
            System.out.println(s);
        
        // Print out the string once it is cleaned
        } else {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        cleanString("yyzzza", 0);
        cleanString("abbbcdd", 0);
        cleanString("Hello", 0);
    }
}
