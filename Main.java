package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			BorderPane root = new BorderPane();
			TabPane tabMenu = new TabPane();
			
		    Tab tab1 = new Tab("Eingabe");
		    Tab tab2 = new Tab("Ausgabe");
			 	
			tabMenu.getTabs().addAll(tab1, tab2);
			
			root.setTop(tabMenu);
			
			Label name = new Label("Erstellt von Leo");
			root.setBottom(name);
			
			
			
			//Tab1
			VBox box = new VBox(10);
			Label satz = new Label("Gebe einen Satz ein um zu überprüfen, wie oft der Buchstabe \"a\" darin vorkommt:");
			TextField input = new TextField();
			Button btn = new Button("Jetzt abschicken");
			
			
			box.getChildren().addAll(satz, input, btn);
			tab1.setContent(box);
			
			//Tab2
			Label output = new Label("Bitte einen Satz eingeben und über den Button abschicken....");
			tab2.setContent(output);
			tab1.setClosable(false);
			tab2.setClosable(false);
			
			
			btn.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					
					int value = aValue(input.getText());
					output.setText("Es existieren " + value + " a´s im Satz");
				}
			});
			
			
			Scene scene = new Scene(root,600,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	public int aValue(String satz) {
	
		int value = 0;
		for(int i = 0; i < satz.length(); i++) {
			
			if(satz.charAt(i) == 'a') {
				value++;
			}
		}
		return value;
	}
	
	
	
	
	
}
