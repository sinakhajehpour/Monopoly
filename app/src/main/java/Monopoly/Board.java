package Monopoly;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

public class Board extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox1 = new VBox();
        VBox vbox2 = new VBox();
        VBox vbox3 = new VBox();
        VBox vbox4 = new VBox();
        for(int i=0;i<41;i++){
            Rectangle rec=makeRectangle();
            if(i<9){
                if(i==0 || i==1 || i==3){rec.setStyle("-fx-fill: orange; -fx-stroke: black; -fx-stroke-width: 1;");}
                if(i==5 || i==6 || i==8){rec.setStyle("-fx-fill: FUCHSIA; -fx-stroke: black; -fx-stroke-width: 1;");}
                vbox1.getChildren().add(rec);}
            else if(i>10 && i<20){
                if(i==11 || i==12 || i==14){rec.setStyle("-fx-fill: CHARTREUSE; -fx-stroke: black; -fx-stroke-width: 1;");}
                if(i==17|| i==19){rec.setStyle("-fx-fill: CORNFLOWERBLUE; -fx-stroke: black; -fx-stroke-width: 1;");}
                vbox2.getChildren().add(rec);}
            else if(i>21 && i<31){
                if(i==22|| i==24 || i==25){rec.setStyle("-fx-fill: yellow; -fx-stroke: black; -fx-stroke-width: 1;");}
                if(i==27|| i==28 || i==30){rec.setStyle("-fx-fill: red; -fx-stroke: black; -fx-stroke-width: 1;");}
                vbox3.getChildren().add(rec);}
            else if(i>31){
                if(i==32|| i==34){
                    rec.setStyle("-fx-fill: blue; -fx-stroke: black; -fx-stroke-width: 1;");}
                if(i==37||i==39 || i==40){rec.setStyle("-fx-fill: ALICEBLUE; -fx-stroke: black; -fx-stroke-width: 1;");}
                    vbox4.getChildren().add(rec);}
        }


        vbox1.setLayoutX(100);
        vbox1.setLayoutY(100);
        vbox2.setLayoutX(658);
        vbox2.setLayoutY(100);
        vbox3.setLayoutX(379);
        vbox3.setLayoutY(-179);
        vbox3.setRotate(90);
        vbox4.setLayoutX(379);
        vbox4.setLayoutY(379);
        vbox4.setRotate(90);


        Group root=new Group(vbox1,vbox2,vbox3,vbox4);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public Rectangle makeRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(51);
        rectangle.setWidth(90);
        rectangle.setStyle("-fx-fill: white; -fx-stroke: black; -fx-stroke-width: 1;");
        return rectangle;
    }
}
