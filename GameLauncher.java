package TicTacToe;
import java.util.Scanner;

public class GameLauncher {
  
  public static void main(String[] args) {
    System.out.println("******* Game Start *******");
    TicTacToe t = new TicTacToe();
    
    while (t.isgamestart) {
      System.out.print("Player-"+t.who()+", enter your move (row[1-3],colum[1-3]): ");
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      t.go(input);
      t.printooxx();
    }
    
  }
}
