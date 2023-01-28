/**
 * TicTacToe
 */
public class TicTacToe {

  // 0:""
  // 1:O
  // 2:X
  int[][] ooxx = new int[3][3];

  // ooxx = {{1,1,1},{1,1,1},{1,1,1}};

  public void go(String input) {
    // 1,2
    String[] tmp_array = input.split(",");
    // tmp_array[0]
    ooxx[Integer.parseInt(tmp_array[0])-1][Integer.parseInt(tmp_array[1])-1] = 2;
  }


  public void printooxx() {
    for(int[] a : ooxx){
      for(int b : a){
        System.out.print( b==2?"X":b==1?"O":"" );
      }
      System.out.println();
    }
  }
} 