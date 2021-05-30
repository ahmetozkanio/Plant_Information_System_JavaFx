package DatabaseQuery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Mysql.Util.DatabaseUtil;

import javafx.scene.control.TextField;

public class DeleteQuery {

	//database baglanti
	Connection baglanti = null;
	PreparedStatement sorguIfadesi=null;
	ResultSet getirilen = null;
	String sql;
	
	private TextField txt_ID;
	
	public DeleteQuery(TextField txt_ID) {
		
		this.txt_ID = txt_ID;
		
		baglanti = DatabaseUtil.baglan();	
		
	}

	  public void genelDelete() {
	    	sql = "delete from genel where genel_id=?";
	    	try {
				sorguIfadesi = baglanti.prepareStatement(sql);
				sorguIfadesi.setString(1,txt_ID.getText().trim());
				sorguIfadesi.executeUpdate();
			} catch (Exception e) {
	System.out.println("silinemedi");		}
			
		}
	    public void habitusDelete() {
	    	sql = "delete from habitus where habitus_id=?";
	    	try {
				sorguIfadesi = baglanti.prepareStatement(sql);
				sorguIfadesi.setString(1,txt_ID.getText().trim());
				sorguIfadesi.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	    public void cicekDelete() {
	    	sql = "delete from cicek where cicek_id=?";
	    	try {
				sorguIfadesi = baglanti.prepareStatement(sql);
				sorguIfadesi.setString(1,txt_ID.getText().trim());
				sorguIfadesi.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	    public void yaprakDelete() {
	    	sql = "delete from yaprak where yaprak_id=?";
	    	try {
				sorguIfadesi = baglanti.prepareStatement(sql);
				sorguIfadesi.setString(1,txt_ID.getText().trim());
				sorguIfadesi.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	    public void meyveDelete() {
	    	sql = "delete from meyve where meyve_id=?";
	    	try {
				sorguIfadesi = baglanti.prepareStatement(sql);
				sorguIfadesi.setString(1,txt_ID.getText().trim());
				sorguIfadesi.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	    public void kullanimAlanlariDelete() {
	    	sql = "delete from kullanim_alanlari where kullanimalanlari_id=?";
	    	try {
				sorguIfadesi = baglanti.prepareStatement(sql);
				sorguIfadesi.setString(1,txt_ID.getText().trim());
				sorguIfadesi.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	    public void kullanimAmaciDelete() {
	    	sql = "delete from kullanim_amaci where kullanim_amaci_id=?";
	    	try {
				sorguIfadesi = baglanti.prepareStatement(sql);
				sorguIfadesi.setString(1,txt_ID.getText().trim());
				sorguIfadesi.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	    public void yetismeIstegiDelete() {
	    	sql = "delete from yetisme_istegi where yetisme_istegi_id=?";
	    	try {
				sorguIfadesi = baglanti.prepareStatement(sql);
				sorguIfadesi.setString(1,txt_ID.getText().trim());
				sorguIfadesi.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	    public void digerBilgilerDelete() {
	    	sql = "delete from diger_bilgiler where diger_bilgiler_id=?";
	    	try {
				sorguIfadesi = baglanti.prepareStatement(sql);
				sorguIfadesi.setString(1,txt_ID.getText().trim());
				sorguIfadesi.executeUpdate();
				
				
			} catch (Exception e) {
				
			}
		}
	    

	
}
