import java.util.ArrayList;

class DigitChecker{
    public static void main(String[] args){
        char digit = '9';
        char letter = 'c';
        System.out.println("4 is digit " + Character.isDigit(digit));
        System.out.println("c is digit " + Character.isDigit(letter));
        System.out.println(Character.getNumericValue(digit));
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(2);
        arr1.add(3);
        for(int i =0; i<arr1.size();i++){
            System.out.println(arr1.remove(i));
        }
    }
}