/*
 * app.View.java
 * Copyright 2018 TALKER
 * https://github.com/talkertalker
 */

package app;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class View extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("JavaFX String Manipulation");
		
		//Instantiate layout nodes and controls:
		//---------------------------------------------------
		VBox root = new VBox(15);
		HBox row = new HBox(10);
		HBox row2 = new HBox(10);
		
		Label header = new Label("「s w a g・t e x t」");
		Label exp = new Label("Input some text in the left to be converted and click \"Convert.\"");
		Label userInLabel = new Label("Input:");
		Label userOutLabel = new Label("Output:");
		TextArea userIn = new TextArea();
		TextArea output = new TextArea();
		Button btn = new Button("Convert");
		
		root.getChildren().addAll(header,exp,row,row2,btn);
		
		//Append nodes to HBox row & HBox row2:
		//---------------------------------------------------
		row.getChildren().addAll(userInLabel,userOutLabel);
		row2.getChildren().addAll(userIn,output);

		//Add style classes to nodes:
		//---------------------------------------------------
		root.getStyleClass().add("root");
		row.getStyleClass().add("row");
		userInLabel.getStyleClass().add("userInLabel");
		userOutLabel.getStyleClass().add("userOutLabel");
		row2.getStyleClass().add("row");
		header.getStyleClass().add("header");
		exp.getStyleClass().add("exp");
		userIn.getStyleClass().add("userInTextField");
		userIn.setWrapText(true);
		output.getStyleClass().add("userOutTextField");
		output.setWrapText(true);
		output.setEditable(false);
		btn.getStyleClass().add("btn");
		
		//Create scene and set to stage:
		//---------------------------------------------------
		Scene scene = new Scene(root, 720, 300);
		primaryStage.setMinHeight(300);
		primaryStage.setMinWidth(720);
		primaryStage.setMaxHeight(500);
		primaryStage.setMaxWidth(920);
		primaryStage.setScene(scene);
		primaryStage.setResizable(true);
		
		//Set event handler for button click:
		//---------------------------------------------------
		btn.setOnMouseClicked(e -> ApplicationMethods.convertText(userIn, output));
		
		//Connect CSS and show():
		//---------------------------------------------------
		root.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
		primaryStage.show();
	}

	//Default Java Main entry point:
	//---------------------------------------------------------
	public static void main(String[] args){launch(args);}

}