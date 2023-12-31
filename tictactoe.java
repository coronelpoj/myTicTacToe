package tictactoe;
import java.util.ArrayList;
import java.util.Scanner;
public class tictactoe {
    

    public static boolean winConPlayer1(char first, char second, char third){
        if(first == 'O' && second == 'O' && third == 'O'){
            return true;
        }else{
        return false;
        }
    }
    public static boolean winConPlayer2(char first, char second, char third){
        if(first == 'X' && second == 'X' && third == 'X'){
            return true;
        }else{
        return false;
        }
    }

    public static boolean isEleEmpty(char element){
            if(element == '*'){
                return true;
            }else{
                return false;
            }
    }
    public static boolean checkIfTie(char table[][]){
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                list.add(table[i][j]);
            }
        }
        if(list.contains('*')){
            return false;
        }else{
            return true;
        }
        
    }
    public static void printboard(char table[][]){
        
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){               
                System.out.print(table[i][j] );
                System.out.print(" ");
            }
            System.out.println();
        }
    }
     
    public static void main(String[] args) {
        char[][] table = {
                           {'*','*','*'},  
                           {'*','*','*'},
                           {'*','*','*'}
                        };  
        boolean notDone = true;
        int winner = 0;
        System.out.println("TICTACTOE game"); 
        Scanner sc = new Scanner(System.in);
        do{                
        printboard(table);                   
            do{
            System.out.println("Player one move");
            System.out.print("Insert Row: ");
            int row = sc.nextInt();
            System.out.print("Insert Column: ");
            int col = sc.nextInt();
            if(row > 2 || col > 2){
                System.out.println("Row or Column is out of bounds try again");
                continue;
            }
            else if(isEleEmpty(table[row][col]) == true){
                table[row][col] = 'O';
                break;
            }else{
                System.out.println("Position already occupied try again");
                continue;
            }
            
        }while(true);
        // win conditions for player 1
            if(winConPlayer1(table[0][0], table[0][1], table[0][2]) == true){
                winner = 1;
                notDone = false;
                break;
            }
            if(winConPlayer1(table[1][0], table[1][1], table[1][2]) == true){
                winner = 1;
                notDone = false;
                break;
            }
            if(winConPlayer1(table[2][0], table[2][1], table[2][2]) == true){
                winner = 1;
                notDone = false;
                break;
            }
            if(winConPlayer1(table[0][0], table[1][0], table[2][0]) == true){
                winner = 1;
                notDone = false;
                break;
            }
            if(winConPlayer1(table[0][1], table[1][1], table[2][1]) == true){
                winner = 1;
                notDone = false;
                break;
            }
            if(winConPlayer1(table[0][2], table[1][2], table[2][2]) == true){
                winner = 1;
                notDone = false;
                break;
            }
            if(winConPlayer1(table[0][0], table[1][1], table[2][2]) == true){
                winner = 1;
                notDone = false;
                break;
            }
            if(winConPlayer1(table[2][0], table[1][1], table[0][2]) == true){
                winner = 1;
                notDone = false;
                break;
            }
            if(checkIfTie(table) == true){
                printboard(table);  
                System.out.println("Tie game! Game Over");
                notDone = false;
                break;
            }
        // end of win conditions
            
            printboard(table);
            do{  
            System.out.println("Player two move");           
            System.out.print("Insert Row: ");
            int row2 = sc.nextInt();
            System.out.print("Insert Column: ");
            int col2 = sc.nextInt();
            if(row2 > 2 || col2 > 2){
                System.out.println("Row or Column is out of bounds try again");
                continue;
            }else if(isEleEmpty(table[row2][col2]) == true){
                table[row2][col2] = 'X';
                break;
            }else{
                System.out.println("Position already occupied try again");
                continue;
            }
            
            }while(true);
            if(winConPlayer2(table[0][0], table[0][1], table[0][2]) == true){
                winner = 2;
                notDone = false;
                break;
            }
            if(winConPlayer2(table[1][0], table[1][1], table[1][2]) == true){
                winner = 2;
                notDone = false;
                break;
            }
            if(winConPlayer2(table[2][0], table[2][1], table[2][2]) == true){
                winner = 2;
                notDone = false;
                break;
            }
            if(winConPlayer2(table[0][0], table[1][0], table[2][0]) == true){
                winner = 2;
                notDone = false;
                break;
            }
            if(winConPlayer2(table[0][1], table[1][1], table[2][1]) == true){
                winner = 2;
                notDone = false;
                break;
            }
            if(winConPlayer2(table[0][2], table[1][2], table[2][2]) == true){
                winner = 2;
                notDone = false;
                break;
            }
            if(winConPlayer2(table[0][0], table[1][1], table[2][2]) == true){
                winner = 2;
                notDone = false;
                break;
            }
            if(winConPlayer2(table[2][0], table[1][1], table[0][2]) == true){
                winner = 2;
                notDone = false;
                break;
            }
            if(checkIfTie(table) == true){
                printboard(table);  
                System.out.println("Tie game! Game Over");
                notDone = false;
                break;
            }

    }while(notDone);    
     sc.close();
    if(winner > 0){
     System.out.println("Game over! Player " + winner + " Wins!");
        }
    }
}


