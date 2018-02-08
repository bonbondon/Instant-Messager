public class User {
	private Connection connection;
	private java.util.List<Message> messages;
	private java.lang.String password;
	private boolean super_user;
	private java.lang.String user_name;

	boolean authenticate(java.lang.String password) {

		return false;
	}

	void clearMessages() {

	}

	void connect(Connection conection) {

	}
	boolean connected() {

		return false;
	}

	void disconnect() {

	}

	public int hashCode() {


		return 0;
	}
	public java.util.List<Message> messages(){

		return null;
	}

	void send(Message message){
	}
}