/**
 * TicTacToe
 */
public class TicTacToe {

  int[][] ooxx = new int[3][3];

  // ooxx = {{1,1,1},{1,1,1},{1,1,1}};

  public void printooxx() {
    for(int[] a : ooxx){
      for(int b : a){
        System.out.print(b);
      }
      System.out.println();
    }
  }
} 