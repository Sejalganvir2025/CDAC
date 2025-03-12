class CharacterCheck {
    public static void main(String[] args) {
        char ch = 'A'; // Change this value to test

        String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase" :
                        (ch >= 'a' && ch <= 'z') ? "Lowercase" : "Not a Letter";

        System.out.println("Character type: " + result);
    }
}
