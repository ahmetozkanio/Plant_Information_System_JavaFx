package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;


import com.Mysql.Util.DatabaseUtil;

import DatabaseQuery.MysqlQuery;
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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class PlantNameController {
	
	
	//database baglanti
	Connection baglanti = null;
	PreparedStatement sorguIfadesi=null;
	ResultSet getirilen = null;
	String sql;
	String orderBy = " ORDER BY genel.latince_ismi ASC";

	
	public PlantNameController() {
		// TODO Auto-generated constructor stub
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

	
	

    @FXML
    void tableViewClick(KeyEvent event) {
    	
    }
    

    @FXML
    void btn_plantShowClick(ActionEvent event) {
    ShowButton showButton = new ShowButton();
    showButton.showValuesLabel( tableView_PlantName,  txt_latinName,  txt_turkce,
			 txt_buyume_formu,  txt_anavatani,  txt_yetistigi_bolge,  txt_ailesi,
			 txt_genel_notlar,  txt_plant_title, txt_plant_ID,  txt_habitus_sekli,
			 txt_habitus_boyu,  txt_habitus_capi,  txt_habitus_dokusu,
			 txt_habitus_notlar,  txt_cicek_durumu,  txt_cicek_buyuklugu,
			 txt_cicek_kokusu,  txt_cicek_rengi,  txt_ciceklenme_vakti,
			 txt_cicek_notlar,  txt_yaprak_dokme,  txt_yaprak_tipi,
			 txt_yaprak_sekli,  txt_yaprak_buyuklugu,  txt_yaprak_kokusu,
			 txt_yaprak_dokusu,  txt_yaprak_rengi,  txt_yaprak_guz_rengi,
			 txt_yaprak_notlar,  txt_meyve_durumu,  txt_meyve_tipi,
			 txt_meyve_buyuklugu,  txt_meyve_rengi,  txt_meyve_yenilebilirligi,
			 txt_meyve_zamani,  txt_kirsal,  txt_kentsel,  txt_diger,
			 txt_peyzaj_tarzi,  txt_kullanima_iliskin_notlar,  txt_muhendislik,
			 txt_mimarlik,  txt_ek_ozellikler,  txt_gun_isigi_istegi,
			 txt_su_istegi,  txt_besin_gereksinimi,  txt_toprak_istegi,
			 txt_toprak_drenaji,  txt_buyume_hizi,  txt_bakim_ihtiyaci,
			 txt_zehirlilik,  txt_uretimi);
    }
	
    @FXML
    private TextField txt_field_bitki_search;
    
    @FXML
    private Button btn_plantShow;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
  

    
   

    @FXML
    private TableView<Modeller> tableView_PlantName;

    
    @FXML
    private TableColumn<Modeller, String> plantName;

    @FXML
    private TableColumn<Modeller, Integer> plant_IDCol;
    @FXML
    private Label txt_plant_title;
    @FXML
    private Label txt_plant_ID;
    @FXML
    private ImageView btn_back;

    
    
    @FXML
    private Label txt_latinName;

    @FXML
    private Label txt_turkce;

    @FXML
    private Label txt_buyume_formu;

    @FXML
    private Label txt_anavatani;

    @FXML
    private Label txt_yetistigi_bolge;

    @FXML
    private Label txt_ailesi;

    @FXML
    private Label txt_genel_notlar;

    @FXML
    private Label txt_habitus_sekli;

    @FXML
    private Label txt_habitus_boyu;

    @FXML
    private Label txt_habitus_capi;

    @FXML
    private Label txt_habitus_dokusu;

    @FXML
    private Label txt_habitus_notlar;

    @FXML
    private Label txt_cicek_durumu;

    @FXML
    private Label txt_cicek_buyuklugu;

    @FXML
    private Label txt_cicek_kokusu;

    @FXML
    private Label txt_cicek_rengi;

    @FXML
    private Label txt_ciceklenme_vakti;
    
    @FXML
    private Label txt_cicek_notlar;

    @FXML
    private Label txt_yaprak_dokme;

    @FXML
    private Label txt_yaprak_tipi;

    @FXML
    private Label txt_yaprak_sekli;

    @FXML
    private Label txt_yaprak_buyuklugu;

    @FXML
    private Label txt_yaprak_kokusu;

    @FXML
    private Label txt_yaprak_dokusu;

    @FXML
    private Label txt_yaprak_rengi;

    @FXML
    private Label txt_yaprak_guz_rengi;

    @FXML
    private Label txt_yaprak_notlar;

    @FXML
    private Label txt_meyve_durumu;

    @FXML
    private Label txt_meyve_tipi;

    @FXML
    private Label txt_meyve_buyuklugu;

    @FXML
    private Label txt_meyve_rengi;

    @FXML
    private Label txt_meyve_yenilebilirligi;

    @FXML
    private Label txt_meyve_zamani;

    @FXML
    private Label txt_kirsal;

    @FXML
    private Label txt_kentsel;

    @FXML
    private Label txt_diger;

    @FXML
    private Label txt_peyzaj_tarzi;

    @FXML
    private Label txt_kullanima_iliskin_notlar;

    @FXML
    private Label txt_muhendislik;

    @FXML
    private Label txt_mimarlik;

    @FXML
    private Label txt_ek_ozellikler;

    @FXML
    private Label txt_gun_isigi_istegi;

    @FXML
    private Label txt_su_istegi;

    @FXML
    private Label txt_besin_gereksinimi;

    @FXML
    private Label txt_toprak_istegi;

    @FXML
    private Label txt_toprak_drenaji;

    @FXML
    private Label txt_buyume_hizi;

    @FXML
    private Label txt_bakim_ihtiyaci;

    @FXML
    private Label txt_zehirlilik;

    @FXML
    private Label txt_uretimi;
    
    
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
    void initialize() {


    		MysqlFiltered mFiltered = new MysqlFiltered();
  	  		MysqlQuery mQuery= new MysqlQuery();
        	mQuery.valuesAll(tableView_PlantName, modellers, plant_IDCol, plantName);
          	mFiltered.filteredList(txt_field_bitki_search,tableView_PlantName,modellers);
    
    }
    
  
    
}
