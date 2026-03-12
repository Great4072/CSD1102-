import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculatorFX extends Application {

    @Override
    public void start(Stage stage) {

        TextField num1 = new TextField();
        TextField num2 = new TextField();
        TextField result = new TextField();

        Button add = new Button("Add");
        Button sub = new Button("Subtract");
        Button mul = new Button("Multiply");
        Button div = new Button("Divide");

        add.setOnAction(e -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            result.setText(String.valueOf(a + b));
        });

        sub.setOnAction(e -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            result.setText(String.valueOf(a - b));
        });

        mul.setOnAction(e -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            result.setText(String.valueOf(a * b));
        });

        div.setOnAction(e -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            result.setText(String.valueOf(a / b));
        });

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(new Label("First operand:"),0,0);
        grid.add(num1,1,0);

        grid.add(new Label("Second operand:"),0,1);
        grid.add(num2,1,1);

        grid.add(add,0,2);
        grid.add(sub,1,2);
        grid.add(mul,0,3);
        grid.add(div,1,3);

        grid.add(new Label("Result:"),0,4);
        grid.add(result,1,4);

        Scene scene = new Scene(grid,300,200);

        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
