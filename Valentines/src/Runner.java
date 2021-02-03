

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Runner extends Application {

	@Override
	public void start(Stage mainStage) throws Exception {

		Scene scene = new Scene(mainPane(), 600, 500);

		mainStage.setScene(scene);
		mainStage.setTitle("Your Valentine");
		mainStage.show();

	}
	public Pane mainPane () {
		Pane root = new Pane();
		root.setStyle("-fx-background-color: pink;");
		HBox container1 = new HBox();
		container1.setAlignment(Pos.CENTER);
		container1.setMinWidth(600);
		VBox container2 = new VBox(10);
		container2.setAlignment(Pos.CENTER);
		container2.setMinHeight(500);
		Label label = new Label("Will you be my Valentine?");
		label.setFont(Font.font("Verdana", 25));
		label.setTextFill(Color.WHITE);
		Button yes = new Button ("Option 1");
		Button no = new Button ("Option 2");
		Button reset = new Button ("Reset");
		reset.setVisible(false);
		yes.setMinWidth(100);
		yes.setOnAction(e->{
			label.setText("Sweet.");
			yes.setVisible(false);
			no.setVisible(false);
			reset.setVisible(true);
		});
		
		no.setMinWidth(100);
		no.setOnAction(e->{
			label.setText("Go fuck yourself.");
	
			yes.setVisible(false);
			no.setVisible(false);
			reset.setVisible(true);
		});
		reset.setOnAction(e->{
			label.setText("Will you be my Valentine?");
			yes.setVisible(true);
			no.setVisible(true);
			reset.setVisible(false);
		});
		reset.setLayoutY(475);
		reset.setLayoutX(275);
		container2.getChildren().addAll(label, yes, no);
		container1.getChildren().add(container2);
		root.getChildren().addAll(container1, reset);
		return root;
	}
	public static void main (String[] args) {
		Application.launch(args);
	}

}
