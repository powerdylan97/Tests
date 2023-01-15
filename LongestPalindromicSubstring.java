class Solution {
    public String longestPalindrome(String s) {
        int count =0;
        String tmp, checker ="";
        String answer = "";
        if(s.length()==1)
            return s;
        else{
            for(int i = 0 ; i < s.length(); i++){
                for(int j = i+1; j<=s.length(); j++){
                    tmp = s.substring(i, j);
                    checker = checkReverse(tmp);
                    
                if(tmp.equals(checker) && tmp.length()>count){
                    count = tmp.length();
                    answer = tmp;
                }
            }
        }
        return answer;
        }
    }
    public static String checkReverse(String s){
        char ch;
        String reverser = "";
        for(int i = 0; i<s.length(); i++){
            ch = s.charAt(i);
            reverser = ch + reverser;
        }
        //System.out.println(s);
        //System.out.println(reverser);
        return reverser;
    }
}