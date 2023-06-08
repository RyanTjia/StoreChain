public class Driver {

	public boolean testConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
}