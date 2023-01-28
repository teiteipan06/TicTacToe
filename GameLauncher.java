import java.util.Scanner;

public class GameLauncher {
  
  public static void main(String[] args) {
    System.out.println("******* Game Start *******");
    System.out.print("Player-X, enter your move (row[1-3],colum[1-3]): ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    TicTacToe t = new TicTacToe();
    t.printooxx();
  }
}
