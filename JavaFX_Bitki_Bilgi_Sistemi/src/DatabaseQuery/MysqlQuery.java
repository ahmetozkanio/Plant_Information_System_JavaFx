package DatabaseQuery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Mysql.Util.DatabaseUtil;

import Modals.Modeller;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MysqlQuery {
	
	Connection baglanti = null;
	PreparedStatement sorguIfadesi=null;
	ResultSet getirilen = null;
	String sql;
	String orderBy = " ORDER BY genel.latince_ismi ASC";

	

	
	
	 public MysqlQuery() {
		
		baglanti = DatabaseUtil.baglan();
	 }



	public void valuesAll(TableView<Modeller> tableView,ObservableList<Modeller> modellers,TableColumn<Modeller, Integer> býtkýIDCol,TableColumn<Modeller, String> plantName) {
			sql = "SELECT * FROM genel INNER JOIN habitus ON genel.genel_id = habitus.habitus_id \r\n"
					+ "JOIN cicek ON genel.genel_id  = cicek.cicek_id\r\n"
					+ "JOIN yaprak ON genel.genel_id  = yaprak.yaprak_id\r\n"
					+ "JOIN meyve ON genel.genel_id  = meyve.meyve_id \r\n"
					+ "JOIN kullanim_alanlari ON genel.genel_id  = kullanim_alanlari.kullanimalanlari_id\r\n"
					+ "JOIN kullanim_amaci ON genel.genel_id  = kullanim_amaci.kullanim_amaci_id \r\n"
					+ "JOIN yetisme_istegi ON genel.genel_id  = yetisme_istegi.yetisme_istegi_id\r\n"
					+ "JOIN diger_bilgiler ON genel.genel_id  = diger_bilgiler.diger_bilgiler_id ORDER BY genel.latince_ismi";
					
			try {
				
				sorguIfadesi = baglanti.prepareStatement(sql);
				getirilen = sorguIfadesi.executeQuery();
				
				while (getirilen.next()) {
					modellers.add(new Modeller(getirilen.getString("genel_id"),
							getirilen.getString("latince_ismi"),
							getirilen.getString("turkce_isimleri"),
							getirilen.getString("buyume_formu"),
							getirilen.getString("anavatani"),
							getirilen.getString("yetistigi_bolge"),
							getirilen.getString("ailesi"),
							getirilen.getString("notlar"),
							
							getirilen.getString("sekli"),
							getirilen.getString("boyu"),
							getirilen.getString("capi"),
							getirilen.getString("dokusu"),
							getirilen.getString("habitus_hakkinda_notlar"),
							
							getirilen.getString("cicek_durumu"),
							getirilen.getString("cicek_buyuklugu"),
							getirilen.getString("cicek_kokusu"),
							getirilen.getString("cicek_rengi"),
							getirilen.getString("ciceklenme_zamani"),
							getirilen.getString("cicek_hakkinda_notlar"),
							
							getirilen.getString("yaprak_dokme"),
							getirilen.getString("yaprak_tipi"),
							getirilen.getString("yaprak_sekli"),
							getirilen.getString("yaprak_buyuklugu"),
							getirilen.getString("yaprak_kokusu"),
							getirilen.getString("yaprak_dokusu"),
							getirilen.getString("yaprak_rengi"),
							getirilen.getString("yaprak_guz_rengi"),
							getirilen.getString("yaprak_hakkinda_notlar"),
							
							getirilen.getString("meyve_durumu"),
							getirilen.getString("meyve_tipi"),
							getirilen.getString("meyve_buyuklugu"),
							getirilen.getString("meyve_rengi"),
							getirilen.getString("meyve_yenilebilirligi"),
							getirilen.getString("meyve_zamani"),
							
							getirilen.getString("kirsal_kullanim_alanlari"),
							getirilen.getString("kentsel_kullanim_alanlari"),
							getirilen.getString("diger_kullanim_alanlari"),
							getirilen.getString("peyzaj_tarzi"),
							getirilen.getString("kullanima_iliskin_notlar"),
							
							getirilen.getString("muhendislik_islevleri"),
							getirilen.getString("mimarlik_islevleri"),
							getirilen.getString("ek_ozellikler"),
							
							getirilen.getString("gunisigi_istegi"),
							getirilen.getString("su_istegi"),
							getirilen.getString("besin_gereksinimi"),
							getirilen.getString("toprak_istegi"),
							getirilen.getString("toprak_drenaji"),
							
							getirilen.getString("buyume_hizi"),
							getirilen.getString("bakim_ihtiyaci"),
							getirilen.getString("zehirlilik"),
							getirilen.getString("uretimi")));
				}
				







				býtkýIDCol.setCellValueFactory(new PropertyValueFactory<>("id"));
				plantName.setCellValueFactory(new PropertyValueFactory<>("latinName"));
				
				tableView.setItems(modellers);
			} catch (SQLException e) {
				// TODO: handle exception
				System.out.println(e.getMessage().toString());
			}
		}

	
	
}
