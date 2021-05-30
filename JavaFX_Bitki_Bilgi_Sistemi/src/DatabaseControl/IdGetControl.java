package DatabaseControl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Mysql.Util.DatabaseUtil;

import javafx.scene.control.TextField;

public class IdGetControl {

	
	
	Connection baglanti = null;
	PreparedStatement sorguIfadesi=null;
	ResultSet getirilen = null;
	String sql;
	
	public IdGetControl( ) { 
		baglanti = DatabaseUtil.baglan() ;
	}
	
	public boolean idControl(TextField txt_ID) {
		
		
		sql = "select * from genel where genel_id=?";
		try {
			sorguIfadesi = baglanti.prepareStatement(sql);
			sorguIfadesi.setString(1, txt_ID.getText().trim());
	
			
			getirilen = sorguIfadesi.executeQuery();
			
			if (!getirilen.next()) {
				System.out.println("Guncellenmedi " + getirilen);
				return  false;

			}
			else {
				System.out.println("Guncellendi " + getirilen);
				return  true;
			}
			
		} catch (Exception e) {
			return false;

		}
		
	}
	
  	
}
