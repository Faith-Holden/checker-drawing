package solution;

import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


//The contents of the drawPicture class are original work. The rest was created by the textbook author.
//At this point in the textbook, students were not expected to be able to make a complete javafx application.

public class CheckerDrawing extends Application {

    public void drawPicture(GraphicsContext g, int width, int height) {
        g.setFill(Color.ANTIQUEWHITE);
        g.fillRect(0,0,width,height);
        g.setFill(Color.BLACK);
        for(int i=0; i<450; i=i+50){
            for (int j=0; j<450;j=j+50){
                if((i%100==0&&j%100==0)||(i%100!=0&&j%100!=0)){
                    g.fillRect(i-50,j-50, 50, 50);
                }
            }
        }
    }



//Everything below this line was made by the textbook's author.

    //------ Implementation details: DO NOT EXPECT TO UNDERSTAND THIS ------


    public void start(Stage stage) {
        int width = 400;   // The width of the image.  You can modify this value!
        int height = 400;  // The height of the image. You can modify this value!
        Canvas canvas = new Canvas(width,height);
        drawPicture(canvas.getGraphicsContext2D(), width, height);
        BorderPane root = new BorderPane(canvas);
        root.setStyle("-fx-border-width: 4px; -fx-border-color: #444");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Simple Graphics"); // STRING APPEARS IN WINDOW TITLEBAR!
        stage.show();
        stage.setResizable(false);
    }

    public static void main(String[]args) {
        launch();
    }

} // end SimpleGraphicsStarter
