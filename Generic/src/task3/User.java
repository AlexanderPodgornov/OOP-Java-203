package task3;

public class User {
    private static String login;
    private static String password;

    public User(String login, String password) {
        User.login = login;
        User.password = password;
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public static class Query {
        public void printToLog() {
            System.out.println("Пользователь с логином " + login + " и паролем " + password + " отправил запрос");
        }
    }
}