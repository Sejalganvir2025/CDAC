class VowelOrConsonant {
    public static void main(String[] args) {
        char ch = 'e'; // Change this value to test
        ch = Character.toLowerCase(ch);
        
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "Vowel" : "Consonant";
        System.out.println(ch + " is a " + result);
    }
}
