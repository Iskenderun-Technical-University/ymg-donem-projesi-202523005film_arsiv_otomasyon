package application;


import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import com.moviearchiveSQL.Util.databaseUtil;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.sql.*;
import javafx.scene.control.Hyperlink;
public class SampleController {
	public  SampleController(){
		
		baglanti=databaseUtil.Bağlan();
		
	}
		
Connection baglanti=null;
PreparedStatement sorgu=null;
ResultSet getirilen=null;
String sql;
String sqli;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn1;

    @FXML
    private Button btn21;
    
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
    private Hyperlink link;
    @FXML
    private Hyperlink link1;

    @FXML
    private Hyperlink link2;

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
    void btn21_click(ActionEvent event) {
    	sql="select*from admin_login where admin_name=? and password=?";
    	try {
    		sorgu=baglanti.prepareStatement(sql);
    		sorgu.setString(1, txt2.getText().trim());
    		sorgu.setString(2, txt3.getText().trim());
    		ResultSet getirilen=sorgu.executeQuery();
    		if(!getirilen.next()) {
    			System.out.println("hata");
    		}
    		else {
    			
    			try {
    				Stage stage1=new Stage();
    				StackPane stack = (StackPane)FXMLLoader.load(getClass().getResource("admin_side.fxml"));
    				Scene scene = new Scene(stack,1000,600);
    				stage1.setScene(scene);
    				stage1.show();
                   Stage stage2=(Stage) btn1.getScene().getWindow();
                   stage2.close();
    				
    			} catch(Exception e) {
    				e.printStackTrace();
    			}
    		}
    	}
    	catch(Exception e) {
    		System.out.println(e.getMessage().toString());    
    		}
    }

    @FXML
    void btn11_click(ActionEvent event) {
     	sql="insert into login_form(user_name,user_mail,user_password) values(?,?,?)";
    	try {
    		sorgu=baglanti.prepareStatement(sql);
    		sorgu.setString(1, txt2.getText().trim());
    		sorgu.setString(3, txt3.getText().trim());
    		sorgu.setString(2, txt1.getText().trim());
    		sorgu.executeUpdate();

    		if(!getirilen.next()) {
    			System.out.println("hata");
    		}
    		else {
    			
    			try {
    				
    				
    			} catch(Exception e) {
    				e.printStackTrace();
    			}
    		}
    	}
    	catch(Exception e) {
    		System.out.println(e.getMessage().toString());    
    		}
    	
    }

    @FXML
    void btn1_click(ActionEvent event) {
    	sql="select*from login_form where user_name=? and user_password=?";
    	try {
    		sorgu=baglanti.prepareStatement(sql);
    		sorgu.setString(1, txt2.getText().trim());
    		sorgu.setString(2, txt3.getText().trim());
    		ResultSet getirilen=sorgu.executeQuery();
    		if(!getirilen.next()) {
    			System.out.println("hata");
    		}
    		else {
    			
    			try {
    				Stage stage1=new Stage();
    				StackPane stack = (StackPane)FXMLLoader.load(getClass().getResource("user_side.fxml"));
    				Scene scene = new Scene(stack,850,600);
    				stage1.setScene(scene);
    				stage1.show();
                   Stage stage2=(Stage) btn1.getScene().getWindow();
                   stage2.close();
    				
    			} catch(Exception e) {
    				e.printStackTrace();
    			}
    		}
    	}
    	catch(Exception e) {
    		System.out.println(e.getMessage().toString());    
    		}
    }
    

    @FXML
    void btn2_click(ActionEvent event) {
 
       	TranslateTransition slide = new TranslateTransition();
    	slide.setDuration(Duration.seconds(0.7));
    	slide.setNode(layer2);
    	slide.setToX(0);
    	slide.play();
    	layer2.setTranslateX(1);
    	  lbl5.setVisible(true);
    	  lbl6.setVisible(true);
    	  lbl7.setVisible(true);
    	  lbl3.setVisible(false);
    	  lbl4.setVisible(false);
    	  btn2.setVisible(false);
          btn3.setVisible(true);
          btn1.setVisible(false);
          btn11.setVisible(true);
          btn1.setVisible(false);
          txt1.setVisible(true);
          lbl11.setVisible(false);
          lbl1.setVisible(true);
          btn21.setVisible(false);
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
    	  lbl5.setVisible(false);
    	  lbl6.setVisible(false);
    	  lbl7.setVisible(false);
    	  lbl3.setVisible(true);
    	  lbl4.setVisible(true);
          btn2.setVisible(true);
          btn11.setVisible(false);
          btn1.setVisible(true);
          txt1.setVisible(false);
          lbl1.setVisible(false);
          lbl11.setVisible(true);
          btn21.setVisible(true);

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
    void openlink(ActionEvent event) throws URISyntaxException,IOException{
Desktop.getDesktop().browse(new URI("https://github.com/BledaBilir01"));
    }

    @FXML
    void openlink1(ActionEvent event)throws URISyntaxException,IOException{
    		Desktop.getDesktop().browse(new URI("https://www.youtube.com/@AverageGameEnjoyer979"));
    }

    @FXML
    void openlink2(ActionEvent event) throws URISyntaxException,IOException{
    	Desktop.getDesktop().browse(new URI("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1685117006&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f0%2f%3fstate%3d1%26redirectTo%3daHR0cHM6Ly9vdXRsb29rLmxpdmUuY29tL21haWwvMC8%26RpsCsrfState%3d13c38d0e-1f58-0e98-6e5c-db5440ab326c&id=292841&aadredir=1&whr=hotmail.com&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015"));
    }

    @FXML
    void initialize() {
    	lbl3.setVisible(false);
    	lbl4.setVisible(false);
    	btn1.setVisible(false);
    	btn2.setVisible(false);
    	lbl11.setVisible(false);
        btn21.setVisible(false);

    }

}
