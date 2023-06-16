package src.solid.User;

public class UserAction implements UserActionInterface{
    @Override
    public void report(User user){
        System.out.println("Report for user: " + user.getName());
    }
}
