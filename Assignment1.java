
import java.io.*;

class mystring{


	// method to countwords 
	public static int countWords(String str){
	if(str == null || str.trim().isEmpty()) return 0 ;
	String[] words = str.trim().split("\\s+");
	return words.length ;
	}
	
	// method  isPalindrome 
	public static  boolean ispalindrome(String  str){
	String clean = str.replaceAll("\\s+" , "").toLowerCase();	
	return clean.equals( new StringBuilder(clean).reverse().toString());
	}

	// mthod to reverse the string 
	public  static String reversed(String str ){
	return new StringBuilder(str).reverse().toString();
	}

	// method to sort  the string 	
	public static String sortString(String str){
	char[] arr = str.toCharArray();
	;

        // Bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
	}
        
        return  new String(arr);
  
	}

	// method to splice 
	public static String splice(String str , int start , int end ){
	 if (start < 0 || end > str.length() || start > end)
            return "Invalid splice range!";
        return str.substring(start, end);
	}

	// method to shift the characters
	public static String shiftString(String str, int shift) {
        if (str.isEmpty()) return str;
        shift = shift % str.length();
        return str.substring(str.length() - shift) + str.substring(0, str.length() - shift);
        }

	// method to find max repeating character 
	public static char maxRepeatingCharacter(String str) {
        int[] freq = new int[256];
        for (char c : str.toCharArray()) freq[c]++;
        int max = 0; char result = ' ';
        for (int i = 0; i < 256; i++) {
            if (freq[i] > max) {
                max = freq[i];
                result = (char) i;
            }
        }
        return result;
        }

	
	public static void main(String [] args){
	Console conn = System.console();
	if(conn == null){
	System.out.println("not exists ");
	return ;
	}

	String str;
	System.out.println("Enter the string ");
	str = conn.readLine();

	System.out.println("\n  operations are :");
	System.out.println("1. append");
	System.out.println("2. countwords");
	System.out.println("3. ispalindrome");
	System.out.println("4. reverse");
	System.out.println("5. split");
	System.out.println("6. replace ");
	System.out.println("7. sort ");
	System.out.println("8. splice ");
	System.out.println("9.shift ");
	System.out.println("10.MaxRepeatingCharacter ");


	String choice;
	System.out.println("\n Enter name of  operation to perform is  :");
	choice = conn.readLine().toLowerCase();

	switch(choice){
	case "append" : 
	System.out.println("Enter the string  to append  ");
	String toappend = conn.readLine();
	System.out.println("Result is "+ str.trim()+toappend);
	break;

	case "countwords":
	System.out.println("total count of words  are " + countWords(str));
	break ;

	case "ispalindrome" :
	System.out.println(ispalindrome(str) ? "It is palindrome " : "It is not palindrome ");
	break;

	case "reverse" :
	System.out.print("reverse of string is " + reversed(str));
	break;

	case "split":
	System.out.print("Enter delimiter: "); // delimeter means ways to split based on  words , characters .
                String delimiter = conn.readLine();
                String[] parts = str.split(delimiter);
                System.out.println("Result:");
                for (String s : parts) System.out.println(s);
                break;

	case "replace":
	System.out.print("enter the old_word ");
	String old_word = conn.readLine();
	System.out.print("enter the new_word to replace ");
	String new_word = conn.readLine();
	System.out.print("result is " + str.replace(old_word, new_word));
	break;
	
	case "sort" :
	System.out.print("sorted string is "+ sortString(str));
	break;
	
	case "splice":
	System.out.print("enter start index ");
	int start = Integer.parseInt(conn.readLine());
	System.out.print("enter end  index ");
	int end  = Integer.parseInt(conn.readLine());
	System.out.print("result is " + splice(str, start , end ));
	break;
	
	case "shift":
	System.out.print("enter shift value ");
	int shift = Integer.parseInt(conn.readLine());
	System.out.print("shifted string is "+ shiftString(str, shift ));
	break;
	
	case "maxrepeatingcharacter":
	System.out.print("max repeating character is "+ maxRepeatingCharacter(str));
	break;
	
	default :
	System.out.print("invalid operation ");
}
}
}
	
	