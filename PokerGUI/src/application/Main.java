package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage mainStage) {
		try {
			BorderPane root = new BorderPane();
			Scene table = new Scene(root,500,500);
			table.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			mainStage.setScene(table);
			mainStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
