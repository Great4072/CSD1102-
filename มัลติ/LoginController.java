import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class LoginController {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private void login() {

        String user = username.getText();
        String pass = password.getText();

        System.out.println("User: " + user);
        System.out.println("Password: " + pass);
    }
}
