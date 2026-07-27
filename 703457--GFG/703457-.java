class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            else if(max<arr[i]){
                max=arr[i];
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(min);
        ans.add(max);
        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna