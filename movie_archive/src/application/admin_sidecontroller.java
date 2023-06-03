package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import com.moviearchiveSQL.Util.databaseUtil;

import application.admin_sidecontroller.Kayitlar;
import application.admin_sidecontroller.kayitlar2;
import application.admin_sidecontroller.kayitlar3;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
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
    private TableColumn<kayitlar3, Integer> comment_id;
    
    @FXML
    private TableColumn<kayitlar3, String> commennts;

    @FXML
    private TableView<kayitlar3> comments;

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
    private TableColumn<kayitlar3, Double> point;

    @FXML
    private TableColumn<Kayitlar, String> subject;

    @FXML
    private TableColumn<kayitlar2, Integer> user1_id;

    @FXML
    private TableColumn<kayitlar2, String> user1_name;

 

    @FXML
    private TableView<kayitlar2> user_inf;

    @FXML
    private TableColumn<kayitlar2, String> user_mail;

    @FXML
    private TableColumn<Kayitlar, String> link;
    
    @FXML
    private TableColumn<kayitlar2, String> user_pasword;

    @FXML
    private TableColumn<kayitlar3, String> usr_name;
    
    @FXML
    private TableColumn<kayitlar3, Integer> movie1_id;

    @FXML
    private Button delete;
    
    @FXML
    private Button insert;
    
    @FXML
    private Button update;
    
    @FXML
    private TextField lnk;
    
    @FXML
    private TextArea sub;
    
    @FXML
    private TextField film;

    @FXML
    private TextField imdb;
    
    @FXML
    private TextField iddd;

    
    
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
    		
    		link.setCellValueFactory(new PropertyValueFactory<> ("movie_link"));
    		movie_id.setCellValueFactory(new PropertyValueFactory<> ("movie_id"));
    		movie_name.setCellValueFactory(new PropertyValueFactory<> ("movie_name"));
    		imdb_point.setCellValueFactory(new PropertyValueFactory<> ("imdb_point"));
    		subject.setCellValueFactory(new PropertyValueFactory<> ("subject"));
    		}
    		movie.setItems(Kayitlarliste);
    		
		} catch (Exception e) {
		System.out.println("hata");
		}
    	
    	
    }
    
    public void degergetir2(TableView<kayitlar2> tablo1) {
    	sql="select * from login_form";
    	ObservableList<kayitlar2> kayitlarliste2=FXCollections.observableArrayList();
    	try {
    		sorgu=baglanti.prepareStatement(sql);
    		ResultSet getirilen=sorgu.executeQuery();
    		while(getirilen.next()) {
    			kayitlarliste2.add(new kayitlar2(getirilen.getInt("user_id"),getirilen.getString("user_name"),getirilen.getString("user_mail"),getirilen.getString("user_password")));
    			user1_id.setCellValueFactory(new PropertyValueFactory<>("user1_id"));
    			user1_name.setCellValueFactory(new PropertyValueFactory<>("user1_name"));
    			user_mail.setCellValueFactory(new PropertyValueFactory<>("user_mail"));
    			user_pasword.setCellValueFactory(new PropertyValueFactory<>("user_pasword"));
    			
    			
    		}
    		
    	
    		user_inf.setItems(kayitlarliste2);
    		
		} catch (Exception e) {
		System.out.println("hata");
		}
    	
    	
    }
    
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
    		
    	
    		comments.setItems(kayitlarliste3);
    		
		} catch (Exception e) {
		System.out.println("hata");
		}
    	
    	
    }
    

    

    @FXML
    void btn1_click(ActionEvent event) {
    	insert.setVisible(false);
    	delete.setVisible(false);
    	update.setVisible(false);
    	film.setVisible(false);
    	imdb.setVisible(false);
    	sub.setVisible(false);
    	lnk.setVisible(false);
    	user_inf.setVisible(false);
    	movie.setVisible(false);
    	comments.setVisible(true);
    	degergetir3(comments);
    }

    @FXML
    void btn2_click(ActionEvent event) {
    	insert.setVisible(false);
    	delete.setVisible(false);
    	update.setVisible(false);
    	film.setVisible(false);
    	imdb.setVisible(false);
    	sub.setVisible(false);
    	lnk.setVisible(false);
    	comments.setVisible(false);
    	movie.setVisible(false);
    	user_inf.setVisible(true);
    	degergetir2(user_inf);
    }

    @FXML
    void btn3_click(ActionEvent event) {
    	insert.setVisible(true);
    	delete.setVisible(true);
    	update.setVisible(true);
    	film.setVisible(true);
    	imdb.setVisible(true);
    	sub.setVisible(true);
    	lnk.setVisible(true);
    	comments.setVisible(false);
    	user_inf.setVisible(false);
    	movie.setVisible(true);
    	degergetir(movie);
    
    }

    @FXML
    void btn4_click(ActionEvent event) {
    	System.exit(0);
    }
    
    @FXML
    void delete_click(ActionEvent event) {
    	sql="delete from movies_inf  where movie_id=? and movie_name=? ";
    	try {
    		sorgu=baglanti.prepareStatement(sql);
    		sorgu.setString(1, iddd.getText().trim());
    		sorgu.setString(2, film.getText().trim());
    		sorgu.executeUpdate();
    		degergetir(movie);
    		
    
    	}
    	catch(Exception e) {
    		
    		}
    	
    	
    }

    @FXML
    void inser_click(ActionEvent event) {
    	sql="insert into movies_inf(movie_name,imdb_point,subject,movie_link) values(?,?,?,?)";
    	try {
    		sorgu=baglanti.prepareStatement(sql);
    		sorgu.setString(1, film.getText().trim());
    		sorgu.setString(2, imdb.getText().trim());
    		sorgu.setString(3, sub.getText().trim());
    		sorgu.setString(4, lnk.getText().trim());
    		sorgu.executeUpdate();
    		degergetir(movie);
    		
    
    	}
    	catch(Exception e) {
    		
    		}
    }

    @FXML
    void update_click(ActionEvent event) {
sql="update movies_inf set imdb_point=?,subject=?, movie_link=?,movie_name=? where movie_id=?";
try {
	sorgu=baglanti.prepareStatement(sql);

	sorgu.setString(1, imdb.getText().trim());
	sorgu.setString(2, sub.getText().trim());
	sorgu.setString(3, lnk.getText().trim());
	sorgu.setString(4, film.getText().trim());
	sorgu.setString(5, iddd.getText().trim());
	sorgu.executeUpdate();
	degergetir(movie);

} catch (Exception e) {
	e.printStackTrace();
}

    }
    
    @FXML
    void movie_click(MouseEvent event) {
    	Kayitlar kayit=new Kayitlar();
    	kayit=(Kayitlar) movie.getItems().get(movie.getSelectionModel().getSelectedIndex());
    	iddd.setText(String.valueOf(kayit.getMovie_id()));
    	film.setText(kayit.getMovie_name());
    	imdb.setText(String.valueOf(kayit.getImdb_point()));
    	sub.setText(kayit.getSubject());
    	lnk.setText(kayit.getMovie_link());
    	
    	
    	
    	
    }


    
    @FXML
    void initialize() {
    	comments.setVisible(false);
    	user_inf.setVisible(false);
    	movie.setVisible(false);
    	iddd.setVisible(false);
    	film.setVisible(false);
    	imdb.setVisible(false);
    	sub.setVisible(false);
    	lnk.setVisible(false);
    	insert.setVisible(false);
    	delete.setVisible(false);
    	update.setVisible(false);
    	
    	
    	
 


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
    
    public static class kayitlar2{
    	private int user1_id;
    	private String user1_name;
    	private String user_mail;
    	private String user_pasword;
    	
    	 kayitlar2() {
    		 
    		
    	}
    	 
    	 
    	 kayitlar2(int user1_id,String user1_name,String user_mail,String user_pasword) {
   			this.user1_id=user1_id;
   			this.user1_name=user1_name;
   			this.user_mail=user_mail;
   			this.user_pasword=user_pasword;
    	 }


		public int getUser1_id() {
			return user1_id;
		}


		public void setUser1_id(int user1_id) {
			this.user1_id = user1_id;
		}


		public String getUser1_name() {
			return user1_name;
		}


		public void setUser1_name(String user1_name) {
			this.user1_name = user1_name;
		}


		public String getUser_mail() {
			return user_mail;
		}


		public void setUser_mail(String user_mail) {
			this.user_mail = user_mail;
		}


		public String getUser_pasword() {
			return user_pasword;
		}


		public void setUser_pasword(String user_pasword) {
			this.user_pasword = user_pasword;
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
    
    

}
