// Length of the last word question no 58 easy,
//Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.
import java.util.*;
class Easy58{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string....");
        String s = sc.nextLine();
        String word = "";
        StringTokenizer tokenizer = new StringTokenizer(s, " ");
        while(tokenizer.hasMoreTokens()){
            word = tokenizer.nextToken();
        }
        System.out.println(word.length());
        sc.close();
    }
}