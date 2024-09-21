import java.util.Scanner;

public class PalindromicSubstring {
    public static void main(String[] args) {
        String input = "";
        Scanner sc = new Scanner(System.in);
        String line;
        
        // Read multi-line input until an empty line is encountered
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            input += line + "\n";
        }
        
        String str = input.trim();
        int len = str.length();
        String longest = "";

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String substring = str.substring(i, j);
                if (isPalindrome(substring) && substring.length() > longest.length()) {
                    longest = substring;
                }
            }
        }
        
        System.out.println("Longest Palindromic Substring: " + longest);
    }
    static boolean Palindrome(String str) {
        int len=str.length();
        for (int i=0;i<len/2;i++) {
            if (str.charAt(i)!=str.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}
