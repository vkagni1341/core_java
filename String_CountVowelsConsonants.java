Write a program to count the consonants and vowels in the given String.
=======================================================================


 public class CountVowelsConsonants {

    public static void countVowelsConsonants(String str) {
        int vowelsCount = 0;
        int consonantsCount = 0;

        
        str = str.toLowerCase();

        
        String vowels = "aeiou";

       
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    
                    vowelsCount++;
                } else {
                  
                    consonantsCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
    }

    public static void main(String[] args) {
        String originalString = "Hello World!";
        
        countVowelsConsonants(originalString);
    }
}
