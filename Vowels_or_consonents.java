import java.util.Scanner;

public class Vowels_or_consonents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s1 = in.nextLine();
        is_vowels(s1);

    }
    static void is_vowels (String s1){
        String vowel = "aeiou";
        String consonents = "bcdfghjklmnpqrstvwxyz";
        int count_vowels = 0;
        int count_consonents = 0;
        for (int i = 0;i < s1.length();i++) {
            String a = String.valueOf(s1.charAt(i));
            if (vowel.contains(a.toLowerCase())){
                count_vowels += 1;
            } else if (consonents.contains(a.toLowerCase())) {
                count_consonents += 1;

            }

        }
        System.out.println("The number of vowels in the string:" + count_vowels);
        System.out.println("The number of consonants in the string :" + count_consonents);
    }
}
