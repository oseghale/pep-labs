
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] result = new int[length1 + length2];
        System.arraycopy(arr1, 0, result, 0, length1);
        System.arraycopy(arr2, 0, result, length1, length2);
        return result;
    }
}
