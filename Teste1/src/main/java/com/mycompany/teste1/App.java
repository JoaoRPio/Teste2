package com.mycompany.teste1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
       StackPane root = new StackPane();
       
       Scene scene = new Scene(root,640,480);
       
       Group bandeira = new Group();
       
       Rectangle verde = new Rectangle(0,0,200,150);
       verde.setFill(Color.GREEN);
       bandeira.getChildren().add(verde);
       
       root.getChildren().add(bandeira);
       
       Polygon amarelo = new Polygon();
       amarelo.getPoints().addAll(new Double[]{
        20.0, 75.0,
        100.0, 10.0,
        180.0, 75.0,
        100.0, 140.0,
    });
       amarelo.setFill(Color.YELLOW);
       bandeira.getChildren().add(amarelo);
       
       Circle azul = new Circle(100,75,40);
       azul.setFill(Color.BLUE);
       bandeira.getChildren().add(azul);
       
       
       
       stage.setScene(scene);
       
       stage.setTitle("Sistema de teste");
       stage.show();
       
     }  
    public static void main(String[] args) {
        launch();
        }
    
}
    
/*var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();*/