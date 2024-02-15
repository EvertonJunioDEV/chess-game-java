package boardLayer;

public class Position {
	private Integer raw;
	private Integer column;
	
	public Position(Integer raw, Integer column) {
		this.raw = raw;
		this.column = column;
	}
	
	public Position() {
	}
	
	public Integer getRaw() {
		return raw;
	}
	public void setRaw(Integer raw) {
		this.raw = raw;
	}
	public Integer getColumn() {
		return column;
	}
	public void setColumn(Integer column) {
		this.column = column;
	}
	@Override
	public String toString() {
		return raw + ", " + column;
	}
	
	
}
