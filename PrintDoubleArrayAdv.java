class PrintDoubleArrayAdv{
    public static void main(String[] args){
        String s = "paypalishiring";
        int rows = 4;
        char[][] matrix = new char[rows][s.length()/2];
        
        for(int i = 0; i<rows; i++){
            matrix[i][0] = s.charAt(i);
        }
    }
}