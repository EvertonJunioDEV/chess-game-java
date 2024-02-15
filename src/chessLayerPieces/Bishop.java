package chessLayerPieces;

import boardLayer.Board;
import chessLayer.ChessPiece;
import chessLayer.Color;

public class Bishop extends ChessPiece {
	String pieceColor = "";

	public Bishop(Board board, Color color) {
		super(board, color);
		choseColor(color);
	}

	private void choseColor(Color color) {
		if (color == Color.WHITE) {
			pieceColor = "♗";
		} else {
			pieceColor = "♝";
		}
	}

	@Override
	public String toString() {
		return pieceColor;
	}

}