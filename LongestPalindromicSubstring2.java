class Solution {
    public String longestPalindrome(String s) {
        int count =0;
        String tmp;
        String answer = "";
        if(s.length()==1)
            return s;
        else{
            for(int i = 0 ; i < s.length(); i++){
                for(int j = i+1; j<=s.length(); j++){
                    tmp = s.substring(i, j);
                    StringBuilder reverser = new StringBuilder(tmp);
                    reverser = reverser.reverse();
                    String rev = reverser.toString();
                if(tmp.equals(rev)&&tmp.length()>count){
                    count = tmp.length();
                    answer = tmp.toString();
                }
            }
        }
        return answer;
        }
    }
}