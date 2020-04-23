package appl;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class MyClock extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600);
        primaryStage.setTitle("My Clock");
        primaryStage.setScene(scene);
        final int w = 400;
        final int h = 400;
        Canvas canvas = new Canvas(w, h);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawClockFace(gc, w, h);
        root.getChildren().add(canvas);
        primaryStage.show();
    }

    
    private void drawClockFace(GraphicsContext gc, int w, int h) {
        int offsetX = w/2; int offsetY = h/2;
        int r1 = (offsetX)>offsetY?(offsetY-5):(offsetX-5);
        int r2 = r1 - 10;
        for (int i=1; i<=12; i++) {
            double th = getHourAngle(i);
            double x1 = r1*Math.cos(th); double y1 = r1*Math.sin(-th);
            double x2 = r2*Math.cos(th); double y2 = r2*Math.sin(-th);
            gc.strokeLine(x1+offsetX, y1+offsetY, x2+offsetX, y2+offsetY);
        }
    }

    private double getHourAngle(int hour) {
        int pos = (15-hour)%12;
        return pos*Math.PI/6;
    }
}