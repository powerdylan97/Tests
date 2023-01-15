class PrintDoubleArray{
    public static void main(String args[]){
        char [][] tmp = new char[4][7];
        StringBuilder answer = new StringBuilder();

        //paypalishiring
        tmp[0][0] = 'p';
        tmp[1][0] = 'a';
        tmp[2][0] = 'y';
        tmp[3][0] = 'p';
        tmp[3][1] = ' ';
        tmp[2][1] = 'a';
        tmp[1][1] = ' ';
        tmp[0][1] = ' ';
        tmp[0][2] = ' ';
        tmp[1][2] = 'l';
        tmp[2][2] = ' ';
        tmp[3][2] = ' ';
        tmp[3][3] = 'i';
        tmp[2][3] = 'h';
        tmp[1][3] = 's';
        tmp[0][3] = 'i';
        tmp[0][4] = ' ';
        tmp[1][4] = ' ';
        tmp[2][4] = 'r';
        tmp[3][4] = ' ';
        tmp[3][5] = ' ';
        tmp[2][5] = ' ';
        tmp[1][5] = 'i';
        tmp[0][5] = ' ';
        tmp[0][6] = 'n';
        tmp[1][6] = 'g';
        tmp[2][6] = ' ';
        tmp[3][6] = ' ';


        for(int i = 0; i<4; i++){
        	System.out.println("");
            for(int j = 0; j<7; j++){
                System.out.print(tmp[i][j] + " ");
            }
        }
        for(int k = 0; k<4; k++){
            for(int l = 0; l<7; l++){
                //if(obj.tmp[k][l] != null){
                if(tmp[k][l] != ' '){
                    answer.append(tmp[k][l]);
                }
            }
        }
        System.out.println("The answer is " + answer);
    }
}