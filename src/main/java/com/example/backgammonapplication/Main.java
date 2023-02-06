package com.example.backgammonapplication;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    // sets size of tiles on board
    public static final int Tile_Size = 75;
    public static final int width = 10;
    public static final int height = 10;

    // sets size of board. Dynamic. +80 to add space for buttons
    private Group tileGroup = new Group();
    private Parent addASceneHere() {
        StackPane root = new StackPane();
        root.setPrefSize(width*Tile_Size, (height * Tile_Size)+80);
        root.getChildren().addAll(tileGroup);
        return root;

    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Scene scene = new Scene (addASceneHere());
        primaryStage.setTitle("Backgammon");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args);}


}
