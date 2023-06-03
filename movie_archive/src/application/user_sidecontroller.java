package application;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import com.moviearchiveSQL.Util.databaseUtil;


import application.admin_sidecontroller.Kayitlar;
import application.admin_sidecontroller.kayitlar3;
import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class user_sidecontroller {
	public  user_sidecontroller(){
		
		baglanti=databaseUtil.Bağlan();
		
	}
	Connection baglanti=null;
	PreparedStatement sorgu=null;
	ResultSet getirilen=null;
	String sql;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;
    
    
    @FXML
    private ComboBox<String> cmbx;

    @FXML
    private TableColumn<kayitlar3, String> commennts;

    @FXML
    private TableColumn<kayitlar3, Integer> comment_id;

    @FXML
    private TableView<Kayitlar> filmler;

    @FXML
    private TableColumn<Kayitlar, Double> imdb_point;

    @FXML
    private TableColumn<Kayitlar, String> link;

    @FXML
    private Hyperlink lnk;

    @FXML
    private TableColumn<kayitlar3, String> movie1_id;

    @FXML
    private TableColumn<Kayitlar, String> movie_id;

    @FXML
    private TableColumn<Kayitlar, String> movie_name;

    @FXML
    private TableColumn<kayitlar3, String> point;

    @FXML
    private RadioButton rd1;

    @FXML
    private RadioButton rd2;

    @FXML
    private TableColumn<Kayitlar, String> subject;

    @FXML
    private Button btn61;
    
    @FXML
    private TextField txt2;
   
    @FXML
    private TextField txt5;
    
    @FXML
    private TextField txt6;

    @FXML
    private TextField txt7;


 
    @FXML
    private TableColumn<kayitlar3, String> usr_name;

    @FXML
    private TableView<kayitlar3> yorumlar;
    
    public void degergetir3(TableView<kayitlar3> tablo3) {
   
    	sql="select * from comminicate";
    	ObservableList<kayitlar3> kayitlarliste3=FXCollections.observableArrayList();
    	try {
    		sorgu=baglanti.prepareStatement(sql);
    		ResultSet getirilen=sorgu.executeQuery();
    		while(getirilen.next()) {
    			kayitlarliste3.add(new kayitlar3(getirilen.getInt("comment_id"), getirilen.getString("movie1_id"),getirilen.getString("usr_name"),getirilen.getString("commennts"),getirilen.getDouble("point")));
    			comment_id.setCellValueFactory(new PropertyValueFactory<>("comment_id"));
    			movie1_id.setCellValueFactory(new PropertyValueFactory<>("movie1_id"));
    			usr_name.setCellValueFactory(new PropertyValueFactory<>("usr_name"));
    			commennts.setCellValueFactory(new PropertyValueFactory<>("commennts"));
    			point.setCellValueFactory(new PropertyValueFactory<>("point"));
    			
    			
    			
    		}
    		
    	
    		yorumlar.setItems(kayitlarliste3);
    		
		} catch (Exception e) {
		System.out.println("hata");
		}
    	
    }
    
    
    
    public void degergetir(TableView<Kayitlar> tablo) {
    	sql="select * from movies_inf";
    	ObservableList<Kayitlar> Kayitlarliste=FXCollections.observableArrayList();
    	try {
    		sorgu=baglanti.prepareStatement(sql);
    		ResultSet getirilen=sorgu.executeQuery();
    		while(getirilen.next()) {
    			Kayitlarliste.add(new Kayitlar(getirilen.getInt("movie_id"),getirilen.getString("movie_name"),getirilen.getDouble("imdb_point"),getirilen.getString("subject"),getirilen.getString("movie_link")));
    		
    		link.setCellValueFactory(new PropertyValueFactory<> ("movie_link"));
    		movie_id.setCellValueFactory(new PropertyValueFactory<> ("movie_id"));
    		movie_name.setCellValueFactory(new PropertyValueFactory<> ("movie_name"));
    		imdb_point.setCellValueFactory(new PropertyValueFactory<> ("imdb_point"));
    		subject.setCellValueFactory(new PropertyValueFactory<> ("subject"));
    		}
    	
    		filmler.setItems(Kayitlarliste);	
    		
		} catch (Exception e) {
		System.out.println("hata");
		}
    	
    	
    }
    

    @FXML
    void btn1_click(ActionEvent event) {
    	filmler.setVisible(false);
    	yorumlar.setVisible(true);
    	cmbx.setVisible(true);
    	btn61.setVisible(true);
    	btn4.setVisible(true);
    	rd1.setVisible(false);
    	rd2.setVisible(false);
    	lnk.setVisible(false);
    }

    @FXML
    void btn2_click(ActionEvent event) {
    	filmler.setVisible(true);
    	yorumlar.setVisible(false);
    	cmbx.setVisible(true);
    	btn61.setVisible(false);
    	btn4.setVisible(false);
    	rd1.setVisible(false);
    	rd2.setVisible(false);
    	lnk.setVisible(true);
    }

    @FXML
    void btn3_click(ActionEvent event) {
System.exit(0);
    }

    @FXML
    void btn4_click(ActionEvent event) {
    	sql="insert into comminicate(movie1_id,usr_name,commennts,point) values(?,?,?,?)";
    	try {
    		sorgu=baglanti.prepareStatement(sql);
    		sorgu.setString(1, txt2.getText().trim());
    		sorgu.setString(2, txt5.getText().trim());
    		sorgu.setString(3, txt6.getText().trim());
    		sorgu.setString(4, txt7.getText().trim());
    		sorgu.executeUpdate();
    		degergetir3(yorumlar);
    		
    
    	}
    	catch(Exception e) {
    		
    		}
    }
    	

    @FXML
    void btn5_click(ActionEvent event) {

    }
    
    @FXML
    void btn61_click(ActionEvent event) {
    	sql = "update comminicate set commennts=?, point=? where usr_name=?";
    	try {
    	    sorgu = baglanti.prepareStatement(sql);

    	    sorgu.setString(1, txt6.getText().trim());
    	    sorgu.setString(2, txt7.getText().trim());
    	    sorgu.setString(3, txt5.getText().trim());

    	    sorgu.executeUpdate();
    	    degergetir3(yorumlar);

    	} catch (Exception e) {
    	    e.printStackTrace();
    	}
    }

    @FXML
    void cmbx_click(ActionEvent event) {

    }

    @FXML
    void rd1_clk(ActionEvent event) {

    }

    @FXML
    void rd2_click(ActionEvent event) {

    }
    
    
    @FXML
    void table2_mouse_click(MouseEvent event) {
    	
    	txt2.setText(yorumlar.getSelectionModel().getSelectedItem().movie1_id);
    	txt5.setText(yorumlar.getSelectionModel().getSelectedItem().usr_name);
    	txt6.setText(yorumlar.getSelectionModel().getSelectedItem().commennts);
    	txt7.setText(String.valueOf(yorumlar.getSelectionModel().getSelectedItem().point));
    }
    
    @FXML
    void table_mouse_click(MouseEvent event) {

    	lnk.setText(filmler.getSelectionModel().getSelectedItem().movie_link);
    	
    	
    	

    	
  
    	
    	
    	
    }
    
    @FXML
    void openlink(ActionEvent event) throws URISyntaxException,IOException {
    	Desktop.getDesktop().browse(new URI(lnk.getText()));
    }
    
 

    @FXML
    void initialize() {
        
    	degergetir3(yorumlar);
    	degergetir(filmler);
    	
    	filmler.setVisible(false);
    	yorumlar.setVisible(false);
    	rd1.setVisible(false);
    	rd2.setVisible(false);
    	lnk.setVisible(false);
    	btn5.setVisible(false);
    	btn61.setVisible(false);
    	btn4.setVisible(false);
    	for(int i =0;i<filmler.getItems().size();i++) {
    		cmbx.getItems().add(filmler.getItems().get(i).movie_name);
    		
    	}

  
    	
    	
    }
    
    
    
    public static class kayitlar3{
    	private int comment_id;
    	private String movie1_id;
    	
    	private String usr_name;
    	private String commennts;
    	private double point;
    	 kayitlar3(){
    	    	
    	    	
    	    }
    	    kayitlar3(int comment_id,String movie1_id,String usr_name,String commennts,double point){
    	    	this.comment_id=comment_id;
    	    	this.movie1_id=movie1_id;
    	    	
    	    	this.usr_name=usr_name;
    	    	this.commennts=commennts;
    	    	this.point=point;
    }
			public int getComment_id() {
				return comment_id;
			}
			public void setComment_id(int comment_id) {
				this.comment_id = comment_id;
			}
			public String getMovie1_id() {
				return movie1_id;
			}
			public void setMovie1_id(String movie1_id) {
				this.movie1_id = movie1_id;
			}


			public String getUsr_name() {
				return usr_name;
			}
			public void setUsr_name(String usr_name) {
				this.usr_name = usr_name;
			}
			public String getCommennts() {
				return commennts;
			}
			public void setCommennts(String commennts) {
				this.commennts = commennts;
			}
			public double getPoint() {
				return point;
			}
			public void setPoint(double point) {
				this.point = point;
			}
    
   
    	
    	
    	
    }
    
    
    
    public static class Kayitlar{
    	private int movie_id;
    	private String movie_name;
    	private double imdb_point;
    	private String subject;
    	private String movie_link;
    	
    	 public int getMovie_id() {
			return movie_id;
		}
		public void setMovie_id(int movie_id) {
			this.movie_id = movie_id;
		}
		public String getMovie_name() {
			return movie_name;
		}
		public void setMovie_name(String movie_name) {
			this.movie_name = movie_name;
		}
		public double getImdb_point() {
			return imdb_point;
		}
		public void setImdb_point(double imdb_point) {
			this.imdb_point = imdb_point;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getMovie_link() {
			return movie_link;
		}
		public void setMovie_link(String movie_link) {
			this.movie_link = movie_link;
		}
		Kayitlar() {
			
		}
    	 Kayitlar(int movie_id,String movie_name,double imdb_point,String subject,String link) {
 			this.movie_id=movie_id;
 			this.movie_name=movie_name;
 			this.imdb_point=imdb_point;
 			this.subject=subject;
 			this.movie_link=link;
 		}

    	 
    }
    
    
    
    

}
