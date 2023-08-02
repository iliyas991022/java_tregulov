
public final class Person1{
    private String login;
    Account account;

    public Person1(String login, String password )   {
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
