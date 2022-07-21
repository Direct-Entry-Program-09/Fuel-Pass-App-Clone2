package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class HomeFormController {
    public AnchorPane pneContainer;
    public ImageView pneLogin;
    public ImageView imgLogo;
    public AnchorPane imgContainer;

    public void  initialize() throws IOException {
        URL resource = this.getClass().getResource("/view/WelcomeForm.fxml");
        AnchorPane welcomeForm= FXMLLoader.load(resource);
        pneContainer.getChildren().add(welcomeForm);
        AnchorPane.setTopAnchor(welcomeForm,0.0);
        AnchorPane.setBottomAnchor(welcomeForm,0.0);
        AnchorPane.setRightAnchor(welcomeForm,0.0);
        AnchorPane.setLeftAnchor(welcomeForm,0.0);
    }


    public void imgLogoOnMouseClicked(MouseEvent mouseEvent) throws IOException {
        pneContainer.getChildren().clear();
        initialize();
    }

    public void pneLoginOnMouseClicked(MouseEvent mouseEvent) throws IOException {
        pneContainer.getChildren().clear();

        URL resource = this.getClass().getResource("/view/AdminLoginForm.fxml");
        AnchorPane adminLoginForm=FXMLLoader.load(resource);
        pneContainer.getChildren().add(adminLoginForm);
        AnchorPane.setLeftAnchor(adminLoginForm, 0.0);
        AnchorPane.setTopAnchor(adminLoginForm, 0.0);
        AnchorPane.setRightAnchor(adminLoginForm, 0.0);
        AnchorPane.setBottomAnchor(adminLoginForm, 0.0);

    }
    public void pneLoginOnKeyRelease(KeyEvent keyEvent) throws IOException {
        if (keyEvent.getCode() == KeyCode.ENTER || keyEvent.getCode() == KeyCode.SPACE){
            pneLoginOnMouseClicked(null);
        }
    }

}
