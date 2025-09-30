package chess_system.chess.pieces;

import chess_system.boardGame.Board;
import chess_system.boardGame.Position;
import chess_system.chess.ChessPiece;
import chess_system.chess.Color;

public class Knigth extends ChessPiece {

	public Knigth(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "N";
	}

	@Override
	public boolean[][] possibleMoves() {
	    boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

	    Position p = new Position(0, 0);

	    p.setValues(position.getRow() - 2, position.getColumn() - 1 );
	    if (getBoard().positionExists(p) && canMove(p))
	        mat[p.getRow()][p.getColumn()] = true;

	    p.setValues(position.getRow() - 1, position.getColumn() - 2);
	    if (getBoard().positionExists(p) && canMove(p))
	        mat[p.getRow()][p.getColumn()] = true;

	    p.setValues(position.getRow() + 2, position.getColumn() + 1);
	    if (getBoard().positionExists(p) && canMove(p))
	        mat[p.getRow()][p.getColumn()] = true;

	    p.setValues(position.getRow() + 1, position.getColumn() + 2);
	    if (getBoard().positionExists(p) && canMove(p))
	        mat[p.getRow()][p.getColumn()] = true;

	    p.setValues(position.getRow() - 1, position.getColumn() + 2);
	    if (getBoard().positionExists(p) && canMove(p))
	        mat[p.getRow()][p.getColumn()] = true;

	    p.setValues(position.getRow() - 2, position.getColumn() + 1);
	    if (getBoard().positionExists(p) && canMove(p))
	        mat[p.getRow()][p.getColumn()] = true;

	    p.setValues(position.getRow() + 2, position.getColumn() - 1);
	    if (getBoard().positionExists(p) && canMove(p))
	        mat[p.getRow()][p.getColumn()] = true;

	    p.setValues(position.getRow() + 1, position.getColumn() - 2);
	    if (getBoard().positionExists(p) && canMove(p))
	        mat[p.getRow()][p.getColumn()] = true;

	    return mat;
	}
	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}

}
