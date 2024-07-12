package db;

public class DBIntegerityException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DBIntegerityException(String msg) {
		super(msg);
	}

}
