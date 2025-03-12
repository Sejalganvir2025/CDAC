import java.util.Arrays;
class MergeSortedArrays {
    public static void merge(int[] A, int[] B) {
        int m = A.length, n = B.length;
        int i = m - 1, j = 0;

        while (i >= 0 && j < n) {
            if (A[i] > B[j]) {
                int temp = A[i];
                A[i] = B[j];
                B[j] = temp;
            }
            i--;
            j++;
        }

        Arrays.sort(A);
        Arrays.sort(B);
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7};
        int[] B = {2, 4, 6, 8};

        merge(A, B);
        System.out.println("Merged A: " + Arrays.toString(A));
        System.out.println("Merged B: " + Arrays.toString(B));
    }
}
