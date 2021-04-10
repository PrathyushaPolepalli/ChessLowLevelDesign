import java.util.Scanner;

public class Chess {

	public static void main(String[] args) {
		Game game = Game.getInstance();
		Scanner sc = new Scanner(System.in);
		game.chessBoard.print();
		String input = sc.nextLine();
		while (!input.equalsIgnoreCase("exit")) {
			System.out.println(input);
			int x1 = input.charAt(1) - '0' - 1;
			int y1 = input.charAt(0) - 'a';
			int x2 = input.charAt(4) - '0' - 1;
			int y2 = input.charAt(3) - 'a';
			int[] p1 = new int[2];
			int[] p2 = new int[2];
			p1[0] = x1;
			p1[1] = y1;
			p2[0] = x2;
			p2[1] = y2;
			if (!game.move(p1, p2)) {
				System.out.println("Invalid move");
			} else {
				game.chessBoard.print();
				game.chessBoard.nextPlayer();
			}
			input = sc.nextLine();
		}

	}

}
