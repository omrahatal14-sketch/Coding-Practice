class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        
        for (int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna