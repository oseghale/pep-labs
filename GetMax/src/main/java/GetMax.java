public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        double maxV = (double) arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxV){
                maxV = arr[i];
            }
        }
        return   (int) maxV;
    }
}
