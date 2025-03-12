class MaxElementMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30},
            {5, 50, 60},
            {15, 25, 35}
        };

        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }

        System.out.println("Maximum Element in the Matrix: " + max);
    }
}
