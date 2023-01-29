public class Search2dArray {
    /**
     * Receive a 2d array of ints. (That's an array of arrays!)
     * Your task is to search the array for a matching value, return true if found false otherwise.
     * You'll need to use a for loop within a for loop - each for loop handles searching in a particular dimension.
     * I recommend reasoning through this problem on pencil and paper.
     *
     * @param nums a two dimensional array - meaning, an array of arrays.
     * @param target a value that may be contained within nums.
     * @return true if nums contains target, and false otherwise.
     */
    public boolean search(int[][] nums, int target){
        if (nums == null || nums.length == 0) {
            return false;
        }
        int row = 0;
        int col = nums[0].length - 1;
        while (row < nums.length && col >= 0) {
            if (nums[row][col] == target) {
                return true;
            } else if (nums[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
}
