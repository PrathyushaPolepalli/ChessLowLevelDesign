
public class KnightValidator implements PieceValidator {
	public boolean isValid(int[] p1, int[] p2, char c) {
		Game game = Game.getInstance();
		String curr = game.chessBoard.getPiece(p1[0], p1[1]);
		String next = game.chessBoard.getPiece(p2[0], p2[1]);
		if (next.charAt(0) == curr.charAt(0))
			return false;
		if (next.charAt(0) == curr.charAt(0))
			return false;
		if ((p2[0] == p1[0] - 2 || p2[0] == p1[0] + 2) && (p2[1] == p1[1] - 1 || p2[1] == p1[1] + 1)) {
			game.chessBoard.setPiece(p1[0], p1[1], "--");
			game.chessBoard.setPiece(p2[0], p2[1], curr);
			return true;
		}
		if ((p2[0] == p1[0] - 1 || p2[0] == p1[0] + 1) && (p2[1] == p1[1] - 2 || p2[1] == p1[1] + 2)) {
			game.chessBoard.setPiece(p1[0], p1[1], "--");
			game.chessBoard.setPiece(p2[0], p2[1], curr);
			return true;
		}
		return false;
	}

}
