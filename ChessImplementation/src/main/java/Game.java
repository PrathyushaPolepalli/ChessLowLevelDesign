public class Game {
	static Game g = null;
	ChessBoard chessBoard = new ChessBoard();

	private Game() {
	};

	boolean move(int p1[], int p2[]) {
		String piece = chessBoard.getPiece(p1[0], p1[1]);
		if (chessBoard.currentPlayer != piece.charAt(0)) {
			System.out.println("It's not your turn!");
			return false;
		}
		boolean valid = ValidatorFactory.getInstance().getValidator(piece.charAt(1)).isValid(p1, p2, piece.charAt(0));
		if (valid) {
			chessBoard.setPiece(p1[0], p1[1], "--");
			chessBoard.setPiece(p2[0], p2[1], piece);
			return true;
		}
		return false;
	}

	static public Game getInstance() {
		if (g == null)
			g = new Game();
		return g;
	}
}
