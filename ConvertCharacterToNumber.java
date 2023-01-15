import java.util.ArrayList;
import java.util.Arrays;
import javax.lang.model.util.ElementScanner14;

class ConvertCharacterToNumber{
    public static void main(String[] args){
        String s = "1";
        int strcounter = 0, arrcounter = 0, result = 0;
        boolean polarity = true;//is positive number by default until '-'
        char tmp;
        int tmpnum;
        //int[] arr1 = new int[s.length()];
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        while(strcounter<s.length()){
            if(s.charAt(strcounter)== '-'){
                strcounter++;
                polarity = false;
            }
            else if(Character.isDigit(s.charAt(strcounter))){
                //arr1[arrcounter] = s.charAt(strcounter) - '0';
                tmp = s.charAt(strcounter);
                tmpnum = Character.getNumericalValue(tmp);
                arr1.add(tmpnum);  
                strcounter++;
            }
            else
                strcounter++;
        }
        
        for(int i = 0; i<arr1.size(); i++){
            System.out.println(arr1.get(i));}
            /*result *= 10;
            result += arr1.remove(i);
        }
        if(polarity == false)
            result = result - (2*result);
        System.out.println(result);*/
    }
}