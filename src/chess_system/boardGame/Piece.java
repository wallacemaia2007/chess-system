package chess_system.boardGame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) {

		return possibleMoves()[position.getRow()][position.getColumn()];

	}

	public boolean isTherAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < board.getRows(); i++) {
			for (int c = 0; c < board.getColumns(); c++) {
				if (mat[i][c])
					return true;
			}
		}
		return false;

	}

}
