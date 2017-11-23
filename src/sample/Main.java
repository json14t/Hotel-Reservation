package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Label textLbl = new Label();

        Button hotelNameBtn = new Button("Get hotel name" );
        hotelNameBtn.setText("Click here");
        hotelNameBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.print( "Test" );
                textLbl.setText( "Test Successful" );
            }
        });
        StackPane stackRoot = new StackPane();
        stackRoot.getChildren().add( hotelNameBtn );
        stackRoot.getChildren().add( textLbl );

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hotel Reservation");
        primaryStage.setScene(new Scene(stackRoot, 400, 375));
        primaryStage.show();





    }


    public static void main(String[] args) {
        launch(args);



        Hotel trump = new Hotel( "Trump Hotel", 350, 5 );
        System.out.println( trump.getHotelName() );

    }
}
