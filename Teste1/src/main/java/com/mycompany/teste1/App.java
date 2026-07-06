package com.mycompany.teste1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        
        
        
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
 /* Códigos de alinhamento e espaçamento

root.setAlignment(Pos.CENTER);
root.setHgap(20);
root.setVgap(20);
 */
 /* Sétimo código
TilePane root = new TilePane();

        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        
        root.getChildren().add(new Text("Componente1"));
        root.getChildren().add(new Text("Componente2"));
        root.getChildren().add(new Text("Componente3"));
        root.getChildren().add(new Text("Componente4"));
        
        root.setTileAlignment(Pos.CENTER);
 */
 /* Oitavo código
SplitPane root = new SplitPane();

        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        
        root.setOrientation(Orientation.VERTICAL);
        root.setOrientation(Orientation.HORIZONTAL);
        root.getItems().add(new Text("Componente1"));
        root.getItems().add(new Text("Componente2"));
        root.getItems().add(new Text("Componente3"));
        root.getItems().add(new Text("Componente4"));
 */
 /* Nono código
BorderPane root = new BorderPane();
        
        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        
        root.setTop(new Text("Componente1"));
        
        GridPane campos = new GridPane();
        campos.add(new Label("Login:"), 0, 0);
        campos.add(new TextField(), 1, 0);
        campos.add(new Label("Senha:"), 0, 1);
        campos.add(new TextField(), 1, 1);
        
        root.setCenter(campos);
        
        HBox botoes = new HBox();
        botoes.getChildren().add(new Button("Login"));
        botoes.getChildren().add(new Button("Cancelar"));
        root.setBottom(botoes);
 */
 /* Décimo código
VBox root = new VBox();
        
        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        
        Font fTitulo = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 30);
        Font fCampos = Font.font("Verdana", FontWeight.NORMAL, FontPosture.ITALIC, 20);
        
        Label titulo = new Label("Login");
        Label usuario = new Label("Usuário");
        Label senha = new Label("Senha");
        
        titulo.setFont(fTitulo);
        usuario.setFont(fCampos);
        senha.setFont(fCampos);
        senha.setTextFill(Color.RED);
        
        
        
        root.getChildren().add(titulo);
        root.getChildren().add(usuario);
        root.getChildren().add(senha);
 */
 /* Décimo Primeiro código
PassordField campoSenha = new PasswordField();
camposSenha.setFont(fInput);
campos.add(camposSenha, 1,1);
 */
 /* Décimo Segundo código
Label atividades = new Label("Atividades:");
        
        CheckBox leitura = new CheckBox("Leitura");
        CheckBox ciclismo = new CheckBox("Ciclismo");
        CheckBox track = new CheckBox("Track");
        CheckBox corrida = new CheckBox("Corrida");
        
        root.getChildren().addAll(atividades, leitura, ciclismo, track, corrida);
 */
 /* Décimo terceiro código
Label contrato = new Label("Concorda com o contrato");
        
        RadioButton concordo = new RadioButton("Sim");
        RadioButton disconcordo = new RadioButton("Não");

        ToggleGroup opcoes = new ToggleGroup();
          concordo.setToggleGroup(opcoes);
          disconcordo.setToggleGroup(opcoes);
        
        root.getChildren().addAll(contrato, concordo, disconcordo);
 */
/* Décimo quarto código
TextArea observacoes = new TextArea();
        observacoes.setPrefSize(400, 300);
        observacoes.setWrapText(true);
        
        root.getChildren().add(observacoes);
*/
/* Décimo quinto código
ObservableList<String> lista = FXCollections.observableArrayList("Informática", "Vestuário", "Adiministração");
        ListView<String> minhaListagem = new ListView<String>(lista);
        
        root.getChildren().addAll(minhaListagem);
*/
/* Décimo sexto código
ButtonBar botoes = new ButtonBar();

Button confirmar = new Button("Confirmar");
Button cancelar = new Button("Cancelar");
botoes.getButtons().addAll(confirmar, cancelar);

 root.getChildren().addAll(botoes);
*/
/* Décimo sétimo código
VBox root = new VBox();
        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        
        Button btVoltar = new Button("Voltar");
        Button btConfirmar = new Button("Confirmar");
        Button btExcluir = new Button("Excluir");
        
        ButtonBar painelBt = new ButtonBar();
        painelBt.getButtons().addAll(btVoltar, btConfirmar, btExcluir);
        
        root.getChildren().add(painelBt);  
*/
/* Décimo oitavo código
VBox root = new VBox();
        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        
        TreeItem<String> cursos = new TreeItem<String>("Cursos");
        TreeItem<String> tecnicos = new TreeItem<String>("Técnicos");
        TreeItem<String> informatica = new TreeItem<String>("Informática");
        TreeItem<String> vestuario = new TreeItem<String>("Vestuário");
        TreeItem<String> adm = new TreeItem<String>("Administração");
        
        cursos.getChildren().add(tecnicos);
        tecnicos.getChildren().addAll(informatica, vestuario, adm);
        
        TreeView<String> cursosIfc = new TreeView<>(cursos);
        root.getChildren().add(cursosIfc);
*/
/* Décimo nono código
VBox root = new VBox();
        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        
        Spinner<Integer> mes = new Spinner<Integer>(1,12,1);
        root.getChildren().add(mes);
*/
/* Vigéssimo código
VBox root = new VBox();
        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);

Menu file = new Menu("Arquivo");
MenuItem novoArquivo = new MenuItem("Novo");
MenuItem abrir
*/