package chess_system.application;

import chess_system.chess.ChessMatch;

public class Main {
	public static void main(String[] args) {
		
		
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
	}

}
