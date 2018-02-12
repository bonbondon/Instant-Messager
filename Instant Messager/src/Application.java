public class Application {
	public static void main(String[] args) {
		Server IMServer;
		IMServer = new Server(7777);
		IMServer.run();
	}//end main
}//end class