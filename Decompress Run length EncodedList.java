class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i = 0;i<nums.length;i = i + 2){
            int j = nums[i];
            int k = nums[i+1];
            for(int g = 0;g < j;g++){
                arr1.add(k);
            }
        }
        int[] arr2 = new int[arr1.size()];
        for(int i =0;i< arr1.size();i++){
            arr2[i] = arr1.get(i);
        }
        return arr2;
    }
}