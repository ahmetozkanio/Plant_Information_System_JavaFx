package DatabaseControl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Mysql.Util.DatabaseUtil;

import javafx.scene.control.TextField;

public class LoginGetControl {

	

	Connection baglanti = null;
	PreparedStatement sorguIfadesi=null;
	ResultSet getirilen = null;
	String sql;
	
	public LoginGetControl() {
		// TODO Auto-generated constructor stub
	
		baglanti = DatabaseUtil.baglan() ;
	}
	
	public boolean loginControl(TextField txt_userName,TextField txt_password) {
		
		
		sql = "select * from login where userName=? and password = ?";
		try {
			sorguIfadesi = baglanti.prepareStatement(sql);
			sorguIfadesi.setString(1, txt_userName.getText().trim());
			sorguIfadesi.setString(2, txt_password.getText().trim());
			
			getirilen = sorguIfadesi.executeQuery();
			
			if (!getirilen.next()) {
				System.out.println("Yanlis " + getirilen);
				return  false;

			}
			else {
				System.out.println("Dogru " + getirilen);
				return  true;
			}
			
		} catch (Exception e) {
			return false;

		}
		
	}
}
