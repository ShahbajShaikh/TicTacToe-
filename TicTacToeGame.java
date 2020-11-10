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


         System.out.println("Enter player choice 'X' or 'O' ");
         char value = sc.next().toUpperCase().charAt(0);

         if(value=='X'){
            player='X';
            computer='O';
               System.out.println("player choice is: " +player+ " computer choice is: " +computer);

         }
        else if(value=='O'){
           player='O';
           computer='X';
                System.out.println("player choice is: " +player+ " computer choice is: " +computer);

        }
        else{
                System.out.println("Invalid choice.");
        }
      }

	public static void displayBoard(char[] board){
	System.out.println("Displaying the Game Board");
	for(int index1=1;index1<board.length;index1=index1+3){
		System.out.println("|"+board[index1]+"|"+board[index1+1]+"|"+board[index1+2]);
		System.out.println("|"+board[index1+3]+"|"+board[index1+4]+"|"+board[index1+5]);
		System.out.println("|"+board[index1+6]+"|"+board[index1+7]+"|"+board[index1+8]);
		break;
		}
	}

   public static void main(String[] args){
        TicTacToeGame.initBoard();
        TicTacToeGame.playerChoice();
	TicTacToeGame.displayBoard(TicTacToeGame.initBoard());
    }
}
