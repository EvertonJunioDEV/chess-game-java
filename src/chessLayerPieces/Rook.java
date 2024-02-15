package chessLayerPieces;

import boardLayer.Board;
import chessLayer.ChessPiece;
import chessLayer.Color;

public class Rook extends ChessPiece {
	String pieceColor = "";

	public Rook(Board board, Color color) {
		super(board, color);
		choseColor(color);
	}

	public void choseColor(Color color) {
		if (color == Color.WHITE) {
			pieceColor = "♖";
		} else {
			pieceColor = "♜";
		}
	}

	@Override
	public String toString() {
		return pieceColor;
	}

}
