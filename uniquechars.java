/** String processing exercise 2. */
public class uniquechars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }
    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 32) newString += s.charAt(i);
            else {
                if (newString.indexOf(s.charAt(i)) == -1) {
                    newString += s.charAt(i);
                } 
            }
        }
        return newString;
    }
}
