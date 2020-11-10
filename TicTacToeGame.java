import java.util.Scanner;

public class TicTacToeGame {

   public static char[] initBoard(){
      char[] board = new char[10];
      for(int index=1;index<board.length;index++){
         board[index]=' ';
      }
          return board;
   }

   public static void playerChoice(){
      Scanner sc = new Scanner(System.in);
      char player;
      char computer;

      while(True){
         System.out.println("Enter player choice 'X' or 'O' ");
         char value = sc.next().Uppercase().charAt(0);

         if(value=='X'){
            player='X';
            computer='O';
               System.out.println("player choice is:"+player+"computer choice is:"+computer);
               break;
         }
        else if(value=='O'){
           player='O';
           computer='X';
                System.out.println("player choice is:"+player+"computer choice is:"+computer);
                break;
        }
        else{
                System.out.println("Invalid choice.");
        }
      }

   public static void main(String[] args){
        TicTacToeGame.initBoard();
        TicTakToeGame.playerChoice();
    }
}
