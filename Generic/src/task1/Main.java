package task1;

public class Main {
    public static void main(String[] args) {
        User user = new User("admin", "12345678");
        user.createQuery();
        User.Query query = user.new Query();
        query.printToLog();
    }
}