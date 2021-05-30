package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HomePageController {
	@FXML
    private VBox main_page;
	  
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_bitkileriGoster;

    @FXML
    private Button btn_adminPaneli;

    @FXML
    private Button btn_uygulamaBilgisi;

    @FXML
    void btn_adminPaneli(ActionEvent event) {
   
		
    	
		
        Stage stage=new Stage();
        Parent	root= null;
		try {
			root = FXMLLoader.load(getClass().getResource("Login.fxml"));
			  stage.setScene(new Scene(root));
		        
		        Stage stage1 = (Stage)btn_adminPaneli.getScene().getWindow();
		        stage.initModality(Modality.WINDOW_MODAL);
		        stage1.close();
		        stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
        
        
    }

    @FXML
    void btn_bitkileriGosterClick(ActionEvent event) {
        Stage stage=new Stage();
        Parent	root= null;
		try {
			root = FXMLLoader.load(getClass().getResource("PlantName.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
				System.out.println("Bitkileri goster acilamadi " + e);
		}
        stage.setScene(new Scene(root));
        
        Stage stage1 = (Stage)btn_bitkileriGoster.getScene().getWindow();
        stage1.close();
        stage.show();
    }

    @FXML
    void btn_uygulamaBilgisiClick(ActionEvent event) {
        Stage stage=new Stage();
        Parent	root= null;
		try {
			root = FXMLLoader.load(getClass().getResource("Info.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
				System.out.println("Info acilamadi " + e);
		}
        stage.setScene(new Scene(root));
        
        Stage stage1 = (Stage)btn_uygulamaBilgisi.getScene().getWindow();
        stage1.close();
        stage.show();
    }

    @FXML
    void initialize() {
        assert btn_bitkileriGoster != null : "fx:id=\"btn_bitkileriGoster\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert btn_adminPaneli != null : "fx:id=\"btn_adminPaneli\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert btn_uygulamaBilgisi != null : "fx:id=\"btn_uygulamaBilgisi\" was not injected: check your FXML file 'HomePage.fxml'.";

    }
}
