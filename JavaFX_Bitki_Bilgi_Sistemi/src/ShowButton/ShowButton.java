package ShowButton;

import java.awt.Label;

import Modals.Cicek;
import Modals.DigerBilgiler;
import Modals.Genel;
import Modals.Habitus;
import Modals.KullanimAlanlari;
import Modals.KullanimAmaci;
import Modals.Meyve;
import Modals.Modeller;
import Modals.Yaprak;
import Modals.YetismeIstegi;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ShowButton {




	


	public void showValuesLabel(TableView<Modeller> tableView_PlantName, javafx.scene.control.Label txt_latinName, javafx.scene.control.Label txt_turkce,
			javafx.scene.control.Label txt_buyume_formu, javafx.scene.control.Label txt_anavatani, javafx.scene.control.Label txt_yetistigi_bolge, javafx.scene.control.Label txt_ailesi,
			javafx.scene.control.Label txt_genel_notlar, javafx.scene.control.Label txt_plant_title,javafx.scene.control.Label txt_plant_ID, javafx.scene.control.Label txt_habitus_sekli,
			javafx.scene.control.Label txt_habitus_boyu, javafx.scene.control.Label txt_habitus_capi, javafx.scene.control.Label txt_habitus_dokusu,
			javafx.scene.control.Label txt_habitus_notlar, javafx.scene.control.Label txt_cicek_durumu, javafx.scene.control.Label txt_cicek_buyuklugu,
			javafx.scene.control.Label txt_cicek_kokusu, javafx.scene.control.Label txt_cicek_rengi, javafx.scene.control.Label txt_ciceklenme_vakti,
			javafx.scene.control.Label txt_cicek_notlar, javafx.scene.control.Label txt_yaprak_dokme, javafx.scene.control.Label txt_yaprak_tipi,
			javafx.scene.control.Label txt_yaprak_sekli, javafx.scene.control.Label txt_yaprak_buyuklugu, javafx.scene.control.Label txt_yaprak_kokusu,
			javafx.scene.control.Label txt_yaprak_dokusu, javafx.scene.control.Label txt_yaprak_rengi, javafx.scene.control.Label txt_yaprak_guz_rengi,
			javafx.scene.control.Label txt_yaprak_notlar, javafx.scene.control.Label txt_meyve_durumu, javafx.scene.control.Label txt_meyve_tipi,
			javafx.scene.control.Label txt_meyve_buyuklugu, javafx.scene.control.Label txt_meyve_rengi, javafx.scene.control.Label txt_meyve_yenilebilirligi,
			javafx.scene.control.Label txt_meyve_zamani, javafx.scene.control.Label txt_kirsal, javafx.scene.control.Label txt_kentsel, javafx.scene.control.Label txt_diger,
			javafx.scene.control.Label txt_peyzaj_tarzi, javafx.scene.control.Label txt_kullanima_iliskin_notlar, javafx.scene.control.Label txt_muhendislik,
			javafx.scene.control.Label txt_mimarlik, javafx.scene.control.Label txt_ek_ozellikler, javafx.scene.control.Label txt_gun_isigi_istegi,
			javafx.scene.control.Label txt_su_istegi, javafx.scene.control.Label txt_besin_gereksinimi, javafx.scene.control.Label txt_toprak_istegi,
			javafx.scene.control.Label txt_toprak_drenaji, javafx.scene.control.Label txt_buyume_hizi, javafx.scene.control.Label txt_bakim_ihtiyaci,
			javafx.scene.control.Label txt_zehirlilik, javafx.scene.control.Label txt_uretimi) {
			
		
		if (tableView_PlantName.getSelectionModel().getSelectedIndex() != -1) {
		
			Modeller modeller = new Modeller();
			modeller = (Modeller) tableView_PlantName.getItems().get(tableView_PlantName.getSelectionModel().getSelectedIndex());
			
			txt_latinName.setText(modeller.getLatinName());
			txt_turkce.setText(modeller.getTurkishName());
			txt_buyume_formu.setText(modeller.getBuyumeFormu());
			txt_anavatani.setText(modeller.getAnavatani());
			txt_yetistigi_bolge.setText(modeller.getYetisitigiBolge());
			txt_ailesi.setText(modeller.getAilesi());
			txt_genel_notlar.setText(modeller.getNotlar());
			
			//Plant Title
			txt_plant_title.setText(modeller.getLatinName());
			
			//Habitus Classi 
	
			txt_habitus_sekli.setText(modeller.getSekli());
			txt_habitus_boyu.setText(modeller.getBoyu());
			txt_habitus_capi.setText(modeller.getDokusu());
			txt_habitus_dokusu.setText(modeller.getDokusu());
			txt_habitus_notlar.setText(modeller.getHabitusNotlar());
			
			//Cicek
	
			txt_cicek_durumu.setText(modeller.getCicekDurumu());
			txt_cicek_buyuklugu.setText(modeller.getCicekBuyuklugu());
			txt_cicek_kokusu.setText(modeller.getCicekKokusu());
			txt_cicek_rengi.setText(modeller.getCicekRengi());
			txt_ciceklenme_vakti.setText(modeller.getCiceklenmeZamani());
			txt_cicek_notlar.setText(modeller.getCicekNotlar());

			
			//Yaprak
		
			txt_yaprak_dokme.setText(modeller.getYaprakDokme());
			txt_yaprak_tipi.setText(modeller.getYaprakTipi());
			txt_yaprak_sekli.setText(modeller.getYaprakSekli());
			txt_yaprak_buyuklugu.setText(modeller.getYaprakBuyuklugu());
			txt_yaprak_kokusu.setText(modeller.getYaprakKokusu());
			txt_yaprak_dokusu.setText(modeller.getYaprakDokusu());
			txt_yaprak_rengi.setText(modeller.getYaprakRengi());
			txt_yaprak_guz_rengi.setText(modeller.getYaprakGuzRengi());
			txt_yaprak_notlar.setText(modeller.getYaprakNotlar());
	
			
			//Meyve
		
			txt_meyve_durumu.setText(modeller.getMeyvedurumu());
			txt_meyve_tipi.setText(modeller.getMeyveTipi());
			txt_meyve_buyuklugu.setText(modeller.getMeyveBuyuklugu());
			txt_meyve_rengi.setText(modeller.getMeyveRengi());
			txt_meyve_yenilebilirligi.setText(modeller.getMeyveYenilebilirligi());
			txt_meyve_zamani.setText(modeller.getMeyveZamani());
	
			//Kulllanim Alanlari
		
			txt_kirsal.setText(modeller.getKirsalKullanimAlanlari());
			txt_kentsel.setText(modeller.getKentselKullanimAlanlari());
			txt_diger.setText(modeller.getDigerKullanimAlanlari());
			txt_peyzaj_tarzi.setText(modeller.getPeyzajTarzi());
			txt_kullanima_iliskin_notlar.setText(modeller.getKullanimAlanlariNotlar());
	
			//Kullanim Amaci
	
			txt_muhendislik.setText(modeller.getMuhendislikIslevleri());
			txt_mimarlik.setText(modeller.getMimarlikIslevleri());
			txt_ek_ozellikler.setText(modeller.getEkOzellikler());
	
			
			//Yetisme Istegi
		
			txt_gun_isigi_istegi.setText(modeller.getGunIsigiIstegi());
			txt_su_istegi.setText(modeller.getSuIstegi());
			txt_besin_gereksinimi.setText(modeller.getBesinGereksimi());
			txt_toprak_istegi.setText(modeller.getToprakIstegi());
			txt_toprak_drenaji.setText(modeller.getToprakDrenaji());
		
			//Diger bilgiler
			
			txt_buyume_hizi.setText(modeller.getBuyumeHizi());
			txt_bakim_ihtiyaci.setText(modeller.getBakimIhtiyaci());
			txt_zehirlilik.setText(modeller.getZehirlilik());
			txt_uretimi.setText(modeller.getUretimi());
	
		}
	}



	public void showValuesTextField(TableView<Modeller> tableView_PlantName, TextField txt_latinName, TextField txt_turkce,
			TextField txt_buyume_formu, TextField txt_anavatani, TextField txt_yetistigi_bolge, TextField txt_ailesi,
			TextField txt_genel_notlar, javafx.scene.control.Label txt_plant_title,javafx.scene.control.Label txt_plant_ID, TextField txt_habitus_sekli,
			TextField txt_habitus_boyu, TextField txt_habitus_capi, TextField txt_habitus_dokusu,
			TextField txt_habitus_notlar, TextField txt_cicek_durumu, TextField txt_cicek_buyuklugu,
			TextField txt_cicek_kokusu, TextField txt_cicek_rengi, TextField txt_ciceklenme_vakti,
			TextField txt_cicek_notlar, TextField txt_yaprak_dokme, TextField txt_yaprak_tipi,
			TextField txt_yaprak_sekli, TextField txt_yaprak_buyuklugu, TextField txt_yaprak_kokusu,
			TextField txt_yaprak_dokusu, TextField txt_yaprak_rengi, TextField txt_yaprak_guz_rengi,
			TextField txt_yaprak_notlar, TextField txt_meyve_durumu, TextField txt_meyve_tipi,
			TextField txt_meyve_buyuklugu, TextField txt_meyve_rengi, TextField txt_meyve_yenilebilirligi,
			TextField txt_meyve_zamani, TextField txt_kirsal, TextField txt_kentsel, TextField txt_diger,
			TextField txt_peyzaj_tarzi, TextField txt_kullanima_iliskin_notlar, TextField txt_muhendislik,
			TextField txt_mimarlik, TextField txt_ek_ozellikler, TextField txt_gun_isigi_istegi,
			TextField txt_su_istegi, TextField txt_besin_gereksinimi, TextField txt_toprak_istegi,
			TextField txt_toprak_drenaji, TextField txt_buyume_hizi, TextField txt_bakim_ihtiyaci,
			TextField txt_zehirlilik, TextField txt_uretimi) {
		
		
		if (tableView_PlantName.getSelectionModel().getSelectedIndex() != -1) {
		
			Modeller modeller = new Modeller();
			modeller = (Modeller) tableView_PlantName.getItems().get(tableView_PlantName.getSelectionModel().getSelectedIndex());
			
			txt_latinName.setText(modeller.getLatinName());
			txt_turkce.setText(modeller.getTurkishName());
			txt_buyume_formu.setText(modeller.getBuyumeFormu());
			txt_anavatani.setText(modeller.getAnavatani());
			txt_yetistigi_bolge.setText(modeller.getYetisitigiBolge());
			txt_ailesi.setText(modeller.getAilesi());
			txt_genel_notlar.setText(modeller.getNotlar());
			
			//Plant Title
			txt_plant_title.setText(modeller.getLatinName());
			//Plant Id
			txt_plant_ID.setText(modeller.getId());
			//Habitus Classi 
	
			txt_habitus_sekli.setText(modeller.getSekli());
			txt_habitus_boyu.setText(modeller.getBoyu());
			txt_habitus_capi.setText(modeller.getDokusu());
			txt_habitus_dokusu.setText(modeller.getDokusu());
			txt_habitus_notlar.setText(modeller.getHabitusNotlar());
			
			//Cicek
	
			txt_cicek_durumu.setText(modeller.getCicekDurumu());
			txt_cicek_buyuklugu.setText(modeller.getCicekBuyuklugu());
			txt_cicek_kokusu.setText(modeller.getCicekKokusu());
			txt_cicek_rengi.setText(modeller.getCicekRengi());
			txt_ciceklenme_vakti.setText(modeller.getCiceklenmeZamani());
			txt_cicek_notlar.setText(modeller.getCicekNotlar());

			
			//Yaprak
		
			txt_yaprak_dokme.setText(modeller.getYaprakDokme());
			txt_yaprak_tipi.setText(modeller.getYaprakTipi());
			txt_yaprak_sekli.setText(modeller.getYaprakSekli());
			txt_yaprak_buyuklugu.setText(modeller.getYaprakBuyuklugu());
			txt_yaprak_kokusu.setText(modeller.getYaprakKokusu());
			txt_yaprak_dokusu.setText(modeller.getYaprakDokusu());
			txt_yaprak_rengi.setText(modeller.getYaprakRengi());
			txt_yaprak_guz_rengi.setText(modeller.getYaprakGuzRengi());
			txt_yaprak_notlar.setText(modeller.getYaprakNotlar());
	
			
			//Meyve
		
			txt_meyve_durumu.setText(modeller.getMeyvedurumu());
			txt_meyve_tipi.setText(modeller.getMeyveTipi());
			txt_meyve_buyuklugu.setText(modeller.getMeyveBuyuklugu());
			txt_meyve_rengi.setText(modeller.getMeyveRengi());
			txt_meyve_yenilebilirligi.setText(modeller.getMeyveYenilebilirligi());
			txt_meyve_zamani.setText(modeller.getMeyveZamani());
	
			//Kulllanim Alanlari
		
			txt_kirsal.setText(modeller.getKirsalKullanimAlanlari());
			txt_kentsel.setText(modeller.getKentselKullanimAlanlari());
			txt_diger.setText(modeller.getDigerKullanimAlanlari());
			txt_peyzaj_tarzi.setText(modeller.getPeyzajTarzi());
			txt_kullanima_iliskin_notlar.setText(modeller.getKullanimAlanlariNotlar());
	
			//Kullanim Amaci
	
			txt_muhendislik.setText(modeller.getMuhendislikIslevleri());
			txt_mimarlik.setText(modeller.getMimarlikIslevleri());
			txt_ek_ozellikler.setText(modeller.getEkOzellikler());
	
			
			//Yetisme Istegi
		
			txt_gun_isigi_istegi.setText(modeller.getGunIsigiIstegi());
			txt_su_istegi.setText(modeller.getSuIstegi());
			txt_besin_gereksinimi.setText(modeller.getBesinGereksimi());
			txt_toprak_istegi.setText(modeller.getToprakIstegi());
			txt_toprak_drenaji.setText(modeller.getToprakDrenaji());
		
			//Diger bilgiler
			
			txt_buyume_hizi.setText(modeller.getBuyumeHizi());
			txt_bakim_ihtiyaci.setText(modeller.getBakimIhtiyaci());
			txt_zehirlilik.setText(modeller.getZehirlilik());
			txt_uretimi.setText(modeller.getUretimi());
	
		}
}
	public void setText() {
		
	}



	
}
