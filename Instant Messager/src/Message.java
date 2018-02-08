public class Message {
	private User from;
	private String message;
	
	public Message(User from, String message){
		this.from = from;
		this.message = message;
	}//end constructor
	
	public User from(){
		return from;
	}//end from
	
	public String message(){
		return message;
	}//end message
}//end class