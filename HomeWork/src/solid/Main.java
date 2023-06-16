package src.solid;

import src.solid.Persister.Persister;
import src.solid.Persister.Persisterable;
import src.solid.User.User;
import src.solid.User.UserAction;
import src.solid.User.UserActionInterface;
public class Main{
	public static void main(String[] args){
		UserActionInterface userAction = new UserAction();
		Persisterable persister = new Persister();

		User user = new User("Bob");
		userAction.report(user);
		persister.save(user);
	}
}