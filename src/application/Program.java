package application;

import Chess.ChessMatch;
import boardGame.Board;
import boardGame.Position;

public class Program {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
