import java.util.ArrayList;

class ConvertChartoNumber3{
    public static void main(String[]args){
        String s = "+123adsfa";
        System.out.println(myAtoi(s));
    }
        public static long myAtoi(String s){
            ArrayList<Integer> arr1 = new ArrayList<>();
            int strcounter = 0;
            long result = 0;
            boolean positive = true;
            boolean started = false;
            while(strcounter<s.length()){
                if(Character.isDigit(s.charAt(strcounter))){
                    arr1.add(Character.getNumericValue(s.charAt(strcounter)));
                    started = true;
                    strcounter++;
                }
                else if(s.charAt(strcounter)=='-' && started == false){
                    positive = false;
                    started = true;
                    strcounter++;
                }
                else if(s.charAt(strcounter)==' ' && started == false){
                    strcounter++;
                }
                else if(s.charAt(strcounter)== '+' && started == false){
                    strcounter++;
                    started = true;
                }
                else if(!Character.isDigit(s.charAt(strcounter)) && started == true){
                    strcounter = s.length();
                }
                else
                     return 0;
            }
            for(int i = 0; i<arr1.size(); i++){
                result *= 10;
                result += arr1.get(i);
            }
            if(positive == false){
                result = 0 - result;
            }
            return result;
        }
}