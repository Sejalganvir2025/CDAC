class LargestUsingTernary {
    public static void main(String[] args) {
        int a = 25, b = 40, c = 15;
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        
        System.out.println("The largest number is: " + largest);
    }
}
