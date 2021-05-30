package application;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class InfoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    
    @FXML
    private ImageView btn_back;
    
    @FXML
    private ImageView github;

    @FXML
    private ImageView linkedin;

    @FXML
    private Label txt_latinName1;

    @FXML
    private Label txt_latinName;

    @FXML
    private Label txt_latinName2;

    @FXML
    private Label txt_latinName21;

    @FXML
    private Label txt_latinName211;

    @FXML
    void btn_backClick(MouseEvent event) {
    	try{
            Stage stage=new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
            stage.setScene(new Scene(root));
            
            Stage stage1 = (Stage)btn_back.getScene().getWindow();
            stage1.close();
            stage.show();
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
    }
    
    
    @FXML
    void githubClick(MouseEvent event) {

    	 try {
			Desktop.getDesktop().browse(new URL("https://github.com/aozkan9").toURI());
		} catch (IOException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void github_hyper(ActionEvent event) {
   	 try {
			Desktop.getDesktop().browse(new URL("https://github.com/aozkan9").toURI());
		} catch (IOException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void linkedinClick(MouseEvent event) {
   	 try {
			Desktop.getDesktop().browse(new URL("https://linkedin.com/in/ahmet-ozkan").toURI());
		} catch (IOException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void linkedin_hyper(ActionEvent event) {
   	 try {
			Desktop.getDesktop().browse(new URL("https://linkedin.com/in/ahmet-ozkan").toURI());
		} catch (IOException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void initialize() {
        assert github != null : "fx:id=\"github\" was not injected: check your FXML file 'Info.fxml'.";
        assert linkedin != null : "fx:id=\"linkedin\" was not injected: check your FXML file 'Info.fxml'.";
        assert txt_latinName1 != null : "fx:id=\"txt_latinName1\" was not injected: check your FXML file 'Info.fxml'.";
        assert txt_latinName != null : "fx:id=\"txt_latinName\" was not injected: check your FXML file 'Info.fxml'.";
        assert txt_latinName2 != null : "fx:id=\"txt_latinName2\" was not injected: check your FXML file 'Info.fxml'.";
        assert txt_latinName21 != null : "fx:id=\"txt_latinName21\" was not injected: check your FXML file 'Info.fxml'.";
        assert txt_latinName211 != null : "fx:id=\"txt_latinName211\" was not injected: check your FXML file 'Info.fxml'.";

    }
}

