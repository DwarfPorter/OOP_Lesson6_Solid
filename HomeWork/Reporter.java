public class Reporter implements Reportable {

    @Override
    public String report(User user) {
        return String.format("Report for user: %s", user.getName());
    }
}
