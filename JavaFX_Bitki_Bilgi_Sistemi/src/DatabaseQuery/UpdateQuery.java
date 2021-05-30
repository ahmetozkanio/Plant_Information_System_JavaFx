package DatabaseQuery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Mysql.Util.DatabaseUtil;

import application.AdminPaneliController;
import javafx.scene.control.TextField;

public class UpdateQuery {
	
	
	Connection baglanti = null;
	PreparedStatement sorguIfadesi=null;
	ResultSet getirilen = null;
	String sql;

	public UpdateQuery() {
		baglanti = DatabaseUtil.baglan();

	}
	
	
	
    public void genelUpdate(TextField txt_ID,
    		TextField txt_latinName,
    		TextField txt_turkce,
    		TextField txt_buyume_formu,
    		TextField txt_anavatani,
    		TextField txt_yetistigi_bolge,
    		TextField txt_ailesi,
    		TextField txt_genel_notlar) {
    	

    	sql = "update genel set genel_id =? ,latince_ismi = ? ,turkce_isimleri = ? ,buyume_formu=? ,anavatani=?,yetistigi_bolge=? ,ailesi = ? ,notlar= ?  where genel_id = ?";
    	
    	try {
			sorguIfadesi = baglanti.prepareStatement(sql);
			
			sorguIfadesi.setString(1, txt_ID.getText().trim());

			sorguIfadesi.setString(2, txt_latinName.getText().trim());
			sorguIfadesi.setString(3, txt_turkce.getText().trim());
			sorguIfadesi.setString(4, txt_buyume_formu.getText().trim());
			sorguIfadesi.setString(5, txt_anavatani.getText().trim());
			sorguIfadesi.setString(6, txt_yetistigi_bolge.getText().trim());
			sorguIfadesi.setString(7, txt_ailesi.getText().trim());
			sorguIfadesi.setString(8, txt_genel_notlar.getText().trim());
			sorguIfadesi.setString(9, txt_ID.getText().trim());
			sorguIfadesi.executeUpdate();
			
			System.out.println("Genel guncelledi");
		} catch (Exception e) {
			System.out.println("Genel Guncellenmedi" + e);
		}
	}
   
    public void habitusUpdate(TextField txt_ID,
    		TextField txt_habitus_sekli,
    		TextField txt_habitus_boyu,
    		TextField txt_habitus_capi,
    		TextField txt_habitus_dokusu,
    		TextField txt_habitus_notlar) {
    	
    	
    	sql = "update habitus set habitus_id=? ,"
    			+ "sekli = ? ,"
    			+ "boyu = ? ,"
    			+ "capi=? ,"
    			+ "dokusu=? ,"
    			+ "habitus_hakkinda_notlar = ? "
    			+ "where habitus_id=?";
    	




    	try {
			sorguIfadesi = baglanti.prepareStatement(sql);
			
			sorguIfadesi.setString(1, txt_ID.getText().trim());
			sorguIfadesi.setString(2, txt_habitus_sekli.getText().trim());
			sorguIfadesi.setString(3, txt_habitus_boyu.getText().trim());
			sorguIfadesi.setString(4, txt_habitus_capi.getText().trim());
			sorguIfadesi.setString(5, txt_habitus_dokusu.getText().trim());
			sorguIfadesi.setString(6, txt_habitus_notlar.getText().trim());
			sorguIfadesi.setString(7, txt_ID.getText().trim());
			
			sorguIfadesi.executeUpdate();

			System.out.println(" habbitus guncelledi");
		} catch (Exception e) {
			System.out.println("Habitus Guncellenmedi" + e);
		}
		
	}
    
    public void cicekUpdate(TextField txt_ID,
    		TextField txt_cicek_durumu,
    		TextField txt_cicek_buyuklugu,
    		TextField txt_cicek_kokusu,
    		TextField txt_cicek_rengi,
    		TextField txt_ciceklenme_vakti,
    		TextField txt_cicek_notlar) {
    	
    	
    	sql = "update cicek set cicek_durumu = ?, cicek_buyuklugu = ? ,cicek_kokusu=? ,cicek_rengi=? ,ciceklenme_zamani = ? ,cicek_hakkinda_notlar = ? where cicek_id = ? ";
    	


    	try {
			sorguIfadesi = baglanti.prepareStatement(sql);
			
		
			sorguIfadesi.setString(1, txt_cicek_durumu.getText().trim());
			sorguIfadesi.setString(2, txt_cicek_buyuklugu.getText().trim());
			sorguIfadesi.setString(3, txt_cicek_kokusu.getText().trim());
			sorguIfadesi.setString(4, txt_cicek_rengi.getText().trim());
			sorguIfadesi.setString(5, txt_ciceklenme_vakti.getText().trim());
			sorguIfadesi.setString(6, txt_cicek_notlar.getText().trim());
			sorguIfadesi.setString(7, txt_ID.getText().trim());
			
			sorguIfadesi.executeUpdate();

			System.out.println(" cicek guncelledi");
		} catch (Exception e) {
			System.out.println("cicek Guncellenmedi" + e);
		}
		
	}
    
