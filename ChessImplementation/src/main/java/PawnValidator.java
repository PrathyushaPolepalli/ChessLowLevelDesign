
public class PawnValidator implements PieceValidator {
	/*
	 * If it is the first move of that pawn, it can move two positions to a cell in
	 * front. Both the cells in front of it needs to be unoccupied. It can also move
	 * one step diagonally in front while capturing a piece of the opponent. The
	 * capture cannot happen without moving diagonally.
	 */
	Game game = Game.getInstance();

	public boolean isValid(int p1[], int p2[], char c) {
		String curr = game.chessBoard.getPiece(p1[0], p1[1]);
		String next = game.chessBoard.getPiece(p2[0], p2[1]);
		if (next.charAt(0) == curr.charAt(0))
			return false;
		if (c == 'W') {
			if (p2[1] == p1[1] && p2[0] == p1[0] + 1)
				return true;
			if (p1[0] == 1 && p2[0] == 3) {
				if (game.chessBoard.getPiece(p1[0] + 1, p1[1]) == "--" && game.chessBoard.getPiece(p1[0] + 2, p1[1]) == "--")
					return true;
			}
			if (p2[0] == p1[0] + 1 && (p2[1] == p1[1] - 1 || p2[1] == p1[1] + 1)) {
				if (game.chessBoard.getPiece(p2[0], p2[1]) != "--")
					return true;

			}
		} else {
			if (p2[1] == p1[1] && p2[0] == p1[0] - 1)
				return true;
			if (p1[0] == 6 && p2[0] == 4) {
				if (game.chessBoard.getPiece(p1[0] - 1, p1[1]) == "--" && game.chessBoard.getPiece(p1[0] - 2, p1[1]) == "--")
					return true;
			}
			if (p2[0] == p1[0] - 1 && (p2[1] == p1[1] - 1 || p2[1] == p1[1] + 1)) {
				if (game.chessBoard.getPiece(p2[0], p2[1]) != "--")
					return true;
			}
		}
		return false;
	}

}
