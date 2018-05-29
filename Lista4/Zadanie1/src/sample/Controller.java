package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    private TextField primesAmount;
    @FXML
    private TextField noArgument;
    @FXML
    private TextArea showPrime;
    @FXML
    private Primes primes = new Primes();
    @FXML
    private Pane background;
    @FXML
    private Button primesB;
    @FXML
    private Button confirmB;
    @FXML
    private Button ExitB;
    @FXML
    private Button NmodeB;
    @FXML
    private Button ColorB;

    private void Error(String header, String content) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("ERROR");
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();

    }


    @FXML
    private void handleAction(ActionEvent event) {
        try {
            primes.createTabel(Integer.parseInt(primesAmount.getText()));
        } catch (NumberFormatException ex) {
            Error(" illegal or inappropriate argument!", "Try again!");

        } catch (IllegalArgumentException ex) {
            Error("Not an integeer", "Try again!");

        } catch (NegativeArraySizeException ex) {
            Error("Out of range", "Try again!");
        }
    }


    @FXML
    private void handleAction2(ActionEvent event) {
        try {
            showPrime.setText(Integer.toString(primes.number(Integer.parseInt(noArgument.getText()))));
        } catch (NumberFormatException ex) {
            Error("Not an integeer", "Try again!");
        } catch (IllegalArgumentException ex) {
            Error(" illegal or inappropriate argument!", "Try again!");

        } catch (NegativeArraySizeException ex) {
            Error("Out of range", "Try again!");

        } catch (ArrayIndexOutOfBoundsException ex) {
            Error("Out of range", "Try again!");

        }

    }

    @FXML
    private void Exit(ActionEvent event) {
        System.exit(1);

    }

    @FXML
    private void Nightmode(ActionEvent event) {

        background.setStyle("-fx-background-color: #404040 ");
        primesB.getStyleClass().clear();
        primesB.getStyleClass().add("buttonDark");
        confirmB.getStyleClass().clear();
        confirmB.getStyleClass().add("buttonDark");
        ExitB.getStyleClass().clear();
        ExitB.getStyleClass().add("buttonDark");
        NmodeB.getStyleClass().clear();
        NmodeB.getStyleClass().add("buttonDark");
        ColorB.getStyleClass().clear();
        ColorB.getStyleClass().add("buttonDark");
    }

    @FXML
    private void Color(ActionEvent event) {
        primesB.getStyleClass().add("buttonColor");
        confirmB.getStyleClass().add("buttonColor");
        ExitB.getStyleClass().add("buttonColor");
        NmodeB.getStyleClass().add("buttonColor");
        ColorB.getStyleClass().add("buttonColor");

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}

