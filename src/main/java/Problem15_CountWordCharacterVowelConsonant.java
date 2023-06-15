//15. Count number of words, number of characters without spaces, number of vowels and consonant from the given string:
//"I live in Bangladesh"
public class Problem15_CountWordCharacterVowelConsonant {
    public static void main(String[] args) {
        String s = "I live in Bangladesh";
        String newWord[] = s.split(" ");
        int word = newWord.length;
        char arr[] = s.toCharArray();
        int Character = 0, Vowel = 0, Consonant = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                Character++;
            }
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'
                    || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
                Vowel++;
            } else {
                if (arr[i] != ' ')
                    Consonant++;
            }

        }
        System.out.println("Number of words: " + word);
        System.out.println("Number of characters without spaces: " + Character);
        System.out.println("Number of vowels: " + Vowel);
        System.out.println("Number of consonant: " + Consonant);
    }
}
