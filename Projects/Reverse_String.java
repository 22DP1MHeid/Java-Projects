public class Reverse_String {
    
    public static void reverseString(String string) {
        System.out.println(string.length());
        for (int i = string.length(); i == 0; --i) {
            System.out.print(string.charAt(i));
        }
    }
}
