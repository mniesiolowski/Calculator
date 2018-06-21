package pl.wsb.gd68950.kalkulator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
  public String operacja;
  public int cyfra;

   
    @FXML
    private TextField wyswietlacz;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void numery(ActionEvent event) {
        
        String guzik = ((Button)event.getSource()).getText();
        String text = wyswietlacz.getText();
        String calosc = text +guzik;
      wyswietlacz.setText(calosc);
    }
@FXML
    private void operacja(ActionEvent event) {
  
        String text = wyswietlacz.getText();
        cyfra = Integer.parseInt(text);
         wyswietlacz.setText("");
         operacja = ((Button)event.getSource()).getText();
    }

    @FXML
    private void rowne(ActionEvent event) {
      String rowna = wyswietlacz.getText();
      int nowacyfra = Integer.parseInt(rowna);
      if(operacja.equals("+")){
      cyfra= cyfra + nowacyfra;}
      else if(operacja.equals("-")){
          cyfra= cyfra - nowacyfra;}
      else if(operacja.equals("*")){
          cyfra= cyfra * nowacyfra;}
      else if(operacja.equals("/")){
          cyfra= cyfra / nowacyfra;}
      wyswietlacz.setText(""+cyfra);
      
                
    }

 

    @FXML
    private void c(ActionEvent event) {
        wyswietlacz.setText("");
    }

    
    
}
