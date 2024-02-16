package boardLayer;

public class Board {
	private Integer rows;
	private Integer columns;

	private Piece[][] pieces;

	public Board(Integer rows, Integer columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at last 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}

	public Integer getRows() {
		return rows;
	}

	public Integer getColumns() {
		return columns;
	}

	public Piece piece(int rows, int columns) {
		if (!positonExistes(rows, columns)) {
			throw new BoardException("Error: position not on the board");
		}
		return pieces[rows][columns];
	}

	public Piece piece(Position position) {
		if (!positonExistes(position)) {
			throw new BoardException("Error: position not on the board");
		}
		return pieces[position.getRows()][position.getColumns()];
	}

	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("Error: there is already a piece on position" + position);
		}
		pieces[position.getRows()][position.getColumns()] = piece;
		piece.position = position;
	}

	private Boolean positonExistes(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}

	public Boolean positonExistes(Position position) {
		return positonExistes(position.getRows(), position.getColumns());
	}

	public Boolean thereIsAPiece(Position position) {
		if (!positonExistes(position)) {
			throw new BoardException("Error: position not on the board");
		}
		return piece(position) != null;
	}

}
