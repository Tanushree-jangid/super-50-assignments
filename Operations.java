/**
 * @filename - Operations.java
 * @description - this will perform most of the string function.
 * @author - Tanu Shree Jangid 
 */

public class Operations {

    // 1. Count Unique Palindromes
    public int countUniquePalindromes(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                if (isPalindrome(sub)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isPalindrome(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return s.equals(rev);
    }

    // 2. Fibonacci Nth Number
    public int fibonacci(int n) {
        if (n == 0 || n == 1) return n;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // 3. Snake Case to Camel Case
    public String snakeToCamel(String s) {
        String[] parts = s.split("_");
        String ans = parts[0];
        for (int i = 1; i < parts.length; i++) {
            ans += parts[i].substring(0,1).toUpperCase() + parts[i].substring(1);
        }
        return ans;
    }

    // 4. Count Consonants
    public int countConsonants(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                    count++;
                }
            }
        }
        return count;
    }

    // 5. Binary to Decimal
    public int binaryToDecimal(String bin) {
        int dec = 0, pow = 1;
        for (int i = bin.length() - 1; i >= 0; i--) {
            if (bin.charAt(i) == '1') {
                dec += pow;
            }
            pow *= 2;
        }
        return dec;
    }

    // 6. Expand Characters
    public String expandCharacters(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i += 2) {
            char ch = s.charAt(i);
            int num = s.charAt(i + 1) - '0';
            for (int j = 0; j < num; j++) {
                ans += ch;
            }
        }
        return ans;
    }

    // 7. Character Frequency
    public String charFrequency(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    count++;
                }
            }
            if (ans.indexOf(ch) == -1) {
                ans += ch + "" + count;
            }
        }
        return ans;
    }

    // 8. Prime Number Checker
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 9. Number to Words (simple, 0-999)
    public String numberToWords(int num) {
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", 
                        "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (num == 0) return "zero";
        if (num < 20) return ones[num];
        if (num < 100) return tens[num/10] + " " + ones[num%10];
        if (num < 1000) return ones[num/100] + " hundred " + numberToWords(num%100);
        return "too big";
    }

    // 10. Longest Substring Without Repeating Characters
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            String sub = "";
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (sub.indexOf(ch) != -1) break;
                sub += ch;
                if (sub.length() > max) max = sub.length();
            }
        }
        return max;
    }
}

