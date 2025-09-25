package chess_system.chess;

import chess_system.boardGame.Board;
import chess_system.boardGame.Position;
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

	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(1, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 1));
		board.placePiece(new King(board, Color.WHITE), new Position(4, 5));
		
	}
}
