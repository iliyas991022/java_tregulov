package metanit;

public final class Person{
    private String login;
    Account account;

    public Person(String login, String password )   {
        this.login = login;
        account = new Account(password);

    }

    public class Account{
        private String password;
        Account(String password) {
            this.password = password;
        }
    }
}
