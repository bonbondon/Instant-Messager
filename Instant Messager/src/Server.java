import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class Server implements java.lang.Runnable{
	private java.net.ServerSocket server_socket;
	private Users user_database;
	
	Server(int port){
		try {
			server_socket = new ServerSocket(port);
		} catch (IOException e) {
			System.out.println("Server socket cannot be opened.");
		}//end try/catch
	}//end constructor

	public void run() {
		LinkedList<Socket> clientSockets = new LinkedList<Socket>();
		while(true){
			System.out.println("AAAAAAaaaaaa");
		}//end while
	}//end run
}//end class