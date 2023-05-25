package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn1;

    @FXML
    private Button btn11;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private ImageView git;

    @FXML
    private AnchorPane layer1;

    @FXML
    private AnchorPane layer2;

    @FXML
    private Label lbl11;
    
    @FXML
    private Label lbl1;

    @FXML
    private Label lbl2;

    @FXML
    private Label lbl3;

    @FXML
    private Label lbl4;

    @FXML
    private Label lbl5;

    @FXML
    private Label lbl6;

    @FXML
    private Label lbl7;

    @FXML
    private ImageView logo;

    @FXML
    private ImageView mail;

    @FXML
    private StackPane stk;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    private PasswordField txt3;

    @FXML
    private ImageView yt;

    @FXML
    void btn11_click(ActionEvent event) {

    }

    @FXML
    void btn1_click(ActionEvent event) {

    	
    }

    @FXML
    void btn2_click(ActionEvent event) {
 
       	TranslateTransition slide = new TranslateTransition();
    	slide.setDuration(Duration.seconds(0.7));
    	slide.setNode(layer2);
    	slide.setToX(0);
    	slide.play();
    	layer2.setTranslateX(1);
    	  lbl5.setVisible(false);
    	  lbl6.setVisible(false);
    	  lbl7.setVisible(false);
    	  lbl3.setVisible(true);
    	  lbl4.setVisible(true);
    	  btn2.setVisible(false);
          btn3.setVisible(true);
          btn1.setVisible(false);
          btn11.setVisible(true);
          btn1.setVisible(false);
          txt1.setVisible(true);
          lbl11.setVisible(false);
          lbl1.setVisible(true);
        	TranslateTransition slidei = new TranslateTransition();
        	slidei.setDuration(Duration.seconds(0.7));
        	slidei.setNode(layer1);
        	slidei.setToX(1);
        	slidei.play();
        	layer1.setTranslateX(-348);
        	
        	  
          
slide.setOnFinished(e->{
	
	
	
});
    	

    


    }

    @FXML
    void btn3_click(ActionEvent event) {
       	TranslateTransition slide = new TranslateTransition();
    	slide.setDuration(Duration.seconds(0.7));
    	slide.setNode(layer2);
    	slide.setToX(465);
    	slide.play();
    	layer2.setTranslateX(-348);
    	  lbl5.setVisible(true);
    	  lbl6.setVisible(true);
    	  lbl7.setVisible(true);
    	  lbl3.setVisible(false);
    	  lbl4.setVisible(false);
          btn2.setVisible(true);
          btn11.setVisible(false);
          btn1.setVisible(true);
          txt1.setVisible(false);
          lbl1.setVisible(false);
          lbl11.setVisible(true);
      	TranslateTransition slidei = new TranslateTransition();
    	slidei.setDuration(Duration.seconds(0.7));
    	slidei.setNode(layer1);
    	slidei.setToX(-400);
    	slidei.play();
    	layer1.setTranslateX(348);
    	
    	
    	slide.setOnFinished(e->{
    		
    		
    		
    	});
    	    	

    }

    @FXML
    void git_click(MouseEvent event) {
    }

    @FXML
    void mail_click(MouseEvent event) {

    }

    @FXML
    void yt_click(MouseEvent event) {

    }

    @FXML
    void initialize() {
    	lbl5.setVisible(false);
    	lbl6.setVisible(false);
    	lbl7.setVisible(false);
    	btn1.setVisible(false);
    	btn2.setVisible(false);
    	lbl11.setVisible(false);
        

    }

}
