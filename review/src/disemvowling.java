/*
Henry johnson
9/22/20
9/22/20
purpose: to take all of the vowels out of a string
 */

import java.util.Scanner;

public class disemvowling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter you string");
        String withVowels = s.nextLine();
        String without = "";
        for(int i=0;i<withVowels.length();i++){
            if(!(withVowels.charAt(i)=='a'||withVowels.charAt(i)=='e'||withVowels.charAt(i)=='i'||withVowels.charAt(i)=='o'||withVowels.charAt(i)=='u')){
               without+=withVowels.charAt(i);
            }
        }
        System.out.println("Your string is "+without);
    }
}