    public void yaprakUpdate(TextField txt_ID,
    		TextField txt_yaprak_dokme,
    		TextField txt_yaprak_tipi,
    		TextField txt_yaprak_sekli,
    		TextField txt_yaprak_buyuklugu,
    		TextField txt_yaprak_kokusu,
    		TextField txt_yaprak_dokusu,
    		TextField txt_yaprak_rengi,
    		TextField txt_yaprak_guz_rengi,
    		TextField txt_yaprak_notlar) {
    	
    	sql = "update yaprak set yaprak_id=? ,"
    			+ "yaprak_dokme = ? ,"
    			+ "yaprak_tipi = ? ,"
    			+ "yaprak_sekli=? ,"
    			+ "yaprak_buyuklugu=? ,"
    			+ "yaprak_kokusu = ? ,"
    			+ "yaprak_dokusu = ? ,"
    			+ "yaprak_rengi = ? ,"
    			+ "yaprak_guz_rengi = ? ,"
    			+ "yaprak_hakkinda_notlar = ? "
    			+ "where yaprak_id=?";
    	
    	try {
			sorguIfadesi = baglanti.prepareStatement(sql);
			
			sorguIfadesi.setString(1, txt_ID.getText().trim());
			sorguIfadesi.setString(2, txt_yaprak_dokme.getText().trim());
			sorguIfadesi.setString(3, txt_yaprak_tipi.getText().trim());
			sorguIfadesi.setString(4, txt_yaprak_sekli.getText().trim());
			sorguIfadesi.setString(5, txt_yaprak_buyuklugu.getText().trim());
			sorguIfadesi.setString(6, txt_yaprak_kokusu.getText().trim());
			sorguIfadesi.setString(7, txt_yaprak_dokusu.getText().trim());
			sorguIfadesi.setString(8, txt_yaprak_rengi.getText().trim());
			sorguIfadesi.setString(9, txt_yaprak_guz_rengi.getText().trim());
			sorguIfadesi.setString(10, txt_yaprak_notlar.getText().trim());
			sorguIfadesi.setString(11, txt_ID.getText().trim());
			
			sorguIfadesi.executeUpdate();
			
			System.out.println(" yaprak guncelledi");
		} catch (Exception e) {
			System.out.println("yaprak Guncellenmedi" + e);
		
		}
	}
    
    public void meyveUpdate(TextField txt_ID,
    		TextField txt_meyve_durumu,
    		TextField txt_meyve_tipi,
    		TextField txt_meyve_buyuklugu,
    		TextField txt_meyve_rengi,
    		TextField txt_meyve_yenilebilirligi,
    		TextField txt_meyve_zamani) {
    	
    	sql = "update meyve set meyve_id=? ,"
    			+ "meyve_durumu = ? ,"
    			+ "meyve_tipi = ? ,"
    			+ "meyve_buyuklugu=? ,"
    			+ "meyve_rengi=? ,"
    			+ "meyve_yenilebilirligi = ? ,"
    			+ "meyve_zamani = ? "
    			+ "where meyve_id=?";
    	try {
			sorguIfadesi = baglanti.prepareStatement(sql);
			
			sorguIfadesi.setString(1, txt_ID.getText().trim());
			sorguIfadesi.setString(2, txt_meyve_durumu.getText().trim());
			sorguIfadesi.setString(3, txt_meyve_tipi.getText().trim());
			sorguIfadesi.setString(4, txt_meyve_buyuklugu.getText().trim());
			sorguIfadesi.setString(5, txt_meyve_rengi.getText().trim());
			sorguIfadesi.setString(6, txt_meyve_yenilebilirligi.getText().trim());
			sorguIfadesi.setString(7, txt_meyve_zamani.getText().trim());
			sorguIfadesi.setString(8, txt_ID.getText().trim());
			
			
			sorguIfadesi.executeUpdate();

			System.out.println(" meyve guncelledi");
		} catch (Exception e) {
			System.out.println("meyve Guncellenmedi" + e);
		}
		
	}
    
