import java.util.ArrayList;

class ConvertChartoNumber2{
    public static void main(String[]args){
        String s = "-456";
        ArrayList<Integer> arr1 = new ArrayList<>();
        int strcounter = 0, result = 0;
        boolean positive = true;
        while(strcounter<s.length()){
            if(Character.isDigit(s.charAt(strcounter))){
                arr1.add(Character.getNumericValue(s.charAt(strcounter)));
                strcounter++;
            }
            else if(s.charAt(strcounter)== '-'){
                positive = false;
                strcounter++;
            }
            else
                strcounter++;
        }
        for(int i = 0; i<arr1.size();i++){
            System.out.println(arr1.get(i));
            result *= 10;
            result += arr1.get(i);
        }
        if(positive == false)
            result = result - (2*result);
        else if(result > Math.pow(2,31)-1)
            result = Math.pow(2,31)-1;
        else if(result < Math.pow(-2,31))
            result = Math.pow(-2,31);
        System.out.println(result);
    }
}