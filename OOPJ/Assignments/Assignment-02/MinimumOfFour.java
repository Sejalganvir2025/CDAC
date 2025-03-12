class MinimumOfFour {
    public static void main(String[] args) {
        int a = 15, b = 7, c = 20, d = 5; // Change values to test

        int min = (a < b) ? ((a < c) ? ((a < d) ? a : d) : (c < d) ? c : d) 
                          : ((b < c) ? ((b < d) ? b : d) : (c < d) ? c : d);

        System.out.println("Minimum number is: " + min);
    }
}
