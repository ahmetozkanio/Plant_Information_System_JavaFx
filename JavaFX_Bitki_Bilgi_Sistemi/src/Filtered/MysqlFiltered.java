package Filtered;

import Modals.Modeller;
import application.AdminPaneliController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MysqlFiltered {
    
	

    public void filteredList(TextField textField,TableView tableView,ObservableList<Modeller> modellers) {
    	

		FilteredList<Modeller> filteredList = new FilteredList<>(modellers,b -> true);
		textField.textProperty().addListener((observable,oldValue,newValue) -> {
			filteredList.setPredicate(modeller -> {
			
			if(newValue == null || newValue.isEmpty())
				return true;
			String loverCaseFilter = newValue.toLowerCase();
			
			if(modeller.getLatinName().toLowerCase().indexOf(loverCaseFilter) != -1)
				return true;
			else if (modeller.getId().toLowerCase().indexOf(loverCaseFilter) != -1) {
				return true;
			}
			else return false;
		});
		});

		SortedList<Modeller> sortedList = new SortedList<>(filteredList);
		
		sortedList.comparatorProperty().bind(tableView.comparatorProperty());
		tableView.setItems(sortedList);
	}
}
