package assignments_2;

import java.util.Scanner;

public class checkAlphabets {

    public static boolean checkAllAlphabets(String str)
    {
        // Time Complexity -> O(n) { n -> length of String } Space Complexity -> O(26) -> constants -> array
        // Create a hash table to mark the characters present in the string
        // By default all the elements of mark would be false.
        boolean[] mark = new boolean[26];
        // For indexing in mark[]
        int index = 0;
        // Traverse all characters
        for (int i = 0; i < str.length(); i++) {
            // If uppercase character, subtract 'A' to find index.
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
                index = str.charAt(i) - 'A';
                // If lowercase character, subtract 'a' to find index.
            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
                index = str.charAt(i) - 'a';
                // If this character is other than english lowercase and uppercase characters.
            else
                continue;
            mark[index] = true;
        }
        // Return false if any character is unmarked
        for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return (false);
        // If all characters were present
        return (true);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the String");
        Scanner s1 = new Scanner(System.in);
        String stringToCheck = s1.next();

        if (checkAllAlphabets(stringToCheck) == true)
            System.out.print(stringToCheck + " contains all Alphabets.");
        else
            System.out.print(stringToCheck + " doesn't contain all Alphabets.");
    }

}
