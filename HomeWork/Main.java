public class Main {
    public static void main(String[] args) {
        Persister persister = new Persister();
        Reporter reporter = new Reporter();
        User user = new User("Bob");
        System.out.println(reporter.report(user));
        System.out.println(persister.save(user));

    }
}