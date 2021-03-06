package application;
import com.sun.prism.paint.Color;

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
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
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
			grid.setHgap(20);
			grid.setVgap(20);
			grid.setGridLinesVisible(true);
			
			Button submitBtn = new Button(); 
			submitBtn.setText("Submit");
			submitBtn.setOnAction(new EventHandler<ActionEvent>() { 
				
				public void handle(ActionEvent event)  {
					System.out.println("TBD");
				}
			});
			
			Button submitBtn2 = new Button(); 
			submitBtn.setText("Submit");
			submitBtn.setOnAction(new EventHandler<ActionEvent>() { 
				
				public void handle(ActionEvent event)  {
					System.out.println("TBD");
				}
			});
			
			Button submitBtn3 = new Button(); 
			submitBtn.setText("Submit");
			submitBtn.setOnAction(new EventHandler<ActionEvent>() { 
				
				public void handle(ActionEvent event)  {
					System.out.println("TBD");
				}
			});
			
			Button submitBtn4 = new Button(); 
			submitBtn.setText("Submit");
			submitBtn.setOnAction(new EventHandler<ActionEvent>() { 
				
				public void handle(ActionEvent event)  {
					System.out.println("TBD");
				}
			});
			Button submitBtn5 = new Button(); 
			submitBtn.setText("Submit");
			submitBtn.setOnAction(new EventHandler<ActionEvent>() { 
				
				public void handle(ActionEvent event)  {
					System.out.println("TBD");
				}
			});
			
			Button submitBtn6 = new Button(); 
			submitBtn.setText("Submit");
			submitBtn.setOnAction(new EventHandler<ActionEvent>() { 
				
				public void handle(ActionEvent event)  {
					System.out.println("TBD");
				}
			});
			
			Button submitBtn7 = new Button(); 
			submitBtn.setText("Submit");
			submitBtn.setOnAction(new EventHandler<ActionEvent>() { 
				
				public void handle(ActionEvent event)  {
					System.out.println("TBD");
				}
			});
			
			//LEFT-HAND SIDE OF BRACKET
			
			//matchup 1 v 8
			Team team1 = new Team("Team 1");
			HBox hTeam1=new HBox();
			team1.textField.setPrefWidth(80);
			hTeam1.getChildren().addAll(team1.text, team1.textField);
			team1.textField.setPromptText("Enter Score");
			
			Team team8 = new Team("Team 8");
			HBox hTeam8=new HBox();
			team8.textField.setPrefWidth(80);
			hTeam8.getChildren().addAll(team8.text, team8.textField);
			team8.textField.setPromptText("Enter Score");
			
			VBox challenge1=new VBox();
			challenge1.getChildren().addAll(hTeam1, hTeam8, submitBtn2);
			grid.add(challenge1, 0, 0);
			//grid.add(submitBtn2, 1, 0);
			
			
			
			
			//matchup 2 v 7
			Team team2 = new Team("Team 2");
			HBox hTeam2=new HBox();
			team2.textField.setPrefWidth(80);
			hTeam2.getChildren().addAll(team2.text, team2.textField);
			team2.textField.setPromptText("Enter Score");
			
			Team team7 = new Team("Team 7");
			HBox hTeam7=new HBox();
			team7.textField.setPrefWidth(80);
			hTeam7.getChildren().addAll(team7.text, team7.textField);
			team7.textField.setPromptText("Enter Score");
			
			VBox challenge2=new VBox();
			challenge2.getChildren().addAll(hTeam2, hTeam7, submitBtn3);
			grid.add(challenge2, 0, 2);
			//grid.add(submitBtn3, 1, 3);
			
			
			//winner of left side
			Team teamX = new Team("Team X");
			//HBox hTeamX= new HBox();
			//hTeamX.getChildren().addAll(teamX.text,teamX.textField);
			teamX.textField.setPrefWidth(80);
			VBox leftWinner = new VBox();
			leftWinner.getChildren().addAll(teamX.text, teamX.textField);
			grid.add(leftWinner, 2, 1);
			teamX.textField.setPromptText("Enter Score");
			grid.add(submitBtn, 3, 1);
			
			
			//RIGHT-HAND SIDE OF BRACKET
			
			//match up 3 v 6
			Team team3 = new Team("Team 3");
			HBox hTeam3=new HBox();
			team3.textField.setPrefWidth(80);
			hTeam3.getChildren().addAll(team3.textField, team3.text);
			team3.textField.setPromptText("Enter Score");
			
			Team team6 = new Team("Team 6");
			HBox hTeam6=new HBox();
			team6.textField.setPrefWidth(80);
			hTeam6.getChildren().addAll(team6.textField, team6.text);
			team6.textField.setPromptText("Enter Score");
			
			VBox challenge3=new VBox();
			challenge3.getChildren().addAll(hTeam3, hTeam6, submitBtn4);
			grid.add(challenge3, 6, 0);
			
			
			//match up 4 v 5
			Team team4 = new Team("Team 4");
			HBox hTeam4=new HBox();
			team4.textField.setPrefWidth(80);
			hTeam4.getChildren().addAll(team4.textField, team4.text);
			team4.textField.setPromptText("Enter Score");
			
			Team team5 = new Team("Team 5");
			HBox hTeam5=new HBox();
			team5.textField.setPrefWidth(80);
			hTeam5.getChildren().addAll(team5.textField, team5.text);
			team5.textField.setPromptText("Enter Score");
			
			VBox challenge4=new VBox();
			challenge4.getChildren().addAll(hTeam4, hTeam5, submitBtn5);
			grid.add(challenge4, 6, 2);
			
			
			//winner of right side 
			Team teamY = new Team("Team Y");
			teamY.textField.setPrefWidth(80);
			VBox rightWinner = new VBox();
			rightWinner.getChildren().addAll(teamY.text, teamY.textField);
			//grid.add(teamY.text, 8, 2);
			//grid.add(teamY.textField, 7, 2);
			grid.add(rightWinner, 4, 1);
			teamY.textField.setPromptText("Enter Score");
			
			
			//left intermediate match pup
			Team teamA = new Team("Team A");
			HBox hTeamA=new HBox();
			teamA.textField.setPrefWidth(80);
			hTeamA.getChildren().addAll(teamA.text, teamA.textField);
			teamA.textField.setPromptText("Enter Score");
			
			Team teamB = new Team("Team B");
			HBox hTeamB=new HBox();
			teamB.textField.setPrefWidth(80);
			hTeamB.getChildren().addAll(teamB.text, teamB.textField);
			teamB.textField.setPromptText("Enter Score");
			
			VBox challenge5=new VBox();
			challenge5.getChildren().addAll(hTeamA, hTeamB, submitBtn6);
			grid.add(challenge5, 1, 1);

			
			//right intermediate match up 
			Team teamC = new Team("Team C");
			HBox hTeamC=new HBox();
			teamC.textField.setPrefWidth(80);
			hTeamC.getChildren().addAll(teamC.textField, teamC.text);
			teamC.textField.setPromptText("Enter Score");
			
			Team teamD = new Team("Team D");
			HBox hTeamD=new HBox();
			teamD.textField.setPrefWidth(80);
			hTeamD.getChildren().addAll(teamD.textField, teamD.text);
			teamD.textField.setPromptText("Enter Score");
			
			VBox challenge6=new VBox();
			challenge6.getChildren().addAll(hTeamC, hTeamD, submitBtn7);
			grid.add(challenge6, 5, 1);
			
			
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