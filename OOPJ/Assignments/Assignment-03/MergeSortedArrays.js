import java.util.Arrays;
class MergeSortedArrays {
    public static void mergeSortedArrays(int[] A, int[] B) {
        int p = A.length, q = B.length;
        int[] merged = new int[p + q];

        System.arraycopy(A, 0, merged, 0, p);
        System.arraycopy(B, 0, merged, p, q);

        Arrays.sort(merged);

        System.arraycopy(merged, 0, A, 0, p);
        System.arraycopy(merged, p, B, 0, q);

        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 6, 7, 8, 10};
        int[] B = {2, 4, 9};

        mergeSortedArrays(A, B);
    }
}
