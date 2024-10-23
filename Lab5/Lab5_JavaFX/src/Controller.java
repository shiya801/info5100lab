
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sheha
 */

   
     
   public class Controller {
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField ageTextField;
    @FXML
    private TextField emailTextField;

    @FXML
    private void submit(ActionEvent event) {
        System.out.println("Submitted");

        String name = nameTextField.getText();
        String age = ageTextField.getText();
        String email = emailTextField.getText();

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Submitted");
        alert.setHeaderText("Thank You");
        alert.setContentText(String.format("Submitted Details: Name: %s Age: %s Email: %s", name, age, email));
        alert.showAndWait();
    }
}
