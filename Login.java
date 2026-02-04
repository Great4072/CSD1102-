package proposalSystem;

public class Login {

    protected String username;
    protected String password;

    public boolean loginStatus() {

        return username.equals("admin") && password.equals("1234");
    }
}
