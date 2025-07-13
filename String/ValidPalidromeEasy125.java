// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.
// Example 1:
// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:
// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:
// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.
import java.util.*;
class ValidPalindromeEasy125{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string....");
        String s = sc.nextLine();
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // StringTokenizer tokenizer = new StringTokenizer(s, " .:!,");
        // String word="";
        // while(tokenizer.hasMoreTokens()){
        //     word+=tokenizer.nextToken();
        // }
        // System.out.println(word);
        // String rev = new StringBuilder(s).reverse().toString();
        // if(word.equals(rev)){
        //     System.out.println("true");
        // } 
        // else 
        //     {
        //         System.out.println("false");
        //     }
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                System.out.println("Not a palindrome");
                return;
            }
            left++;
            right--;
        }

        System.out.println("Palindrome");
        sc.close();
        
    }
}