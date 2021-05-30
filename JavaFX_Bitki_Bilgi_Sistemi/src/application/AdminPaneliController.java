package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Observable;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.scene.input.MouseEvent;
import javax.management.StringValueExp;
import javax.sound.midi.Soundbank;

import com.Mysql.Util.DatabaseUtil;
import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;

import ClearButton.Clear;
import DatabaseControl.IdGetControl;
import DatabaseQuery.DeleteQuery;
import DatabaseQuery.InsertQuery;
import DatabaseQuery.MysqlQuery;
import DatabaseQuery.SelectQuery;
import DatabaseQuery.UpdateQuery;
import Filtered.MysqlFiltered;
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
import ShowButton.ShowButton;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.css.converter.StringConverter;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class AdminPaneliController{

	
	
	
		//database baglanti
		Connection baglanti = null;
		PreparedStatement sorguIfadesi=null;
		ResultSet getirilen = null;
		String sql;
	public  AdminPaneliController() {
			baglanti = DatabaseUtil.baglan();
		}
		  
	
	ObservableList<Genel> genels = FXCollections.observableArrayList();
	ObservableList<Habitus> habituss = FXCollections.observableArrayList();
	ObservableList<Cicek> ciceks = FXCollections.observableArrayList();
	ObservableList<Yaprak> yapraks = FXCollections.observableArrayList();
	ObservableList<Meyve> meyves = FXCollections.observableArrayList();
	ObservableList<KullanimAlanlari> kullanimAlanlaris = FXCollections.observableArrayList();
	ObservableList<KullanimAmaci> kullanimAmacis = FXCollections.observableArrayList();
	ObservableList<YetismeIstegi> yetismeIstegis = FXCollections.observableArrayList();
	ObservableList<DigerBilgiler> digerBilgilers = FXCollections.observableArrayList();
	
	ObservableList<Modeller> modellers = FXCollections.observableArrayList();
	
	Clear clear= new Clear();
	IdGetControl idGetControl= new IdGetControl();
	
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txt_field_bitki_search;

    @FXML
    private Button btn_plantShow;

    @FXML
    private TableView<Modeller> tableView_PlantName;

    @FXML
    private TableColumn<Modeller, Integer> býtkýIDCol;

    @FXML
    private TableColumn<Modeller, String> plantName;

    @FXML
    private Label txt_plant_title;
    
 
    
    @FXML
    private ImageView btn_back;

    @FXML
    private ImageView btn_refresh;
    
    @FXML
    private Label txt_plant_ID;
    
    @FXML
    private TextField txt_ID;
   
 
   
    @FXML
    private Button btn_insert;

    @FXML
    private Button btn_update;

    @FXML
    private Button btn_delete;

    @FXML
    private Button btn_clear;

    @FXML
    private TextField txt_latinName;

    @FXML
    private TextField txt_turkce;

    @FXML
    private TextField txt_buyume_formu;

    @FXML
    private TextField txt_anavatani;

    @FXML
    private TextField txt_yetistigi_bolge;

    @FXML
    private TextField txt_ailesi;

    @FXML
    private TextField txt_genel_notlar;

    @FXML
    private TableView<Genel> genelTableView;

    @FXML
    private TableColumn<Genel, Integer> genelIDCol;

    @FXML
    private TableColumn<Genel, String> latinceNameCol;

    @FXML
    private TableColumn<Genel, String> turkceIsimleriCol;

    @FXML
    private TableColumn<Genel, String> buyumeFormuCol;

    @FXML
    private TableColumn<Genel, String> anavataniCol;

    @FXML
    private TableColumn<Genel, String> ailesiCol;
    
    @FXML
    private TableColumn<Genel, String> yetistigiBolgeCol;

    @FXML
    private TableColumn<Genel, String> genelNotlarCol;

    @FXML
    private TextField txt_habitus_sekli;

    @FXML
    private TextField txt_habitus_boyu;

    @FXML
    private TextField txt_habitus_capi;

    @FXML
    private TextField txt_habitus_dokusu;

    @FXML
    private TextField txt_habitus_notlar;

    @FXML
    private TableView<Habitus> habitusTableView;

    @FXML
    private TableColumn<Habitus, Integer> habitusIdCol;

    @FXML
    private TableColumn<Habitus, String> habitusSekliCol;

    @FXML
    private TableColumn<Habitus, String> habitusBoyuCol;

    @FXML
    private TableColumn<Habitus, String> habitusCapiCol;

    @FXML
    private TableColumn<Habitus, String> habitusDokusuCol;

    @FXML
    private TableColumn<Habitus, String> habitusNotlarCol;

    @FXML
    private TextField txt_cicek_durumu;

    @FXML
    private TextField txt_cicek_buyuklugu;

    @FXML
    private TextField txt_cicek_kokusu;

    @FXML
    private TextField txt_cicek_rengi;

    @FXML
    private TextField txt_ciceklenme_vakti;
    
    @FXML
    private TextField txt_cicek_notlar;
    
    @FXML
    private TableView<Cicek> cicekTableView;

    @FXML
    private TableColumn<Cicek, Integer> cicekIdCol;

    @FXML
    private TableColumn<Cicek, String> cicekDurumuCol;

    @FXML
    private TableColumn<Cicek, String> cicekBuyukluguCol;

    @FXML
    private TableColumn<Cicek, String> cicekKokusuCol;

    @FXML
    private TableColumn<Cicek, String> cicekRengiCol;

    @FXML
    private TableColumn<Cicek, String> ciceklenmeZamaniCol;

    @FXML
    private TableColumn<Cicek, String> cicekNotlarCol;

    @FXML
    private TextField txt_yaprak_dokme;

    @FXML
    private TextField txt_yaprak_tipi;

    @FXML
    private TextField txt_yaprak_sekli;

    @FXML
    private TextField txt_yaprak_buyuklugu;

    @FXML
    private TextField txt_yaprak_kokusu;

    @FXML
    private TextField txt_yaprak_dokusu;

    @FXML
    private TextField txt_yaprak_rengi;

    @FXML
    private TextField txt_yaprak_guz_rengi;

    @FXML
    private TextField txt_yaprak_notlar;

    @FXML
    private TableView<Yaprak> yaprakTableView;

    @FXML
    private TableColumn<Yaprak, Integer> yaprakIdCol;

    @FXML
    private TableColumn<Yaprak, String> yaprakDokmeCol;

    @FXML
    private TableColumn<Yaprak, String> yaprakTipiCol;

    @FXML
    private TableColumn<Yaprak, String> yaprakSekliCol;

    @FXML
    private TableColumn<Yaprak, String> yaprakBuyukluguCol;

    @FXML
    private TableColumn<Yaprak, String> yaprakKokusuCol;

    @FXML
    private TableColumn<Yaprak, String> yaprakDokusuCol;

    @FXML
    private TableColumn<Yaprak, String> yaprakRengiCol;

    @FXML
    private TableColumn<Yaprak, String> yaprakGuzRengiCol;

    @FXML
    private TableColumn<Yaprak, String> yaprakNotlarCol;

    @FXML
    private TextField txt_meyve_durumu;

    @FXML
    private TextField txt_meyve_tipi;

    @FXML
    private TextField txt_meyve_buyuklugu;

    @FXML
    private TextField txt_meyve_rengi;

    @FXML
    private TextField txt_meyve_yenilebilirligi;

    @FXML
    private TextField txt_meyve_zamani;

    @FXML
    private TableView<Meyve> meyveTableView;

    @FXML
    private TableColumn<Meyve, Integer> meyveId;

    @FXML
    private TableColumn<Meyve, String> meyveDurumuCol;

    @FXML
    private TableColumn<Meyve, String> meyveTipiCol;

    @FXML
    private TableColumn<Meyve, String> meyveBuyukluguCol;

    @FXML
    private TableColumn<Meyve, String> meyveRengiCol;

    @FXML
    private TableColumn<Meyve, String> meyveYenilebilirligiCol;

    @FXML
    private TableColumn<Meyve, String> meyveZamaniCol;

   
    @FXML
    private TextField txt_kirsal;

    @FXML
    private TextField txt_kentsel;

    @FXML
    private TextField txt_diger;

    @FXML
    private TextField txt_peyzaj_tarzi;

    @FXML
    private TextField txt_kullanima_iliskin_notlar;
    
    @FXML
    private TableView<KullanimAlanlari> kullanimAlanlariTableView;
    @FXML
    private TableColumn<KullanimAlanlari, Integer> kullanimAlanlariId;

    @FXML
    private TableColumn<KullanimAlanlari, String> kirsalKullanimCol;

    @FXML
    private TableColumn<KullanimAlanlari, String> kentselKullanimCol;

    @FXML
    private TableColumn<KullanimAlanlari, String> digerKullanimCol;

    @FXML
    private TableColumn<KullanimAlanlari, String> peyzajTarziCol;

    @FXML
    private TableColumn<KullanimAlanlari, String> kullanimNotlarCol;

    @FXML
    private TextField txt_muhendislik;

    @FXML
    private TextField txt_mimarlik;

    @FXML
    private TextField txt_ek_ozellikler;

    @FXML
    private TableView<KullanimAmaci> kullanimAmaciTableView;

    @FXML
    private TableColumn<KullanimAmaci, Integer> kullanimAmaciIdCol;

    @FXML
    private TableColumn<KullanimAmaci, String> muhendislikCol;

    @FXML
    private TableColumn<KullanimAmaci, String> mimarlikCol;

    @FXML
    private TableColumn<KullanimAmaci, String> ekOzelliklerCol;

    @FXML
    private TextField txt_gun_isigi_istegi;

    @FXML
    private TextField txt_su_istegi;

    @FXML
    private TextField txt_besin_gereksinimi;

    @FXML
    private TextField txt_toprak_istegi;

    @FXML
    private TextField txt_toprak_drenaji;

    @FXML
    private TableView<YetismeIstegi> yetismeIstegiTableView;

    @FXML
    private TableColumn<YetismeIstegi, Integer> yetismeIstegiIdCol;

    @FXML
    private TableColumn<YetismeIstegi, String> gunIsigiIstegiCol;

    @FXML
    private TableColumn<YetismeIstegi, String> suIstegiCol;

    @FXML
    private TableColumn<YetismeIstegi, String> besinGereksinimiCol;

    @FXML
    private TableColumn<YetismeIstegi, String> toprakIstegiCol;

    @FXML
    private TableColumn<YetismeIstegi, String> toprakDrenajiCol;

    @FXML
    private TextField txt_buyume_hizi;

    @FXML
    private TextField txt_bakim_ihtiyaci;

    @FXML
    private TextField txt_zehirlilik;

    @FXML
    private TextField txt_uretimi;

    @FXML
    private TableView<DigerBilgiler> digerBilgilerTableView;

    @FXML
    private TableColumn<DigerBilgiler, Integer> digerBilgilerIDCol;

    @FXML
    private TableColumn<DigerBilgiler, String> buyumeHiziCol;

    @FXML
    private TableColumn<DigerBilgiler, String> bakimIhtiyaciCol;

    @FXML
    private TableColumn<DigerBilgiler, String> zehirlilikCol;

    @FXML
    private TableColumn<DigerBilgiler, String> uretimiCol;

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
    void btn_clearClick(ActionEvent event) {
    	
    	
    	clear.txtClear(txt_latinName, txt_turkce, txt_buyume_formu, txt_anavatani, txt_yetistigi_bolge, txt_ailesi, txt_genel_notlar, txt_plant_title, txt_plant_ID, txt_ID, txt_habitus_sekli, txt_habitus_boyu, txt_habitus_capi, txt_habitus_dokusu, txt_habitus_notlar, txt_cicek_durumu, txt_cicek_buyuklugu, txt_cicek_kokusu, txt_cicek_rengi, txt_ciceklenme_vakti, txt_cicek_notlar, txt_yaprak_dokme, txt_yaprak_tipi, txt_yaprak_sekli, txt_yaprak_buyuklugu, txt_yaprak_kokusu, txt_yaprak_dokusu, txt_yaprak_rengi, txt_yaprak_guz_rengi, txt_yaprak_notlar, txt_meyve_durumu, txt_meyve_tipi, txt_meyve_buyuklugu, txt_meyve_rengi, txt_meyve_yenilebilirligi, txt_meyve_zamani, txt_kirsal, txt_kentsel, txt_diger, txt_peyzaj_tarzi, txt_kullanima_iliskin_notlar, txt_muhendislik, txt_mimarlik, txt_ek_ozellikler, txt_gun_isigi_istegi, txt_su_istegi, txt_besin_gereksinimi, txt_toprak_istegi, txt_toprak_drenaji, txt_buyume_hizi, txt_bakim_ihtiyaci, txt_zehirlilik, txt_uretimi);
    	
    }
    
    
    @FXML
    void btn_deleteClick(ActionEvent event) {

    	
    	
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Bitki Bilgi Sistemi");//baslik
		alert.setHeaderText("Bitki Silme Islemi Yapiliyor !! Bitkiyi Silmek Isteginize emin misiniz ?");
		alert.setContentText(" Bu iþlem geri döndürülemez !! Onaylýyor musunuz?");
		ButtonType btn2 = new ButtonType("Iptal" , ButtonData.CANCEL_CLOSE);
		ButtonType btn1 = new ButtonType("Tamam" , ButtonData.OK_DONE);
		alert.getButtonTypes().setAll(btn1, btn2);
		Optional<ButtonType> sonuc = alert.showAndWait();
		
		
		
		
		if(sonuc.get()==btn1) {
			if (txt_ID.getText() != null && !txt_ID.getText().isEmpty() ) {
			
				if (idGetControl.idControl(txt_ID)) {
					
				
				DeleteQuery dQuery = new DeleteQuery(txt_ID);
				
			 	dQuery.genelDelete();
		    	dQuery.habitusDelete();
		    	dQuery.cicekDelete();
		    	dQuery.yaprakDelete();
		    	dQuery.meyveDelete();
		    	dQuery.kullanimAlanlariDelete();
		    	dQuery.kullanimAmaciDelete();
		    	dQuery.digerBilgilerDelete();
		    	dQuery.yetismeIstegiDelete();
		    
		    	
		    	clear.obserVableClear(modellers, genels, habituss, ciceks, yapraks, meyves, kullanimAlanlaris, kullanimAmacis, yetismeIstegis, digerBilgilers);
		    	
		    	
		   
		    	initialize();
		    	
		    	
		    	Alert alert1 = new Alert(AlertType.INFORMATION);
				alert1.setTitle("Bitki Veri tabanindan silindi.");
				alert1.setHeaderText(txt_ID.getText()+" ID' li olan bitkiyi sildiniz .");
				alert1.setContentText("");
				alert1.showAndWait();
		    	
				}else {
					Alert alert1 = new Alert(AlertType.ERROR);
					alert1.setTitle("ID Hatali");
					alert1.setHeaderText("Boyle bir ID veri tabaninda bulunmuyor. !!");
					alert1.setContentText("Boyle bir ID bulunamadigindan silme islemi yapilamadi. !");
					alert1.showAndWait();
				}
		    	
			}
			else {
				Alert alert1 = new Alert(AlertType.ERROR);
				alert1.setTitle("Bitki Bilgi Sistemi");

				alert1.setHeaderText("ID yi girmediniz");

				alert1.setContentText("ID girmediginiz icin kayit silme yapilamadi !");
				alert1.showAndWait();
				
			}}
		else if(sonuc.get()==btn2)
			alert.close();
		
    }

    
    
    
    @FXML
    void btn_insertClick(ActionEvent event) {
    	

		

		Alert alert = new Alert(AlertType.INFORMATION);//WARNING iconu 
		alert.setTitle("Bitki Bilgi Sistemi");//baslik
		alert.setHeaderText("Bitki Kayit Islemi Yapiliyor");//genel bilgi
		alert.setContentText("Girdiðiniz bilgiler veri tabanýna kayýt edilecektir onaylýyor musunuz ?");//icerik mesajini yaziyoruz
		ButtonType btn2 = new ButtonType("Iptal" , ButtonData.CANCEL_CLOSE);
		ButtonType btn1 = new ButtonType("Tamam" , ButtonData.OK_DONE);
		alert.getButtonTypes().setAll(btn1, btn2);
		Optional<ButtonType> sonuc = alert.showAndWait();
		
		
		
		if(sonuc.get()==btn1) {
			if (txt_ID.getText() != null && !txt_ID.getText().isEmpty() ) {
				
				if (!idGetControl.idControl(txt_ID)) {
					
				InsertQuery iQuery = new InsertQuery(txt_ID);
				
				iQuery.genelInsert( txt_latinName, txt_turkce, txt_buyume_formu, txt_anavatani, txt_yetistigi_bolge, txt_ailesi, txt_genel_notlar);
		    	iQuery.habitusInsert( txt_habitus_sekli, txt_habitus_boyu, txt_habitus_capi, txt_habitus_dokusu, txt_habitus_notlar);
		    	iQuery.cicekInsert(txt_cicek_durumu, txt_cicek_buyuklugu, txt_cicek_kokusu, txt_cicek_rengi, txt_ciceklenme_vakti, txt_cicek_notlar);
		    	iQuery.yaprakInsert(txt_yaprak_dokme, txt_yaprak_tipi, txt_yaprak_sekli, txt_yaprak_buyuklugu, txt_yaprak_kokusu, txt_yaprak_dokusu, txt_yaprak_rengi, txt_yaprak_guz_rengi, txt_yaprak_notlar);
		    	iQuery.meyveInsert(txt_meyve_durumu, txt_meyve_tipi, txt_meyve_buyuklugu, txt_meyve_rengi, txt_meyve_yenilebilirligi, txt_meyve_zamani);
		    	iQuery.kullanimAlanlariInsert( txt_kirsal, txt_kentsel, txt_diger, txt_peyzaj_tarzi, txt_kullanima_iliskin_notlar);
		    	iQuery.kullanimAmaciInsert(txt_muhendislik, txt_mimarlik, txt_ek_ozellikler);
		    	iQuery.yetismeIstegiInsert(txt_gun_isigi_istegi, txt_su_istegi, txt_besin_gereksinimi, txt_toprak_istegi, txt_toprak_drenaji);
		    	iQuery.digerBilgilerInsert(txt_buyume_hizi, txt_bakim_ihtiyaci, txt_zehirlilik, txt_uretimi);
		    	
		    	
		    	clear.obserVableClear(modellers, genels, habituss, ciceks, yapraks, meyves, kullanimAlanlaris, kullanimAmacis, yetismeIstegis, digerBilgilers);

		    	initialize();
		    	
		    	Alert alert1 = new Alert(AlertType.INFORMATION);
				alert1.setTitle("Bitki Veri Tabanina Kayit Edildi");
				alert1.setHeaderText(txt_ID.getText()+" ID' li olan bitkiyi Kayit Ettiniz .");
				alert1.setContentText("");
				alert1.showAndWait();
		    	
				}else {
					Alert alert1 = new Alert(AlertType.ERROR);

					alert1.setTitle("ID Hatali");

					alert1.setHeaderText("Boyle bir ID zaten veri tabaninda Var !!");

					alert1.setContentText("Var olan bir bitkinin ID' sini girdiginizden kayit islemi yapilamadi. !");
					alert1.showAndWait();
				}
		    	
			}
			else {
				Alert alert1 = new Alert(AlertType.ERROR);//WARNING iconu 
				alert1.setTitle("Bitki Bilgi Sistemi");//baslik
				alert1.setHeaderText("ID yi girmediniz");//genel bilgi
				alert1.setContentText("ID girmediginiz icin kayit islemi yapilamadi !");//icerik mesajini yaziyoruz
				alert1.showAndWait();
				
				
			}}
		else if(sonuc.get()==btn2)
			alert.close(); 	
    }
    
   
    
   
    
    @FXML
    void btn_updateClick(ActionEvent event) {
    	
    	
    	 
    	 
    	Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Bitki Bilgi Sistemi");
		alert.setHeaderText("Bitki Guncelleme Islemi Yapiliyor");
		alert.setContentText("Girdiðiniz bilgiler veri tabanýna kayýt edilecektir onaylýyor musunuz ?");
		ButtonType btn2 = new ButtonType("Iptal" , ButtonData.CANCEL_CLOSE);
		ButtonType btn1 = new ButtonType("Tamam" , ButtonData.OK_DONE);
		alert.getButtonTypes().setAll(btn1, btn2);
		Optional<ButtonType> sonuc = alert.showAndWait();
		
		
		
		if(sonuc.get()==btn1) {
			if (txt_ID.getText() != null && !txt_ID.getText().isEmpty() ) {
				
				if (idGetControl.idControl(txt_ID)) {
					UpdateQuery updateQuery=new UpdateQuery();
			    	 
						
					  	updateQuery.genelUpdate(txt_ID, txt_latinName, txt_turkce, txt_buyume_formu, txt_anavatani, txt_yetistigi_bolge, txt_ailesi, txt_genel_notlar);;
					  	updateQuery.habitusUpdate(txt_ID, txt_habitus_sekli, txt_habitus_boyu, txt_habitus_capi, txt_habitus_dokusu, txt_habitus_notlar);
				    	updateQuery.cicekUpdate(txt_ID, txt_cicek_durumu, txt_cicek_buyuklugu, txt_cicek_kokusu, txt_cicek_rengi, txt_ciceklenme_vakti, txt_cicek_notlar);
				    	updateQuery.yaprakUpdate(txt_ID, txt_yaprak_dokme, txt_yaprak_tipi, txt_yaprak_sekli, txt_yaprak_buyuklugu, txt_yaprak_kokusu, txt_yaprak_dokusu, txt_yaprak_rengi, txt_yaprak_guz_rengi, txt_yaprak_notlar);
				    	updateQuery.meyveUpdate(txt_ID, txt_meyve_durumu, txt_meyve_tipi, txt_meyve_buyuklugu, txt_meyve_rengi, txt_meyve_yenilebilirligi, txt_meyve_zamani);
				    	updateQuery.kullanimAlanlariUpdate(txt_ID, txt_kirsal, txt_kentsel, txt_diger, txt_peyzaj_tarzi, txt_kullanima_iliskin_notlar);
				    	updateQuery.kullanimAmaciUpdate(txt_ID, txt_muhendislik, txt_mimarlik, txt_ek_ozellikler);
				    	updateQuery.yetismeIstegiUpdate(txt_ID, txt_gun_isigi_istegi, txt_su_istegi, txt_besin_gereksinimi, txt_toprak_istegi, txt_toprak_drenaji);
				    	updateQuery.digerBilgilerUpdate(txt_ID, txt_buyume_hizi, txt_bakim_ihtiyaci, txt_zehirlilik, txt_uretimi);
				    	
				    	
				    	clear.obserVableClear(modellers, genels, habituss, ciceks, yapraks, meyves, kullanimAlanlaris, kullanimAmacis, yetismeIstegis, digerBilgilers);

				    	initialize();
				    	
				    	Alert alert1 = new Alert(AlertType.INFORMATION);

						alert1.setTitle("Guncellendi");

						alert1.setHeaderText(txt_ID.getText()+" ID' li olan bitkiyi guncellediniz.");

						alert1.setContentText("");
						alert1.showAndWait();
				}
				else {
					Alert alert1 = new Alert(AlertType.ERROR);

					alert1.setTitle("ID Hatali");

					alert1.setHeaderText("Boyle bir ID bulunamadi !!");

					alert1.setContentText("ID Yanlis Girildigi Icin Guncelleme islemi yapilamadi !");
					alert1.showAndWait();
				}
				
		    	
		    	
		    	
			}
			else {
				Alert alert1 = new Alert(AlertType.ERROR);

				alert1.setTitle("Bitki Bilgi Sistemi");

				alert1.setHeaderText("ID yi girmediniz");

				alert1.setContentText("ID girmediginiz icin kayit islemi yapilamadi !");
				alert1.showAndWait();
				
				
			}}
		else if(sonuc.get()==btn2)
			alert.close();
  
    	
    }
    @FXML
    void btn_plantShowClick(ActionEvent event) {
    	 ShowButton showButton = new ShowButton();
    	 showButton.showValuesTextField(tableView_PlantName, txt_latinName, txt_turkce, txt_buyume_formu, txt_anavatani, txt_yetistigi_bolge, txt_ailesi, txt_genel_notlar, txt_plant_title,txt_plant_ID, txt_habitus_sekli, txt_habitus_boyu, txt_habitus_capi, txt_habitus_dokusu, txt_habitus_notlar, txt_cicek_durumu, txt_cicek_buyuklugu, txt_cicek_kokusu, txt_cicek_rengi, txt_ciceklenme_vakti, txt_cicek_notlar, txt_yaprak_dokme, txt_yaprak_tipi, txt_yaprak_sekli, txt_yaprak_buyuklugu, txt_yaprak_kokusu, txt_yaprak_dokusu, txt_yaprak_rengi, txt_yaprak_guz_rengi, txt_yaprak_notlar, txt_meyve_durumu, txt_meyve_tipi, txt_meyve_buyuklugu, txt_meyve_rengi, txt_meyve_yenilebilirligi, txt_meyve_zamani, txt_kirsal, txt_kentsel, txt_diger, txt_peyzaj_tarzi, txt_kullanima_iliskin_notlar, txt_muhendislik, txt_mimarlik, txt_ek_ozellikler, txt_gun_isigi_istegi, txt_su_istegi, txt_besin_gereksinimi, txt_toprak_istegi, txt_toprak_drenaji, txt_buyume_hizi, txt_bakim_ihtiyaci, txt_zehirlilik, txt_uretimi);
    	
    
    }

    @FXML
    void tableViewClick(KeyEvent event) {

    }
    
    @FXML
    void btn_refreshClick(MouseEvent event)  {

    	
    	clear.obserVableClear(modellers, genels, habituss, ciceks, yapraks, meyves, kullanimAlanlaris, kullanimAmacis, yetismeIstegis, digerBilgilers);

    	initialize();
    	
    }
    
    

    public void getTableViewValues() {
		SelectQuery sQuery = new SelectQuery();
		
		sQuery.getGenelValues(genels, genelTableView, genelIDCol, latinceNameCol, turkceIsimleriCol, buyumeFormuCol, anavataniCol, yetistigiBolgeCol, ailesiCol, genelNotlarCol);
		sQuery.getHabitusValues(habituss, habitusTableView, habitusIdCol, habitusSekliCol, habitusBoyuCol, habitusCapiCol, habitusDokusuCol, habitusNotlarCol);
		sQuery.getCicekValues(ciceks, cicekTableView, cicekIdCol, cicekDurumuCol, cicekBuyukluguCol, cicekKokusuCol, cicekRengiCol, ciceklenmeZamaniCol, cicekNotlarCol);
		sQuery.getYaprakValues(yapraks, yaprakTableView, yaprakIdCol, yaprakDokmeCol, yaprakTipiCol, yaprakSekliCol, yaprakBuyukluguCol, yaprakKokusuCol, yaprakDokusuCol, yaprakRengiCol, yaprakGuzRengiCol, yaprakNotlarCol);
		sQuery.getMeyveValues(meyves, meyveTableView, meyveId, meyveDurumuCol, meyveTipiCol, meyveBuyukluguCol, meyveRengiCol, meyveYenilebilirligiCol, meyveZamaniCol);
		sQuery.getKullanimAlanlariValues(kullanimAlanlaris, kullanimAlanlariTableView, kullanimAlanlariId, kirsalKullanimCol, kentselKullanimCol, digerKullanimCol, peyzajTarziCol, kullanimNotlarCol);
		sQuery.getKullanimAmaciValues(kullanimAmacis, kullanimAmaciTableView, kullanimAmaciIdCol, muhendislikCol, mimarlikCol, ekOzelliklerCol);
		sQuery.getYetismeIstegiValues(yetismeIstegis, yetismeIstegiTableView, yetismeIstegiIdCol, gunIsigiIstegiCol, suIstegiCol, besinGereksinimiCol, toprakIstegiCol, toprakDrenajiCol);
		sQuery.getDigerBilgilerValues(digerBilgilers, digerBilgilerTableView, digerBilgilerIDCol, buyumeHiziCol, bakimIhtiyaciCol, zehirlilikCol, uretimiCol);
    
    }
    
    @FXML
    void initialize() {
    	

        
        getTableViewValues();
     
    	MysqlFiltered mFiltered = new MysqlFiltered();
        MysqlQuery mQuery= new MysqlQuery();
    	mQuery.valuesAll(tableView_PlantName, modellers, býtkýIDCol, plantName);
    	mFiltered.filteredList(txt_field_bitki_search,tableView_PlantName,modellers);
 
    	
    
    }

}
