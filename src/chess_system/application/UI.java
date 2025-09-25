package chess_system.application;

import chess_system.boardGame.Piece;
import chess_system.chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] pieces) {
		for (int i = 0; i < pieces.length ; i++) {
			System.out.print((8 - i) + " ");
			for (int c = 0; c < pieces.length ; c++) {
				printPiece(pieces[i][c]);
			}
			System.out.println();
			
		}
		System.out.println("  a b c d e f g h");

	}

	private static void printPiece(Piece piece) {
		if (piece == null) {
			System.out.print("-");

		} else {
			System.out.println(piece);
		}
		System.out.print( " ");
	}

}
