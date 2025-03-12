class NumberCheck {
    public static void main(String[] args) {
        int num = -5; // Change this value to test
        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        
        System.out.println("The number is: " + result);
    }
}
