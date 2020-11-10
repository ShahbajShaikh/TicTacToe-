public class TicTacToeGame {

   public static char[] initBoard(){
      char[] board = new char[10];
      for(int index=1;index<board.length;index++){
         board[index]=' ';
      }
          return board;
   }

      public static void main(String[] args){
        TicTacToeGame.initBoard();
    }
}
