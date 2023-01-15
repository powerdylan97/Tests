class Solution {
    public int reverse(int x) {      
            if(x>0){
                String numberStr = Integer.toString(x);
                StringBuilder sb1 = new StringBuilder(numberStr);
                numberStr = sb1.reverse().toString();
                try{
                    return Integer.valueOf(numberStr);
                }
                catch(NumberFormatException e){
                    return 0;
                }
            }
            else if(x<0){
                x = Math.abs(x);
                String numberStr = Integer.toString(x);
                StringBuilder sb1 = new StringBuilder(numberStr);
                sb1 = sb1.reverse();
                sb1.insert(0, '-');
                numberStr = sb1.toString();
                try{
                    return Integer.valueOf(numberStr);
                }
                catch(NumberFormatException e){
                    return 0;
                }
            }
            else
                return 0;

        }
    }