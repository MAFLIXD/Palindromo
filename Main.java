import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //escaner
        Scanner in = new Scanner(System.in);
        System.out.println("Digita la palabra");
        String word = in.next();

        int firstPosition = 0;
        int lastPosition = word.length() - 1;
        boolean isAPalindrome = true;

        //bucle while
        while(firstPosition < lastPosition){
            if(word.charAt(firstPosition)!=word.charAt(lastPosition))
                isAPalindrome = false;
            firstPosition++;
            lastPosition--;
        }//end while
        if(isAPalindrome)
            System.out.println("The word is a Palindrome");
        else
            System.out.println("The word is not a Palindrome");

    in.close();        
    }
}