package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import com.moviearchiveSQL.Util.databaseUtil;

import application.admin_sidecontroller.Kayitlar;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class admin_sidecontroller {

	public  admin_sidecontroller(){
		
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
    private TableColumn<?, ?> commennts;

    @FXML
    private TableView<?> comments;

    @FXML
    private TableColumn<Kayitlar, Double> imdb_point;

    @FXML
    private AnchorPane layer1;

    @FXML
    private TableView<Kayitlar> movie;

    @FXML
    private TableColumn<Kayitlar, Integer> movie_id;

    @FXML
    private TableColumn<Kayitlar, String> movie_name;

    @FXML
    private TableColumn<?, ?> points;

    @FXML
    private TableColumn<Kayitlar, String> subject;

    @FXML
    private TableColumn<?, ?> user1_id;

    @FXML
    private TableColumn<?, ?> user1_name;

    @FXML
    private TableColumn<?, ?> user_id;

    @FXML
    private TableView<?> user_inf;

    @FXML
    private TableColumn<?, ?> user_mail;

    @FXML
    private TableColumn<Kayitlar, String> link;
    
    @FXML
    private TableColumn<?, ?> user_pasword;

    @FXML
    private TableColumn<?, ?> usr_name;

    @FXML
    private Button delete;
    
    @FXML
    private Button insert;
    
    @FXML
    private Button update;
    
    @FXML
    private VBox vbox;
    
    public void degergetir(TableView<Kayitlar> tablo) {
    	sql="select * from movies_inf";
    	ObservableList<Kayitlar> Kayitlarliste=FXCollections.observableArrayList();
    	try {
    		sorgu=baglanti.prepareStatement(sql);
    		ResultSet getirilen=sorgu.executeQuery();
    		while(getirilen.next()) {
    			Kayitlarliste.add(new Kayitlar(getirilen.getInt("movie_id"),getirilen.getString("movie_name"),getirilen.getDouble("imdb_point"),getirilen.getString("subject"),getirilen.getString("movie_link")));
    		}
    		link.setCellValueFactory(new PropertyValueFactory<> ("movie_link"));
    		movie_id.setCellValueFactory(new PropertyValueFactory<> ("movie_id"));
    		movie_name.setCellValueFactory(new PropertyValueFactory<> ("movie_name"));
    		imdb_point.setCellValueFactory(new PropertyValueFactory<> ("imdb_point"));
    		subject.setCellValueFactory(new PropertyValueFactory<> ("subject"));
    	
    		movie.setItems(Kayitlarliste);
    		
		} catch (Exception e) {
		System.out.println("hata");
		}
    	
    	
    }
    
    
    
    
    

    @FXML
    void btn1_click(ActionEvent event) {

    	user_inf.setVisible(false);
    	movie.setVisible(false);
    	comments.setVisible(true);
    }

    @FXML
    void btn2_click(ActionEvent event) {
    	comments.setVisible(false);
    	movie.setVisible(false);
    	user_inf.setVisible(true);
    }

    @FXML
    void btn3_click(ActionEvent event) {
    	comments.setVisible(false);
    	user_inf.setVisible(false);
    	movie.setVisible(true);
    }

    @FXML
    void btn4_click(ActionEvent event) {
    	System.exit(0);
    }
    
    @FXML
    void delete_click(ActionEvent event) {

    }

    @FXML
    void inser_click(ActionEvent event) {

    }

    @FXML
    void update_click(ActionEvent event) {

    }

    @FXML
    void initialize() {
    	comments.setVisible(false);
    	user_inf.setVisible(false);
    	degergetir(movie);
    	link.setVisible(true);
    


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
