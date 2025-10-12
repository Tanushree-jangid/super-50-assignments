/**
 * @filename - MainClass.java
 * @Description: Main class to test MyString operations
 * @Author: Tanu Shree Jangid 
 */

import java.util.Scanner;
//updated 
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations op = new Operations();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Count Unique Palindromes");
            System.out.println("2. Fibonacci Sequence – Nth Number");
            System.out.println("3. Snake Case to Camel Case");
            System.out.println("4. Count Consonants");
            System.out.println("5. Binary to Decimal");
            System.out.println("6. Expand Characters");
            System.out.println("7. Character Frequency");
            System.out.println("8. Prime Number Checker");
            System.out.println("9. Number to Words Converter");
            System.out.println("10. Longest Substring Without Repeating Characters");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter string: ");
                String s = sc.nextLine();
                System.out.println("Count: " + op.countUniquePalindromes(s));
            } else if (choice == 2) {
                System.out.print("Enter n: ");
                int n = sc.nextInt();
                System.out.println("Fibonacci: " + op.fibonacci(n));
            } else if (choice == 3) {
                System.out.print("Enter snake_case string: ");
                String s = sc.nextLine();
                System.out.println("CamelCase: " + op.snakeToCamel(s));
            } else if (choice == 4) {
                System.out.print("Enter string: ");
                String s = sc.nextLine();
                System.out.println("Consonants: " + op.countConsonants(s));
            } else if (choice == 5) {
                System.out.print("Enter binary: ");
                String s = sc.nextLine();
                System.out.println("Decimal: " + op.binaryToDecimal(s));
            } else if (choice == 6) {
                System.out.print("Enter encoded string: ");
                String s = sc.nextLine();
                System.out.println("Expanded: " + op.expandCharacters(s));
            } else if (choice == 7) {
                System.out.print("Enter string: ");
                String s = sc.nextLine();
                System.out.println("Frequency: " + op.charFrequency(s));
            } else if (choice == 8) {
                System.out.print("Enter number: ");
                int n = sc.nextInt();
                if (op.isPrime(n))
                    System.out.println("Prime");
                else
                    System.out.println("Not Prime");
            } else if (choice == 9) {
                System.out.print("Enter number: ");
                int n = sc.nextInt();
                System.out.println("Words: " + op.numberToWords(n));
            } else if (choice == 10) {
                System.out.print("Enter string: ");
                String s = sc.nextLine();
                System.out.println("Length: " + op.lengthOfLongestSubstring(s));
            } else if (choice == 11) {
                System.out.println("Exiting...");
                break;  // loop yahi ruk jaega
            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
