class Solution {
    public String toGoatLatin(String S) {
        String[] arr1 = S.split(" ");
        String arr2 = "";
        String s5 = "";
        String s2 = "aeiou";
        for(int i = 0;i< arr1.length;i++){
            s5 = s5 + "a";
            String s1 = arr1[i];
            if(s2.contains(String.valueOf(s1.charAt(0)).toLowerCase())){
                s1 = s1 + "ma" + s5;    
            }
            else{
                s1 = s1.substring(1,s1.length()) + s1.charAt(0) + "ma" + s5;
            }
             arr2 = arr2 + s1 + " ";  
        }
               return arr2.trim();
    }
}