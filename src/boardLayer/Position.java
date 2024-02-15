package boardLayer;

public class Position {
	private Integer rows;
	private Integer columns;
	
	public Position(Integer rows, Integer columns) {
		this.rows = rows;
		this.columns = columns;
	}
	
	public Position() {
	}
	
	public Integer getRaw() {
		return rows;
	}
	public void setRaw(Integer rows) {
		this.rows = rows;
	}
	public Integer getColumn() {
		return columns;
	}
	public void setColumn(Integer columns) {
		this.columns = columns;
	}
	@Override
	public String toString() {
		return rows + ", " + columns;
	}
	
	
}
