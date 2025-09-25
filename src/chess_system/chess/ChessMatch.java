package chess_system.chess;

import chess_system.boardGame.Board;
import chess_system.chess.pieces.King;
import chess_system.chess.pieces.Rook;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() {

		ChessPiece[][] pieces = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int c = 0; c < board.getColumns(); c++) {
				pieces[i][c] = (ChessPiece) board.piece(i, c);
			}
		}
		return pieces;
	}

	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}

	private void initialSetup() {
		placeNewPiece('b', 8, new Rook(board, Color.WHITE));
		placeNewPiece('f', 8, new King(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.BLACK));

	}
}
