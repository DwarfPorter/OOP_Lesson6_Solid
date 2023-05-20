public class Persister implements Saveable {

	@Override
	public String save(User user) {
		return String.format("Save for user: %s", user.getName());
	}
}