/*import java.util.Random;
public class boggleSolver {
    private char[] available = new char[16];
    private String possibilities = "";
    private Random r = new Random();
    private int row = 4;
    private int colum = 4;
    private char[][] game = new char[row][colum];
    public boggleSolver(){

    }
    public void boggle(){
        for(int i = 0;i<row;i++){
            for(int j = 0;j<colum;j++){
                game[i][j] = (char) ((char)r.nextInt(26)+97);
                available[i+j] = game[i][j];
            }
        }
    }
    public char makePossibilities(char next,int r, int c){
        possibilities+=next;
        if(isAvailable(r-1,c-1)){
            makePossibilities(game[r-1][c-1],r-1,c-1);
            makeUnavailable(r-1,c-1);
        }
        if(isAvailable(r-1,c)){
            makePossibilities(game[r-1][c-1],r-1,c-1);
            makeUnavailable(r-1,c-1);
        }if(isAvailable(r-1,c+1)){
            makePossibilities(game[r-1][c-1],r-1,c-1);
            makeUnavailable(r-1,c-1);
        }if(isAvailable(r,c-1)){
            makePossibilities(game[r-1][c-1],r-1,c-1);
            makeUnavailable(r-1,c-1);
        }if(isAvailable(r,c+1)){
            makePossibilities(game[r-1][c-1],r-1,c-1);
            makeUnavailable(r-1,c-1);
        }if(isAvailable(r+1,c-1)){
            makePossibilities(game[r-1][c-1],r-1,c-1);
            makeUnavailable(r-1,c-1);
        }if(isAvailable(r+1,c)){
            makePossibilities(game[r-1][c-1],r-1,c-1);
            makeUnavailable(r-1,c-1);
        }if(isAvailable(r+1,c+1)){
            makePossibilities(game[r-1][c-1],r-1,c-1);
            makeUnavailable(r-1,c-1);
        }
    }
    public void solvep(){
        String words = "";
        String possibilities = "";
        char nextChar;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<colum;j++){
                possibilities = "";
                possibilities+= game[i][j];
                do{
                    nextChar = game[i+1][j];

                }while(true);
            }
        }
    }
    public void makeUnavailable(int r, int c){
        game[r][c]= 'N';
    }
    public boolean isAvailable(int r, int c){
        if(r<0||r>3||c<0||c>3){
            return false;
        }
        else if(game[r][c]=='N'){
            return false;
        }
        else{
            return true;
        }
    }
}*/
