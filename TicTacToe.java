/**
 * TicTacToe
 */
public class TicTacToe {

  // 0:""
  // 1:O
  // 2:X
  int[][] ooxx = new int[3][3];
  int turn = 2;
  boolean isgamestart = true;

  // ooxx = {{1,1,1},{1,1,1},{1,1,1}};

  public void go(String input) {
    // 1,2
    String[] tmp_array = input.split(",");
    // tmp_array[0]
    ooxx[Integer.parseInt(tmp_array[0])-1][Integer.parseInt(tmp_array[1])-1] = turn;
    if(win()){
      System.out.println("Player-" + who() + " is winner");
      isgamestart = false;
    }
    turn = turn==2?1:2;
  }

  public String who() {
    return turn==2?"X":"O";
  }

  public boolean win() {
    for (int i = 0; i < ooxx.length; i++) {
      if(ooxx[0][i] == ooxx[1][i] && ooxx[1][i] == ooxx[2][i] && ooxx[2][i] == turn){
        return true;
      }
      if(ooxx[i][0] == ooxx[i][1] && ooxx[i][1] == ooxx[i][2] && ooxx[i][2] == turn){
        return true;
      }
    }
      if(ooxx[0][0] == ooxx[1][1] && ooxx[1][1] == ooxx[2][2] && ooxx[2][2] == turn){
        return true;
      }
      if(ooxx[0][2] == ooxx[1][1] && ooxx[1][1] == ooxx[2][0] && ooxx[2][0] == turn){
        return true;
      }
    return false;
  }

  public void printooxx() {
    for(int[] a : ooxx){
      System.out.print("|");
      for(int b : a){
        System.out.print( b==2?" X ":b==1?" O ":"   " );
        System.out.print("|");
      }
      System.out.println("\n--------------");
    }
  }
} 