package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import DatabaseControl.LoginGetControl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginController {

	

    @FXML
    private ImageView btn_back;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txt_userName;

    @FXML
    private PasswordField txt_password;

    @FXML
    private Button btn_login;

    @FXML
    private Label lbl_alert;

    

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
    void btn_loginClick(ActionEvent event) {
    	LoginGetControl lControl = new LoginGetControl();
    	lbl_alert.setText("Hosgeldiniz ....");
    	if (lControl.loginControl(txt_userName,txt_password)) {
    	
    		
            Stage stage=new Stage();
            Parent	root= null;
    		try {
    			root = FXMLLoader.load(getClass().getResource("AdminPaneli.fxml"));
    			  stage.setScene(new Scene(root));
    		        
    		        Stage stage1 = (Stage)btn_login.getScene().getWindow();
    		        stage.initModality(Modality.WINDOW_MODAL);
    		        stage1.close();
    		        stage.show();
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	}
    	else {
			lbl_alert.setText("Kullanici adi veya sifreniz hatali !! Lutfen tekrar deneyiniz.");
		}
    	
    	
    }

    @FXML
    void initialize() {
        assert txt_userName != null : "fx:id=\"txt_userName\" was not injected: check your FXML file 'Login.fxml'.";
        assert txt_password != null : "fx:id=\"txt_password\" was not injected: check your FXML file 'Login.fxml'.";
        assert btn_login != null : "fx:id=\"btn_login\" was not injected: check your FXML file 'Login.fxml'.";
        assert lbl_alert != null : "fx:id=\"lbl_alert\" was not injected: check your FXML file 'Login.fxml'.";

    }
}
