package DatabaseQuery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Mysql.Util.DatabaseUtil;

import Modals.Cicek;
import Modals.DigerBilgiler;
import Modals.Genel;
import Modals.Habitus;
import Modals.KullanimAlanlari;
import Modals.KullanimAmaci;
import Modals.Meyve;
import Modals.Yaprak;
import Modals.YetismeIstegi;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class SelectQuery {

	
	//database baglanti
	Connection baglanti = null;
	PreparedStatement sorguIfadesi=null;
	ResultSet getirilen = null;
	String sql;
	String orderBy = " ORDER BY genel.latince_ismi ASC";

	
	public  SelectQuery() {
		baglanti = DatabaseUtil.baglan();
	}
	  
	public void getGenelValues(
			ObservableList<Genel> genels,
			
			TableView<Genel> genelTableView,
			
			TableColumn<Genel, Integer> genelIDCol,
			TableColumn<Genel, String> latinceNameCol,
			TableColumn<Genel, String> turkceIsimleriCol,
			TableColumn<Genel, String> buyumeFormuCol,
			TableColumn<Genel, String> anavataniCol,
			TableColumn<Genel, String> yetistigiBolgeCol,
			TableColumn<Genel, String> ailesiCol,
			TableColumn<Genel, String> genelNotlarCol
			
			)  {
		sql = "select * from genel ORDER BY latince_ismi";
		try {
			
			sorguIfadesi = baglanti.prepareStatement(sql);
			getirilen = sorguIfadesi.executeQuery();
			
			while (getirilen.next()) {
				genels.add(new Genel(getirilen.getInt("genel_id"),
						getirilen.getString("latince_ismi"),
						getirilen.getString("turkce_isimleri"),
						getirilen.getString("buyume_formu"),
						getirilen.getString("anavatani"),
						getirilen.getString("yetistigi_bolge"),
						getirilen.getString("ailesi"),
						getirilen.getString("notlar")));
			}    

		
			genelIDCol.setCellValueFactory(new PropertyValueFactory<>("id"));
			latinceNameCol.setCellValueFactory(new PropertyValueFactory<>("latinName"));
			turkceIsimleriCol.setCellValueFactory(new PropertyValueFactory<>("turkishName"));
			buyumeFormuCol.setCellValueFactory(new PropertyValueFactory<>("buyumeFormu"));
			anavataniCol.setCellValueFactory(new PropertyValueFactory<>("anavatani"));
			yetistigiBolgeCol.setCellValueFactory(new PropertyValueFactory<>("yetisitigiBolge"));
			ailesiCol.setCellValueFactory(new PropertyValueFactory<>("ailesi"));
			genelNotlarCol.setCellValueFactory(new PropertyValueFactory<>("notlar"));
			
			genelTableView.setItems(genels);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
		}
	}
	
	public void getHabitusValues(
			ObservableList<Habitus> habituss,
			
			TableView<Habitus> habitusTableView,
			
			TableColumn<Habitus, Integer> habitusIdCol,
			TableColumn<Habitus, String> habitusSekliCol,
			TableColumn<Habitus, String> habitusBoyuCol,
			TableColumn<Habitus, String> habitusCapiCol,
			TableColumn<Habitus, String> habitusDokusuCol,
			TableColumn<Habitus, String> habitusNotlarCol
			
			) {
		sql = "select * from habitus JOIN genel ON habitus.habitus_id = genel.genel_id ORDER BY genel.latince_ismi";
		try {
			
			sorguIfadesi = baglanti.prepareStatement(sql);
			getirilen = sorguIfadesi.executeQuery();
			
			while (getirilen.next()) {
				habituss.add(new Habitus(getirilen.getInt("habitus_id"),
						getirilen.getString("sekli"),
						getirilen.getString("boyu"),
						getirilen.getString("capi"),
						getirilen.getString("dokusu"),
						getirilen.getString("habitus_hakkinda_notlar")));
			}    

		
			habitusIdCol.setCellValueFactory(new PropertyValueFactory<>("id"));
			habitusSekliCol.setCellValueFactory(new PropertyValueFactory<>("sekli"));
			habitusBoyuCol.setCellValueFactory(new PropertyValueFactory<>("boyu"));
			habitusCapiCol.setCellValueFactory(new PropertyValueFactory<>("capi"));
			habitusDokusuCol.setCellValueFactory(new PropertyValueFactory<>("dokusu"));
			habitusNotlarCol.setCellValueFactory(new PropertyValueFactory<>("habitusNotlar"));
		
			
			habitusTableView.setItems(habituss);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
		}
	}
	
	public void getCicekValues(
			ObservableList<Cicek> ciceks,
			
			TableView<Cicek> cicekTableView,
			
			TableColumn<Cicek, Integer> cicekIdCol,
			TableColumn<Cicek, String> cicekDurumuCol,
			TableColumn<Cicek, String> cicekBuyukluguCol,
			TableColumn<Cicek, String> cicekKokusuCol,
			TableColumn<Cicek, String> cicekRengiCol,
			TableColumn<Cicek, String> ciceklenmeZamaniCol,
			TableColumn<Cicek, String> cicekNotlarCol

			) {
		sql = "select * from cicek JOIN genel ON cicek.cicek_id = genel.genel_id ORDER BY genel.latince_ismi";
		try {
			
			sorguIfadesi = baglanti.prepareStatement(sql);
			getirilen = sorguIfadesi.executeQuery();
			
			while (getirilen.next()) {
				ciceks.add(new Cicek(getirilen.getInt("cicek_id"),
						getirilen.getString("cicek_durumu"),
						getirilen.getString("cicek_buyuklugu"),
						getirilen.getString("cicek_kokusu"),
						getirilen.getString("cicek_rengi"),
						getirilen.getString("ciceklenme_zamani"),
						getirilen.getString("cicek_hakkinda_notlar")));
			}    

		 
			cicekIdCol.setCellValueFactory(new PropertyValueFactory<>("id"));
			cicekDurumuCol.setCellValueFactory(new PropertyValueFactory<>("cicekDurumu"));
			cicekBuyukluguCol.setCellValueFactory(new PropertyValueFactory<>("cicekBuyuklugu"));
			cicekKokusuCol.setCellValueFactory(new PropertyValueFactory<>("cicekKokusu"));
			cicekRengiCol.setCellValueFactory(new PropertyValueFactory<>("cicekRengi"));
			ciceklenmeZamaniCol.setCellValueFactory(new PropertyValueFactory<>("ciceklenmeZamani"));
			cicekNotlarCol.setCellValueFactory(new PropertyValueFactory<>("cicekNotlar"));

			
			cicekTableView.setItems(ciceks);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
		}
	}
	
	public void getYaprakValues(
			ObservableList<Yaprak> yapraks,
			
			TableView<Yaprak> yaprakTableView,
			
			TableColumn<Yaprak, Integer> yaprakIdCol,
			TableColumn<Yaprak, String> yaprakDokmeCol,
			TableColumn<Yaprak, String> yaprakTipiCol,
			TableColumn<Yaprak, String> yaprakSekliCol,
			TableColumn<Yaprak, String> yaprakBuyukluguCol,
			TableColumn<Yaprak, String> yaprakKokusuCol,
			TableColumn<Yaprak, String> yaprakDokusuCol,
			TableColumn<Yaprak, String> yaprakRengiCol,
			TableColumn<Yaprak, String> yaprakGuzRengiCol,
			TableColumn<Yaprak, String> yaprakNotlarCol
			
				) {
		
		sql = "select * from yaprak JOIN genel ON yaprak.yaprak_id = genel.genel_id ORDER BY genel.latince_ismi";
		try {
			
			sorguIfadesi = baglanti.prepareStatement(sql);
			getirilen = sorguIfadesi.executeQuery();
			
			while (getirilen.next()) {
				yapraks.add(new Yaprak(getirilen.getInt("yaprak_id"),
						getirilen.getString("yaprak_dokme"),
						getirilen.getString("yaprak_tipi"),
						getirilen.getString("yaprak_sekli"),
						getirilen.getString("yaprak_buyuklugu"),
						getirilen.getString("yaprak_kokusu"),
						getirilen.getString("yaprak_dokusu"),
						getirilen.getString("yaprak_rengi"),
						getirilen.getString("yaprak_guz_rengi"),
						getirilen.getString("yaprak_hakkinda_notlar")));
			}    
	 
		 
			yaprakIdCol.setCellValueFactory(new PropertyValueFactory<>("id"));
			yaprakDokmeCol.setCellValueFactory(new PropertyValueFactory<>("yaprakDokme"));
			yaprakTipiCol.setCellValueFactory(new PropertyValueFactory<>("yaprakTipi"));
			yaprakSekliCol.setCellValueFactory(new PropertyValueFactory<>("yaprakSekli"));
			yaprakBuyukluguCol.setCellValueFactory(new PropertyValueFactory<>("yaprakBuyuklugu"));
			yaprakKokusuCol.setCellValueFactory(new PropertyValueFactory<>("yaprakKokusu"));
			yaprakDokusuCol.setCellValueFactory(new PropertyValueFactory<>("yaprakDokusu"));
			yaprakRengiCol.setCellValueFactory(new PropertyValueFactory<>("yaprakRengi"));
			yaprakGuzRengiCol.setCellValueFactory(new PropertyValueFactory<>("yaprakGuzRengi"));
			yaprakNotlarCol.setCellValueFactory(new PropertyValueFactory<>("yaprakNotlar"));

			
			yaprakTableView.setItems(yapraks);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
		}
	}
	
	public void getMeyveValues(
			ObservableList<Meyve> meyves,
			
			TableView<Meyve> meyveTableView,
			
			TableColumn<Meyve, Integer> meyveId,
			TableColumn<Meyve, String> meyveDurumuCol,
			TableColumn<Meyve, String> meyveTipiCol,
			TableColumn<Meyve, String> meyveBuyukluguCol,
			TableColumn<Meyve, String> meyveRengiCol,
			TableColumn<Meyve, String> meyveYenilebilirligiCol,
			TableColumn<Meyve, String> meyveZamaniCol
) {
		sql = "select * from meyve JOIN genel ON meyve.meyve_id = genel.genel_id ORDER BY genel.latince_ismi";
		try {
			
			sorguIfadesi = baglanti.prepareStatement(sql);
			getirilen = sorguIfadesi.executeQuery();
			
			while (getirilen.next()) {
				meyves.add(new Meyve(getirilen.getInt("meyve_id"),
						getirilen.getString("meyve_durumu"),
						getirilen.getString("meyve_tipi"),
						getirilen.getString("meyve_buyuklugu"),
						getirilen.getString("meyve_rengi"),
						getirilen.getString("meyve_yenilebilirligi"),
						getirilen.getString("meyve_zamani")));
			}    
		

		 
			meyveId.setCellValueFactory(new PropertyValueFactory<>("id"));
			meyveDurumuCol.setCellValueFactory(new PropertyValueFactory<>("meyvedurumu"));
			meyveTipiCol.setCellValueFactory(new PropertyValueFactory<>("meyveTipi"));
			meyveBuyukluguCol.setCellValueFactory(new PropertyValueFactory<>("meyveBuyuklugu"));
			meyveRengiCol.setCellValueFactory(new PropertyValueFactory<>("meyveRengi"));
			meyveYenilebilirligiCol.setCellValueFactory(new PropertyValueFactory<>("meyveYenilebilirligi"));
			meyveZamaniCol.setCellValueFactory(new PropertyValueFactory<>("meyveZamani"));

			
			meyveTableView.setItems(meyves);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
		}
	}
	
	public void getKullanimAlanlariValues(
			ObservableList<KullanimAlanlari> kullanimAlanlaris,
			
			TableView<KullanimAlanlari> kullanimAlanlariTableView,
			
			TableColumn<KullanimAlanlari, Integer> kullanimAlanlariId,
			TableColumn<KullanimAlanlari, String> kirsalKullanimCol,
			TableColumn<KullanimAlanlari, String> kentselKullanimCol,
			TableColumn<KullanimAlanlari, String> digerBilgilerIDCol,
			TableColumn<KullanimAlanlari, String> peyzajTarziCol,
			TableColumn<KullanimAlanlari, String> kullanimNotlarCol) {
		
		sql = "select * from kullanim_alanlari INNER JOIN genel ON kullanim_alanlari.kullanimalanlari_id = genel.genel_id ORDER BY genel.latince_ismi";
		try {
			
			sorguIfadesi = baglanti.prepareStatement(sql);
			getirilen = sorguIfadesi.executeQuery();
			
			while (getirilen.next()) {
				kullanimAlanlaris.add(new KullanimAlanlari(getirilen.getInt("kullanimalanlari_id"),
						getirilen.getString("kirsal_kullanim_alanlari"),
						getirilen.getString("kentsel_kullanim_alanlari"),
						getirilen.getString("diger_kullanim_alanlari"),
						getirilen.getString("peyzaj_tarzi"),
						getirilen.getString("kullanima_iliskin_notlar")));
			}    
	
			kullanimAlanlariId.setCellValueFactory(new PropertyValueFactory<>("id"));
			kirsalKullanimCol.setCellValueFactory(new PropertyValueFactory<>("kirsalKullanimAlanlari"));
			kentselKullanimCol.setCellValueFactory(new PropertyValueFactory<>("kentselKullanimAlanlari"));
			digerBilgilerIDCol.setCellValueFactory(new PropertyValueFactory<>("digerKullanimAlanlari"));
			peyzajTarziCol.setCellValueFactory(new PropertyValueFactory<>("peyzajTarzi"));
			kullanimNotlarCol.setCellValueFactory(new PropertyValueFactory<>("KullanimAlanlariNotlar"));

			
			kullanimAlanlariTableView.setItems(kullanimAlanlaris);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
		}
	}
	
	public void getKullanimAmaciValues(
			ObservableList<KullanimAmaci> kullanimAmacis,
			
			TableView<KullanimAmaci> kullanimAmaciTableView,
			
			TableColumn<KullanimAmaci, Integer> kullanimAmaciIdCol,
			TableColumn<KullanimAmaci, String> muhendislikCol,
			TableColumn<KullanimAmaci, String> mimarlikCol,
			TableColumn<KullanimAmaci, String> ekOzelliklerCol) {
		sql = "select * from kullanim_amaci INNER JOIN genel ON kullanim_amaci.kullanim_amaci_id = genel.genel_id  ORDER BY genel.latince_ismi";
		try {
			
			sorguIfadesi = baglanti.prepareStatement(sql);
			getirilen = sorguIfadesi.executeQuery();
			
			while (getirilen.next()) {
				kullanimAmacis.add(new KullanimAmaci(getirilen.getInt("kullanim_amaci_id"),
						getirilen.getString("muhendislik_islevleri"),
						getirilen.getString("mimarlik_islevleri"),
						getirilen.getString("ek_ozellikler")));
			}    
	
			kullanimAmaciIdCol.setCellValueFactory(new PropertyValueFactory<>("id"));
			muhendislikCol.setCellValueFactory(new PropertyValueFactory<>("muhendislikIslevleri"));
			mimarlikCol.setCellValueFactory(new PropertyValueFactory<>("mimarlikIslevleri"));
			ekOzelliklerCol.setCellValueFactory(new PropertyValueFactory<>("ekOzellikler"));
	
			
			kullanimAmaciTableView.setItems(kullanimAmacis);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
		}
	}
	
	
	public void getYetismeIstegiValues(
			ObservableList<YetismeIstegi> yetismeIstegis,
			
			TableView<YetismeIstegi> yetismeIstegiTableView,
			
			TableColumn<YetismeIstegi, Integer> yetismeIstegiIdCol,
			TableColumn<YetismeIstegi, String> gunIsigiIstegiCol,
			TableColumn<YetismeIstegi, String> suIstegiCol,
			TableColumn<YetismeIstegi, String> besinGereksinimiCol,
			TableColumn<YetismeIstegi, String> toprakIstegiCol,
			TableColumn<YetismeIstegi, String> toprakDrenajiCol) {
		sql = "select * from yetisme_istegi INNER JOIN genel ON yetisme_istegi.yetisme_istegi_id = genel.genel_id ORDER BY genel.latince_ismi";
		try {
			
			sorguIfadesi = baglanti.prepareStatement(sql);
			getirilen = sorguIfadesi.executeQuery();
			
			while (getirilen.next()) {
				yetismeIstegis.add(new YetismeIstegi(getirilen.getInt("yetisme_istegi_id"),
						getirilen.getString("gunisigi_istegi"),
						getirilen.getString("su_istegi"),
						getirilen.getString("besin_gereksinimi"),
						getirilen.getString("toprak_istegi"),
						getirilen.getString("toprak_drenaji")
						
					));
			}    
	
			yetismeIstegiIdCol.setCellValueFactory(new PropertyValueFactory<>("id"));
			gunIsigiIstegiCol.setCellValueFactory(new PropertyValueFactory<>("gunIsigiIstegi"));
			suIstegiCol.setCellValueFactory(new PropertyValueFactory<>("suIstegi"));
			besinGereksinimiCol.setCellValueFactory(new PropertyValueFactory<>("besinGereksimi"));
			toprakIstegiCol.setCellValueFactory(new PropertyValueFactory<>("toprakIstegi"));
			toprakDrenajiCol.setCellValueFactory(new PropertyValueFactory<>("toprakDrenaji"));

			
			yetismeIstegiTableView.setItems(yetismeIstegis);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
		}
	}
	
	
	public void getDigerBilgilerValues(
			ObservableList<DigerBilgiler> digerBilgilers,
			
			TableView<DigerBilgiler> digerBilgilerTableView,
			
			TableColumn<DigerBilgiler, Integer> digerBilgilerIDCol,
			TableColumn<DigerBilgiler, String> buyumeHiziCol,
			TableColumn<DigerBilgiler, String> bakimIhtiyaciCol,
			TableColumn<DigerBilgiler, String> zehirlilikCol,
			TableColumn<DigerBilgiler, String> uretimiCol) {
		
		sql = "select * from diger_bilgiler INNER JOIN genel ON diger_bilgiler.diger_bilgiler_id = genel.genel_id ORDER BY genel.latince_ismi";
		try {
			
			sorguIfadesi = baglanti.prepareStatement(sql);
			getirilen = sorguIfadesi.executeQuery();
			
			while (getirilen.next()) {
				digerBilgilers.add(new DigerBilgiler(getirilen.getInt("diger_bilgiler_id"),
						getirilen.getString("buyume_hizi"),
						getirilen.getString("bakim_ihtiyaci"),
						getirilen.getString("zehirlilik"),
						getirilen.getString("uretimi")));
		
						
				
			}      
	
			digerBilgilerIDCol.setCellValueFactory(new PropertyValueFactory<>("id"));
			buyumeHiziCol.setCellValueFactory(new PropertyValueFactory<>("buyumeHizi"));
			bakimIhtiyaciCol.setCellValueFactory(new PropertyValueFactory<>("bakimIhtiyaci"));
			zehirlilikCol.setCellValueFactory(new PropertyValueFactory<>("zehirlilik"));
			uretimiCol.setCellValueFactory(new PropertyValueFactory<>("uretimi"));

			
			digerBilgilerTableView.setItems(digerBilgilers);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
		}
	}
}
