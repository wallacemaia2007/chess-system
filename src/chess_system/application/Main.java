package chess_system.application;

import java.util.Scanner;

import chess_system.chess.ChessMatch;
import chess_system.chess.ChessPiece;
import chess_system.chess.ChessPosition;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.println("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.println("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			
			
		}

	}

}
