
public class QueenValidator implements PieceValidator {

	public boolean isValid(int[] p1, int[] p2, char c) {
		Game game = Game.getInstance();
		String curr = game.chessBoard.getPiece(p1[0], p1[1]);
		String next = game.chessBoard.getPiece(p2[0], p2[1]);
		if (next.charAt(0) == curr.charAt(0))
			return false;
		if ((p2[0] - p1[0]) / (p2[1] - p1[1]) == 1 || (p2[0] - p1[0]) / (p2[1] - p1[1]) == -1) {
			if (p2[0] - p1[0] == p2[1] - p1[1]) {
				if (p2[0] - p1[0] > 0) {
					for (int i = 1; i < p2[0] - p1[0]; i++) {
						if (game.chessBoard.getPiece(p1[0] + i, p1[1] + i) != "--")
							return false;
					}
				} else {
					for (int i = 1; i > p2[0] - p1[0]; i--) {
						if (game.chessBoard.getPiece(p1[0] + i, p1[1] + i) != "--")
							return false;
					}
				}
				game.chessBoard.setPiece(p1[0], p1[1], "--");
				game.chessBoard.setPiece(p2[0], p2[1], curr);
				return true;
			} else {
				if (p2[0] - p1[0] > 0) {
					for (int i = 1; i < p2[0] - p1[0]; i++) {
						if (game.chessBoard.getPiece(p1[0] + i, p1[1] - i) != "--")
							return false;
					}
				} else {
					for (int i = 1; i > p2[0] - p1[0]; i--) {
						if (game.chessBoard.getPiece(p1[0] - i, p1[1] + i) != "--")
							return false;
					}
				}
				game.chessBoard.setPiece(p1[0], p1[1], "--");
				game.chessBoard.setPiece(p2[0], p2[1], curr);
				return true;
			}
		}
		if (p1[0] == p2[0] || p1[1] == p2[1]) {
			if (p1[0] == p2[0]) {
				if (p1[1] > p2[1]) {
					for (int i = p1[1] - 1; i > p2[1]; i--) {
						if (game.chessBoard.getPiece(p1[0], i) != "--")
							return false;
					}
				} else {
					for (int i = p1[1] + 1; i < p2[1]; i++) {
						if (game.chessBoard.getPiece(p1[0], i) != "--")
							return false;
					}
				}
				game.chessBoard.setPiece(p1[0], p1[1], "--");
				game.chessBoard.setPiece(p2[0], p2[1], curr);
				return true;
			} else {
				if (p1[0] > p2[0]) {
					for (int i = p1[0] - 1; i > p2[0]; i--) {
						if (game.chessBoard.getPiece(i, p2[1]) != "--")
							return false;
					}
				} else {
					for (int i = p1[0] + 1; i < p2[0]; i++) {
						if (game.chessBoard.getPiece(i, p2[1]) != "--")
							return false;
					}
				}
				game.chessBoard.setPiece(p1[0], p1[1], "--");
				game.chessBoard.setPiece(p2[0], p2[1], curr);
				return true;
			}
		}
		return false;
	}

}
