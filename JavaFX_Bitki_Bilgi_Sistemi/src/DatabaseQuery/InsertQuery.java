package DatabaseQuery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Mysql.Util.DatabaseUtil;

import javafx.scene.control.TextField;

public class InsertQuery {
	
	
	
	Connection baglanti = null;
	PreparedStatement sorguIfadesi=null;
	ResultSet getirilen = null;
	String sql;

	private TextField txt_ID;
	public InsertQuery(TextField txt_ID) {
		
		this.txt_ID = txt_ID;
		
		baglanti = DatabaseUtil.baglan();

	}
	
	
	 public void genelInsert(
	    		TextField txt_latinName,
	    		TextField txt_turkce,
	    		TextField txt_buyume_formu,
	    		TextField txt_anavatani,
	    		TextField txt_yetistigi_bolge,
	    		TextField txt_ailesi,
	    		TextField txt_genel_notlar) {
	    	sql = "insert into genel(genel_id,\r\n"
	    			+ "latince_ismi,\r\n"
	    			+ "turkce_isimleri,\r\n"
	    			+ "buyume_formu,\r\n"
	    			+ "anavatani,\r\n"
	    			+ "yetistigi_bolge,\r\n"
	    			+ "ailesi,\r\n"
	    			+ "notlar) values(?,?,?,?,?,?,?,?)";
	    	
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

				sorguIfadesi.executeUpdate();
				
			
				//label.setText("Kullanici Eklendi");
				System.out.println("Genel eklendi");
			} catch (Exception e) {
					System.out.println("Kayit eklenemedi");
			
			}
	    }
	    public void habitusInsert(
	    		TextField txt_habitus_sekli,
	    		TextField txt_habitus_boyu,
	    		TextField txt_habitus_capi,
	    		TextField txt_habitus_dokusu,
	    		TextField txt_habitus_notlar) {
	    	
	    	sql = "insert into habitus(habitus_id,sekli,boyu,capi,dokusu,habitus_hakkinda_notlar) values(?,?,?,?,?,?)";

	    	try {
				sorguIfadesi = baglanti.prepareStatement(sql);
				sorguIfadesi.setString(1, txt_ID.getText().trim());
				sorguIfadesi.setString(2, txt_habitus_sekli.getText().trim());
				sorguIfadesi.setString(3, txt_habitus_boyu.getText().trim());
				sorguIfadesi.setString(4, txt_habitus_capi.getText().trim());
				sorguIfadesi.setString(5, txt_habitus_dokusu.getText().trim());
				sorguIfadesi.setString(6, txt_habitus_notlar.getText().trim());
		
				sorguIfadesi.executeUpdate();
				System.out.println("habitus eklendi");

				//label.setText("Kullanici Eklendi");
			} catch (Exception e) {
				
				System.out.println("habitus eklenemedi"+ e);

			
			}
	    }



	    public void cicekInsert(
	    		TextField txt_cicek_durumu,
	    		TextField txt_cicek_buyuklugu,
	    		TextField txt_cicek_kokusu,
	    		TextField txt_cicek_rengi,
	    		TextField txt_ciceklenme_vakti,
	    		TextField txt_cicek_notlar) {
	    	
	    	sql = "insert into cicek(cicek_id,\r\n"
	    			+ "cicek_durumu,\r\n"
	    			+ "cicek_buyuklugu,\r\n"
	    			+ "cicek_kokusu,\r\n"
	    			+ "cicek_rengi,\r\n"
	    			+ "ciceklenme_zamani,\r\n"
	    			+ "cicek_hakkinda_notlar) values(?,?,?,?,?,?,?)";

	    	try {
				sorguIfadesi = baglanti.prepareStatement(sql);
				sorguIfadesi.setString(1, txt_ID.getText().trim());
				sorguIfadesi.setString(2, txt_cicek_durumu.getText().trim());
				sorguIfadesi.setString(3, txt_cicek_buyuklugu.getText().trim());
				sorguIfadesi.setString(4, txt_cicek_kokusu.getText().trim());
				sorguIfadesi.setString(5, txt_cicek_rengi.getText().trim());
				sorguIfadesi.setString(6, txt_ciceklenme_vakti.getText().trim());
				sorguIfadesi.setString(7, txt_cicek_notlar.getText().trim());

				sorguIfadesi.executeUpdate();
				System.out.println("cicek eklendi");

				//label.setText("Kullanici Eklendi");
			} catch (Exception e) {
				System.out.println("cicek eklenemedi" +e);

			
			}
	    }
	    
	    public void yaprakInsert(
	    		TextField txt_yaprak_dokme,
	    		TextField txt_yaprak_tipi,
	    		TextField txt_yaprak_sekli,
	    		TextField txt_yaprak_buyuklugu,
	    		TextField txt_yaprak_kokusu,
	    		TextField txt_yaprak_dokusu,
	    		TextField txt_yaprak_rengi,
	    		TextField txt_yaprak_guz_rengi,
	    		TextField txt_yaprak_notlar) {
	    	
	    	sql = "insert into yaprak(yaprak_id,\r\n"
	    			+ "yaprak_dokme,\r\n"
	    			+ "yaprak_tipi,\r\n"
	    			+ "yaprak_sekli,\r\n"
	    			+ "yaprak_buyuklugu,\r\n"
	    			+ "yaprak_kokusu,\r\n"
	    			+ "yaprak_dokusu,\r\n"
	    			+ "yaprak_rengi,\r\n"
	    			+ "yaprak_guz_rengi,\r\n"
	    			+ "yaprak_hakkinda_notlar) values(?,?,?,?,?,?,?,?,?,?)";

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

				sorguIfadesi.executeUpdate();
				System.out.println("yaprak eklendi");

				//label.setText("Kullanici Eklendi");
			} catch (Exception e) {
		
				System.out.println("yaprak eklenemedi"+ e);

			}
	    }
	    
	    public void meyveInsert(
	    		TextField txt_meyve_durumu,
	    		TextField txt_meyve_tipi,
	    		TextField txt_meyve_buyuklugu,
	    		TextField txt_meyve_rengi,
	    		TextField txt_meyve_yenilebilirligi,
	    		TextField txt_meyve_zamani) {
	    	
	    	sql = "insert into meyve(meyve_id,\r\n"
	    			+ "meyve_durumu,\r\n"
	    			+ "meyve_tipi,\r\n"
	    			+ "meyve_buyuklugu,\r\n"
	    			+ "meyve_rengi,\r\n"
	    			+ "meyve_yenilebilirligi,\r\n"
	    			+ "meyve_zamani) values(?,?,?,?,?,?,?)";


	    	try {
				sorguIfadesi = baglanti.prepareStatement(sql);
				sorguIfadesi.setString(1, txt_ID.getText().trim());
				sorguIfadesi.setString(2, txt_meyve_durumu.getText().trim());
				sorguIfadesi.setString(3, txt_meyve_tipi.getText().trim());
				sorguIfadesi.setString(4, txt_meyve_buyuklugu.getText().trim());
				sorguIfadesi.setString(5, txt_meyve_rengi.getText().trim());
				sorguIfadesi.setString(6, txt_meyve_yenilebilirligi.getText().trim());
				sorguIfadesi.setString(7, txt_meyve_zamani.getText().trim());

				sorguIfadesi.executeUpdate();
				System.out.println("meyve eklendi");

				//label.setText("Kullanici Eklendi");
			} catch (Exception e) {
				System.out.println("yaprak eklendi");

			
			}
	    }
	    public void kullanimAlanlariInsert(
	    		TextField txt_kirsal,
	    		TextField txt_kentsel,
	    		TextField txt_diger,
	    		TextField txt_peyzaj_tarzi,
	    		TextField txt_kullanima_iliskin_notlar) {
	    	
	    	sql = "insert into kullanim_alanlari(kullanimalanlari_id,\r\n"
	    			+ "kirsal_kullanim_alanlari,\r\n"
	    			+ "kentsel_kullanim_alanlari,\r\n"
	    			+ "diger_kullanim_alanlari,\r\n"
	    			+ "peyzaj_tarzi,\r\n"
	    			+ "kullanima_iliskin_notlar) values(?,?,?,?,?,?)";

	    	try {
				sorguIfadesi = baglanti.prepareStatement(sql);
				sorguIfadesi.setString(1, txt_ID.getText().trim());
				sorguIfadesi.setString(2, txt_kirsal.getText().trim());
				sorguIfadesi.setString(3, txt_kentsel.getText().trim());
				sorguIfadesi.setString(4, txt_diger.getText().trim());
				sorguIfadesi.setString(5, txt_peyzaj_tarzi.getText().trim());
				sorguIfadesi.setString(6, txt_kullanima_iliskin_notlar.getText().trim());
		

				sorguIfadesi.executeUpdate();
				System.out.println("kullanimalanlari eklendi");

				//label.setText("Kullanici Eklendi");
			} catch (Exception e) {
		
			
			}
	    }
	    
	    public void kullanimAmaciInsert(
	    		TextField txt_muhendislik,
	    		TextField txt_mimarlik,
	    		TextField txt_ek_ozellikler) {
	    	
	    	sql = "insert into kullanim_amaci(kullanim_amaci_id,\r\n"
	    			+ "muhendislik_islevleri,\r\n"
	    			+ "mimarlik_islevleri,\r\n"
	    			+ "ek_ozellikler) values(?,?,?,?)";


	    	try {
				sorguIfadesi = baglanti.prepareStatement(sql);
				sorguIfadesi.setString(1, txt_ID.getText().trim());
				sorguIfadesi.setString(2, txt_muhendislik.getText().trim());
				sorguIfadesi.setString(3, txt_mimarlik.getText().trim());
				sorguIfadesi.setString(4, txt_ek_ozellikler.getText().trim());
		

				sorguIfadesi.executeUpdate();
				System.out.println("kullanimamaci eklendi");

				//label.setText("Kullanici Eklendi");
			} catch (Exception e) {
		
			
			}
	    }
	    
	    public void yetismeIstegiInsert(
	    		TextField txt_gun_isigi_istegi,
	    		TextField txt_su_istegi,
	    		TextField txt_besin_gereksinimi,
	    		TextField txt_toprak_istegi,
	    		TextField txt_toprak_drenaji) {
	    	
	    	sql = "insert into yetisme_istegi(yetisme_istegi_id,\r\n"
	    			+ "gunisigi_istegi,\r\n"
	    			+ "su_istegi,\r\n"
	    			+ "besin_gereksinimi,\r\n"
	    			+ "toprak_istegi,\r\n"
	    			+ "toprak_drenaji) values(?,?,?,?,?,?)";

	    	try {
				sorguIfadesi = baglanti.prepareStatement(sql);
				sorguIfadesi.setString(1, txt_ID.getText().trim());
				sorguIfadesi.setString(2, txt_gun_isigi_istegi.getText().trim());
				sorguIfadesi.setString(3, txt_su_istegi.getText().trim());
				sorguIfadesi.setString(4, txt_besin_gereksinimi.getText().trim());
				sorguIfadesi.setString(5, txt_toprak_istegi.getText().trim());
				sorguIfadesi.setString(6, txt_toprak_drenaji.getText().trim());


				sorguIfadesi.executeUpdate();
				System.out.println("yetisme istegi eklendi");

				//label.setText("Kullanici Eklendi");
			} catch (Exception e) {
		
			
			}
	    }
	    
	    
	    public void digerBilgilerInsert(
	    		TextField txt_buyume_hizi,
	    		TextField txt_bakim_ihtiyaci,
	    		TextField txt_zehirlilik,
	    		TextField txt_uretimi) {
	    	
	    	sql = "insert into diger_bilgiler(diger_bilgiler_id,\r\n"
	    			+ "buyume_hizi,\r\n"
	    			+ "bakim_ihtiyaci,\r\n"
	    			+ "zehirlilik,\r\n"
	    			+ "uretimi) values(?,?,?,?,?)";


	    	try {
				sorguIfadesi = baglanti.prepareStatement(sql);
				sorguIfadesi.setString(1, txt_ID.getText().trim());
				sorguIfadesi.setString(2, txt_buyume_hizi.getText().trim());
				sorguIfadesi.setString(3, txt_bakim_ihtiyaci.getText().trim());
				sorguIfadesi.setString(4, txt_zehirlilik.getText().trim());
				sorguIfadesi.setString(5, txt_uretimi.getText().trim());


				sorguIfadesi.executeUpdate();
				System.out.println("diger bilgiler eklendi");

				//label.setText("Kullanici Eklendi");
			} catch (Exception e) {
		
			
			}
	    }
}
