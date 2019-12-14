package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	
	@Override
	public void start(Stage primaryStage) throws IOException {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("SlidedLogin.fxml"));
			//BorderPane root = new BorderPane();
			AnchorPane pane = loader.load();
			Scene scene = new Scene(pane);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
