/*
 * Authors: Amit and Arvind
 * Class: Person.java
 * Universal class for any person using the app. 
 */
import java.util.ArrayList;

public class Person{
	
	private String username;
	private String password;
	private ArrayList<Person> friends = new ArrayList<Person>();  
	private boolean isRunner = false;
	
	public Person(String U, String P)
	{
		username = U;
		password = P;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	private void addFriend(Person person)
	{
		friends.add(person);
	}
	
	private void removeFriend(Person person)
	{
		friends.remove(person); 
	}


	public boolean isRunner() {
		return isRunner;
	}


	public void setRunner(boolean isRunner) {
		this.isRunner = isRunner;
	}
	
	public void becomeRunner()
	{
		isRunner = true;
	}
	
	private boolean authenticateRunner(boolean isRunner){
		if(isRunner == true)
		{
			return true;
		}
	}
	
	/*
	 * Runner methods
	 */
	private ArrayList<String> orders = new ArrayList<String>();
	private ArrayList<Person> orders = new ArrayList<Person>();  

	
	private void addOrder(String order)
	{
		orders.add(order);
	}

	private void removeOrder(String order)
	{
		orders.remove(order);
	}
	/*
	 * invite friends to your run
	 */
	private void startRun()
	{
		
	}

}//end class