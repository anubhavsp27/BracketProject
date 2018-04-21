package application;
	



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;


public class Main extends Application {

	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			
			
			primaryStage.setTitle("Bracket Application");
			
			
			
			Button btn = new Button();
			
			btn.setText("Oh wow, I did a JavaFX!");
			
			btn.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					System.out.println("Why do I have to put this print statement here");
				}
				
			});
			
			//Stackpane for the banner
			StackPane paneRoot = new StackPane();
			paneRoot.getChildren().add(btn);
			
			FlowPane flow = new FlowPane();
			flow.setPadding(new Insets(10, 10, 10, 10));
			flow.setStyle("-fx-background-color: AAE6F3;");
			flow.setHgap(5);
			flow.getChildren().add(btn);
			
			//Gridpane shich allows flexibility
			GridPane grid = new GridPane();
			
			//Padding sets space around edge of window
			grid.setPadding(new Insets(10, 10, 10, 10));
			
			//Alignment of window set to center
			grid.setAlignment(Pos.CENTER);
			grid.setMinSize(300, 300);
			grid.setVgap(20);
			grid.setHgap(20);
			
			Button submitBtn = new Button(); 
			submitBtn.setText("Submit");
			submitBtn.setOnAction(new EventHandler<ActionEvent>() { 
				
				public void handle(ActionEvent event)  {
					System.out.println("TBD");
				}
			});
			
			//LEFT-HAND SIDE OF BRACKET
			
			Team team1 = new Team("Team 1");
			grid.add(team1.text, 0, 0);
			grid.add(team1.textField, 1, 0);
			grid.add(submitBtn, 2, 0);

			Team team2 = new Team("Team 2");
			grid.add(team2.text, 0, 8);
			grid.add(team2.textField, 1, 8);
			
			
			Team teamA = new Team("Team A");
			grid.add(teamA.text, 3, 4);
			grid.add(teamA.textField, 4 , 4);
			
			
			//RIGHT-HAND SIDE OF BRACKET
			
			Team team3 = new Team("Team 3");
			grid.add(team3.text, 12, 0);
			grid.add(team3.textField, 11, 0);
			

			Team team4 = new Team("Team 4");
			grid.add(team4.text, 12, 8);
			grid.add(team4.textField, 11, 8);
			
			
			Team teamB = new Team("Team B");
			grid.add(teamB.text, 8, 4);
			grid.add(teamB.textField, 7, 4);
			
			
			
			grid.setStyle("-fx-background-color: #F8BFD1;");
			
			
			//BorderPane containing flow and grid pane as elements
			BorderPane pane = new BorderPane();
			pane.setTop(flow);
			pane.setCenter(grid);

			Scene scene = new Scene(pane,400,400);
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
}
