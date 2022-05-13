/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package testproduct;

import java.net.URL;

import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author milar
 */
public class AddProductController implements Initializable {

    @FXML
    private TextField cBarreTxt;
    @FXML
    private TextField nameTxt;
    @FXML
    private TextField qtaTxt;
    @FXML
    private Label cBarreLbl;
    @FXML
    private Label nameLbl;
    @FXML
    private Label qtaLbl;
    @FXML
    private Label priceLbl;
    @FXML
    private TextField priceTxt;
    @FXML
    private Button insertProductbtn;
    private Product p;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createProduct(ActionEvent event) throws SQLException {
        
        int cBarre= Integer.parseInt(cBarreTxt.getText());
        String nome = nameTxt.getText();
        int qta = Integer.parseInt(qtaTxt.getText());
        int prezzo = Integer.parseInt (priceTxt.getText());
        
        
        p = new Product();
        p.insert (cBarre, nome, qta, prezzo);
        //prova di commit
        
    }
    
}
