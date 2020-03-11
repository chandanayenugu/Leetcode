class Solution {
    public String freqAlphabets(String s) {
        String[] map = "abcdefghijklmnopqrstuvwxyz".split("");
        String res = "";
        int i = 0;
        while(i < s.length()){
            if(i + 2 < s.length() && s.charAt(i+2) == '#'){
                String num = s.substring(i,i+2);
                System.out.println(num);
                res = res + map[Integer.parseInt(num)-1];
                i = i + 3;
            }
            else{
                res = res + map[Integer.parseInt(String.valueOf(s.charAt(i)))-1];
                i = i + 1;
            }
            
        }
        return res;
    }
}