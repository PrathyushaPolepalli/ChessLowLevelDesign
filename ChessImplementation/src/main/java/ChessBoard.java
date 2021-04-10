
public class ChessBoard {

	String[][] board = { { "WR", "WN", "WB", "WQ", "WK", "WB", "WN", "WR" }, { "WP", "WP", "WP", "WP", "WP", "WP", "WP", "WP" }, { "--", "--", "--", "--", "--", "--", "--", "--" },
			{ "--", "--", "--", "--", "--", "--", "--", "--" }, { "--", "--", "--", "--", "--", "--", "--", "--" }, { "--", "--", "--", "--", "--", "--", "--", "--" },
			{ "BP", "BP", "BP", "BP", "BP", "BP", "BP", "BP" }, { "BR", "BN", "BB", "BQ", "BK", "BB", "BN", "BR" } };
	char currentPlayer;

	ChessBoard() {
		currentPlayer = 'W';
	}

	public void print() {
		System.out.println();
		System.out.println();
		for (int i = 0; i < 24; i++) {
			System.out.print("-");
		}
		System.out.println();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < 24; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	String getPiece(int x, int y) {
		return board[x][y];
	}

	void setPiece(int x, int y, String s) {
		board[x][y] = s;
	}

	void nextPlayer() {
		if (currentPlayer == 'W') {
			currentPlayer = 'B';
		} else {
			currentPlayer = 'W';
		}
	}
}
