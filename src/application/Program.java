package application;

import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;
import boardGame.Board;
import boardGame.Position;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("source: ");
            ChessPosition source = UI.readoChessPosition(sc);
            System.out.print("Target: ");
            ChessPosition target = UI.readoChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source,target);
        }
    }
}
