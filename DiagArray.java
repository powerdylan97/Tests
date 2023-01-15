import java.util.Arrays;

class DiagArray{
    public static void main(String[] args){
        String s = "paypalishiring";
        int rows = 4;
        int cols = (int)Math.ceil(s.length()/(rows-2))*(rows-1);
        int n = s.length();
        //Each section has 2*numRows-2 characters.
        //The most amount of sections in row of n characters is ceil(n/2*numRows-2)
        //each section has numrows -1 columns.
        //Need ceil(s.lenght/(rows-2)*(rows-1)) columns.
        char[][] mat = new char[rows][cols];
        int currRow = 0 , currCol = 0, currStringIndex = 0;//This line contains the pointers that 
        //will traverse the matrix.
       
        if(rows==1)
            System.out.println(s);
        for(char[] row:mat)
            Arrays.fill(row, ' ');

        while(currStringIndex < n){
            //move down. on the same column.

            while(currRow<rows && currStringIndex<n){
                mat[currRow][currCol] = s.charAt(currStringIndex);
                currRow++;
                currStringIndex++;
            }
            currRow -= 2;
            currCol++;

            //Move up and to the right
            while(currRow>0 && currCol<cols && currStringIndex<n){
                mat[currRow][currCol] = s.charAt(currStringIndex);
                currRow--;
                currCol++;
                currStringIndex++;
            }

            //Now we have to go line by line through the matrix to build the String Answer.
            StringBuilder answer = new StringBuilder();
            for(char[] row:mat){//for each row in the matrix
                for(char character: row){//look at each character.
                    if(character != ' '){
                        answer.append(character);
                    }
                }
            }
            System.out.println(answer.toString());
        }
    }
}