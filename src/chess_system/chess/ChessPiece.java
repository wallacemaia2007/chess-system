package chess_system.chess;

import chess_system.boardGame.Board;
import chess_system.boardGame.Piece;
import chess_system.boardGame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;
	private int moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	protected boolean isThereOponentPiece(Position position) {

		ChessPiece p = (ChessPiece) getBoard().piece(position);

		return p != null && p.getColor() != color;

	}

	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}

	public void increaseMoveCount() {
		moveCount++;
	}

	public void decreaseMoveCount() {
		moveCount--;
	}

	public int getMoveCount() {
		return moveCount;
	}

}
