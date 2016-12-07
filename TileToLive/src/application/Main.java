package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
	
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,utility.ScreenUtility.screenWidth,utility.ScreenUtility.screenHieght);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setFullScreen(true);
			primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
			primaryStage.setScene(scene);
			primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
