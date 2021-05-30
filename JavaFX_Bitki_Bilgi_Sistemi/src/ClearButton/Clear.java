package ClearButton;

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
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Clear {

	
	
	
	public void obserVableClear(
			ObservableList<Modeller> modellers,
			ObservableList<Genel> genels,
			ObservableList<Habitus> habituss,
			ObservableList<Cicek> ciceks,
			ObservableList<Yaprak> yapraks,
			ObservableList<Meyve> meyves,
			ObservableList<KullanimAlanlari> kullanimAlanlaris,
			ObservableList<KullanimAmaci> kullanimAmacis,
			ObservableList<YetismeIstegi> yetismeIstegis,
			ObservableList<DigerBilgiler> digerBilgilers
			) {
		modellers.clear();
    	genels.clear();
    	habituss.clear();
    	ciceks.clear();
    	yapraks.clear();
    	meyves.clear();
    	kullanimAlanlaris.clear();
    	kullanimAmacis.clear();
    	yetismeIstegis.clear();
    	digerBilgilers.clear();
		
	}
	
	
	
	
	public void txtClear(TextField txt_latinName, TextField txt_turkce,
			TextField txt_buyume_formu, TextField txt_anavatani, TextField txt_yetistigi_bolge, TextField txt_ailesi,
			TextField txt_genel_notlar, javafx.scene.control.Label txt_plant_title,javafx.scene.control.Label txt_plant_ID,TextField txt_ID, TextField txt_habitus_sekli,
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

    	txt_ID.clear();
    	
    	txt_latinName.clear();
		txt_turkce.clear();
		txt_buyume_formu.clear();
		txt_anavatani.clear();
		txt_yetistigi_bolge.clear();
		txt_ailesi.clear();
		txt_genel_notlar.clear();
		
		//Plant Title
		txt_plant_title.setText("Bitki Adi");
		//Plant Id
		txt_plant_ID.setText("Bitki ID");
	
		//Habitus Classi 
		//habitus =(Habitus) habitusId.getItems().get(genel);
		txt_habitus_sekli.clear();
		txt_habitus_boyu.clear();
		txt_habitus_capi.clear();
		txt_habitus_dokusu.clear();
		txt_habitus_notlar.clear();
		
		//Cicek
		//cicek =(Cicek) tableView_PlantName.getItems();
		txt_cicek_durumu.clear();
		txt_cicek_buyuklugu.clear();
		txt_cicek_kokusu.clear();
		txt_cicek_rengi.clear();
		txt_ciceklenme_vakti.clear();
		
		
		//Yaprak
		//yaprak = (Yaprak) tableView_PlantName.getItems();
		txt_yaprak_dokme.clear();
		txt_yaprak_tipi.clear();
		txt_yaprak_sekli.clear();
		txt_yaprak_buyuklugu.clear();
		txt_yaprak_kokusu.clear();
		txt_yaprak_dokusu.clear();
		txt_yaprak_rengi.clear();
		txt_yaprak_guz_rengi.clear();
		txt_yaprak_notlar.clear();

		
		//Meyve
		//meyve = (Meyve) tableView_PlantName.getItems();
		txt_meyve_durumu.clear();
		txt_meyve_tipi.clear();
		txt_meyve_buyuklugu.clear();
		txt_meyve_rengi.clear();
		txt_meyve_yenilebilirligi.clear();
		txt_meyve_zamani.clear();

		//Kulllanim Alanlari
		//kullanimAlanlari = (KullanimAlanlari) tableView_PlantName.getItems();
		txt_kirsal.clear();
		txt_kentsel.clear();
		txt_diger.clear();
		txt_peyzaj_tarzi.clear();
		txt_kullanima_iliskin_notlar.clear();

		//Kullanim Amaci
		//kullanimAmaci = (KullanimAmaci) tableView_PlantName.getItems();
		txt_muhendislik.clear();
		txt_mimarlik.clear();
		txt_ek_ozellikler.clear();

		
		//Yetisme Istegi
		//yetismeIstegi = (YetismeIstegi) tableView_PlantName.getItems();
		txt_gun_isigi_istegi.clear();
		txt_su_istegi.clear();
		txt_besin_gereksinimi.clear();
		txt_toprak_istegi.clear();
		txt_toprak_drenaji.clear();
	
		//Diger bilgiler
		//digerBilgiler = (DigerBilgiler) tableView_PlantName.getItems();
		txt_buyume_hizi.clear();
		txt_bakim_ihtiyaci.clear();
		txt_zehirlilik.clear();
		txt_uretimi.clear();
		
	}
}