    public void kullanimAlanlariUpdate(TextField txt_ID,
    		TextField txt_kirsal,
    		TextField txt_kentsel,
    		TextField txt_diger,
    		TextField txt_peyzaj_tarzi,
    		TextField txt_kullanima_iliskin_notlar) {
    	
    	sql = "update kullanim_alanlari set kullanimalanlari_id=? ,"
    			+ "kirsal_kullanim_alanlari = ? ,"
    			+ "kentsel_kullanim_alanlari = ? ,"
    			+ "diger_kullanim_alanlari=? ,"
    			+ "peyzaj_tarzi=? ,"
    			+ "kullanima_iliskin_notlar = ? "
    			+ "where kullanimalanlari_id=?";

    	try {
			sorguIfadesi = baglanti.prepareStatement(sql);
			
			sorguIfadesi.setString(1, txt_ID.getText().trim());
			sorguIfadesi.setString(2, txt_kirsal.getText().trim());
			sorguIfadesi.setString(3, txt_kentsel.getText().trim());
			sorguIfadesi.setString(4, txt_diger.getText().trim());
			sorguIfadesi.setString(5, txt_peyzaj_tarzi.getText().trim());
			sorguIfadesi.setString(6, txt_kullanima_iliskin_notlar.getText().trim());
			sorguIfadesi.setString(7, txt_ID.getText().trim());
			
			
			sorguIfadesi.executeUpdate();

			System.out.println(" kullanim alanlari guncelledi ");
		} catch (Exception e) {
			System.out.println(" kullanim alanlari Guncellenmedi " + e);
		
		}
	}
    
    public void kullanimAmaciUpdate(TextField txt_ID,
    		TextField txt_muhendislik,
    		TextField txt_mimarlik,
    		TextField txt_ek_ozellikler) {
    	
    	sql = "update kullanim_amaci set kullanim_amaci_id=? ,"
    			+ "muhendislik_islevleri = ? ,"
    			+ "mimarlik_islevleri = ? ,"
    			+ "ek_ozellikler=? "
    			+ "where kullanim_amaci_id=?";

    	try {
			sorguIfadesi = baglanti.prepareStatement(sql);
			
			sorguIfadesi.setString(1, txt_ID.getText().trim());
			sorguIfadesi.setString(2, txt_muhendislik.getText().trim());
			sorguIfadesi.setString(3, txt_mimarlik.getText().trim());
			sorguIfadesi.setString(4, txt_ek_ozellikler.getText().trim());
			sorguIfadesi.setString(5, txt_ID.getText().trim());
			
			
			sorguIfadesi.executeUpdate();

			System.out.println(" kullanim amaci guncelledi ");
		} catch (Exception e) {
			System.out.println(" kullanim amaci Guncellenmedi " + e);
		}
		
	}
    
    public void yetismeIstegiUpdate(TextField txt_ID,
    		TextField txt_gun_isigi_istegi,
    		TextField txt_su_istegi,
    		TextField txt_besin_gereksinimi,
    		TextField txt_toprak_istegi,
    		TextField txt_toprak_drenaji) {
    	sql = "update yetisme_istegi set yetisme_istegi_id=? ,"
    			+ "gunisigi_istegi = ? ,"
    			+ "su_istegi = ? ,"
    			+ "besin_gereksinimi=? ,"
    			+ "toprak_istegi=? ,"
    			+ "toprak_drenaji=? "
    			+ "where yetisme_istegi_id=?";


    	try {
			sorguIfadesi = baglanti.prepareStatement(sql);
			
			sorguIfadesi.setString(1, txt_ID.getText().trim());
			sorguIfadesi.setString(2, txt_gun_isigi_istegi.getText().trim());
			sorguIfadesi.setString(3, txt_su_istegi.getText().trim());
			sorguIfadesi.setString(4, txt_besin_gereksinimi.getText().trim());
			sorguIfadesi.setString(5, txt_toprak_istegi.getText().trim());
			sorguIfadesi.setString(6, txt_toprak_drenaji.getText().trim());
			sorguIfadesi.setString(7, txt_ID.getText().trim());
			
			
			sorguIfadesi.executeUpdate();

			System.out.println("yetisme istegi guncelledi ");
		} catch (Exception e) {
			System.out.println(" yetisme istegi Guncellenmedi " + e);
		}
		
	}
    
    public void digerBilgilerUpdate(TextField txt_ID,
    		TextField txt_buyume_hizi,
    		TextField txt_bakim_ihtiyaci,
    		TextField txt_zehirlilik,
    		TextField txt_uretimi) {
    	
    	sql = "update diger_bilgiler set diger_bilgiler_id=? ,"
    			+ "buyume_hizi = ? ,"
    			+ "bakim_ihtiyaci = ? ,"
    			+ "zehirlilik=? ,"
    			+ "uretimi=? "
    			+ "where diger_bilgiler_id=?";
  	try {
			sorguIfadesi = baglanti.prepareStatement(sql);
			
			sorguIfadesi.setString(1, txt_ID.getText().trim());
			sorguIfadesi.setString(2, txt_buyume_hizi.getText().trim());
			sorguIfadesi.setString(3, txt_bakim_ihtiyaci.getText().trim());
			sorguIfadesi.setString(4, txt_zehirlilik.getText().trim());
			sorguIfadesi.setString(5, txt_uretimi.getText().trim());
			sorguIfadesi.setString(6, txt_ID.getText().trim());
			
			
			sorguIfadesi.executeUpdate();

			System.out.println(" diger bilgiler guncelledi ");
		} catch (Exception e) {
			System.out.println(" diger bilgiler Guncellenmedi " + e);
		}
		
	}
	
}
