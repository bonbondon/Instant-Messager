import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Connection implements java.lang.Runnable{
	private static java.util.List<Command> commands;
	private Scanner input;
	private PrintStream output;
	private Socket socket;
	private User user;
	private Users user_database;
	
	public Connection(Socket socket, Users user_database){
		this.socket = socket;
		this.user_database = user_database;
		try {
			this.input = new Scanner(socket.getInputStream());
			this.output = new PrintStream(socket.getOutputStream());
		} catch (IOException e) {
			System.out.println("Bad input");
		}
	}//end constructor
	
	public void send(Message message){
		
	}
	public void setUser(User user){
		
	}
	public User getUser(){
		return user;
	}
	
	public Scanner input(){
		return input;
	}
	public PrintStream output(){
		return output;
	}
	public void close(){
		try {
			System.out.println("Closing...");
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}//end try/catch
	}
	public void run() {
		output.println("Welcome.");
		output.println("Please enter your command..");
		//SPECIAL
		String commandLine = input.next();
		String command = commandLine.substring(0, 4);
		if(command.equals("CRTE")){
			
		}else if(command.equals("AUTH")){
			
		}else if(command.equals("SEND")){
			
		}else if(command.equals("QUIT")){
			
		}else{
			System.out.println("Innapropriate command.");
		}//end else
	}//end run
}//end Connection