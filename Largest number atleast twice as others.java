class Solution {
    public int dominantIndex(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr1.add((nums[i])); 
           } 
        int n = Collections.max(arr1);
        for(int i = 0;i< arr1.size();i++){
            if(n != arr1.get(i) && n < (arr1.get(i)*2)){
                return -1;
            }
        }
        return arr1.indexOf(n);
    }
}