package gui;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import gui.listeners.DataChangeListener;
import gui.util.Utils;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import model.entities.Department;
import model.entities.Seller;

public class SellerListController implements Initializable, DataChangeListener{

	@FXML
	private TableView<Seller> tabçeViewSeller;
	
	@FXML
	private TableColumn<Seller, Integer> tableColumnId;
	
	@FXML
	private TableColumn<Seller, String> tableColumnName;
	
	@FXML
	private TableColumn<Seller, String> tableColumnEmail;
	
	@FXML
	private TableColumn<Seller, Date> tableColumnBirthDate;
	
	@FXML
	private TableColumn<Seller, Double> tableColumnBaseSalary;
	
	@FXML
	private TableColumn<Department, String> tableColumnDepartment;
	
	@FXML
	private TableColumn<Seller, Seller> tableColumnEDIT;

	@FXML
	private TableColumn<Seller, Seller> tableColumnREMOVE;
	
	@FXML
	private Button btNew;
	
	private ObservableList<Seller> obsList;
	
	@FXML
	public void onBtNewAction(ActionEvent event) {
		Stage parentStage = Utils.currentStage(event);
		Department obj = new Department();
		createDialogForm(obj, "/gui/SellerForm.fxml", parentStage);
	}
	
	@Override
	public void onDataChanger() {
		updateTableView();
	}

	private void updateTableView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		initializeNodes();
	}

	private void initializeNodes() {
		// TODO Auto-generated method stub
		
	}
	

}
