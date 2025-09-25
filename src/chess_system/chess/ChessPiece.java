package chess_system.chess;

import chess_system.boardGame.Board;
import chess_system.boardGame.Piece;

public abstract class ChessPiece extends Piece {
	
	private Color color;

	public ChessPiece(Board board,Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}
