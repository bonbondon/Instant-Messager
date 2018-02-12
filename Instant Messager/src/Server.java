import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class Server implements java.lang.Runnable{
	private java.net.ServerSocket server_socket;
	private Users user_database;
	
	Server(int port){
		try {
			server_socket = new ServerSocket(port);
			System.out.println("Online.");
		} catch (IOException e) {
			System.out.println("Server socket cannot be opened.");
		}//end try/catch
	}//end constructor

	public void run() {
		LinkedList<Socket> clientSockets = new LinkedList<Socket>();
		Socket test;
		Thread testThread;
		LinkedList<Thread> threadList = new LinkedList<Thread>();
//		PrintStream output;
//		PrintStream in
		try{
			while(true){
				test = server_socket.accept();
				testThread = new Thread(new Connection(test, user_database));
				testThread.start();
				threadList.add(testThread);
//				output = new PrintStream(test.getOutputStream());
//				output.println("Welcome");
				clientSockets.add(test);
//				output.println("How are you?");
			}//end while
		}catch(IOException e){
			System.out.println("darn");
		}//end try/catch
	}//end run
}//end class