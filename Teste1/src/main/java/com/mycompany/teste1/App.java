package com.mycompany.teste1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        FlowPane root = new FlowPane();

        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        
        root.setOrientation(Orientation.HORIZONTAL);
        root.getChildren().add(new Text("Componente1"));
        root.getChildren().add(new Text("Componente2"));
        root.getChildren().add(new Text("Componente3"));

        stage.setTitle("Sistema de teste");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}

/* Código inicial
var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();*/
 /* Primeiro código
Group bandeira = new Group();

        Rectangle verde = new Rectangle(0, 0, 200, 150);
        verde.setFill(Color.GREEN);
        bandeira.getChildren().add(verde);

        root.getChildren().add(bandeira);

        Polygon amarelo = new Polygon();
        amarelo.getPoints().addAll(new Double[]{
            20.0, 75.0,
            100.0, 10.0,
            180.0, 75.0,
            100.0, 140.0,});
        amarelo.setFill(Color.YELLOW);
        bandeira.getChildren().add(amarelo);

        Circle azul = new Circle(100, 75, 40);
        azul.setFill(Color.BLUE);
        bandeira.getChildren().add(azul);

        stage.setScene(scene);

        stage.setTitle("Sistema de teste");
        stage.show();*/
/*HBox root = new HBox(); horizontal*/
/*VBox root = new VBox(); vertical*/
/* Segundo código
Pane root = new Pane();
Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);

        Label texto1 = new Label("Texto1");
        texto1.setLayoutX(100);
        texto1.setLayoutY(50);

        Label texto2 = new Label("Texto2");
        texto2.setLayoutX(100);
        texto2.setLayoutY(100);

        root.getChildren().add(texto1);
        root.getChildren().add(texto2);

        stage.setTitle("Sistema de teste");
        stage.show();
    }
*/
/* Terceiro código
BorderPane root = new BorderPane();

        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);

        root.setTop(new Label("Topo da janela"));
        root.setBottom(new Label("Inferior da janela"));
        root.setCenter(new Label("Centro da janela"));
        root.setLeft(new Label("Equerda da janela"));
        root.setRight(new Label("Direita da janela"));

        stage.setTitle("Sistema de teste");
        stage.show();
    }
*/
/* Quarto código - Grades
GridPane root = new GridPane();

        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);

        root.add(new Label("Topo da janela"), 0, 0);
        root.add(new Label("Inferior da janela"), 1, 1);
        root.add(new Label("Centro da janela"), 2, 2);
        root.add(new Label("Equerda da janela"), 3, 3);
        root.add(new Label("Direita da janela"), 4, 4);

        stage.setTitle("Sistema de teste");
        stage.show();
*/
/* Quinto código
AnchorPane root = new AnchorPane();

        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        
        Text component = new Text("Componente1");
        AnchorPane.setRightAnchor(component, 50.0);
        AnchorPane.setTopAnchor(component, 100.0);
        
        root.getChildren().add(component);

        stage.setTitle("Sistema de teste");
        stage.show();
    }
*/
/* Sexto código
FlowPane root = new FlowPane();

        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        
        root.setOrientation(Orientation.HORIZONTAL);
        root.setOrientation(Orientation.VERTICAL);
        root.getChildren().add(new Text("Componente1"));
        root.getChildren().add(new Text("Componente2"));
        root.getChildren().add(new Text("Componente3"));

        stage.setTitle("Sistema de teste");
        stage.show();
*/