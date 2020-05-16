package appl;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;

public class MyClock extends Application{
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage)throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600);
        primaryStage.setTitle("My Clock");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

        final int w = 400;
        final int h = 400;
        Canvas canvas = new Canvas(w, h);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawClockFace(gc, w, h);
        root.getChildren().add(canvas);

    private void drawClockFace(GraphicsContext gc, int w, int h){
        int offsetX = w/2; int offsetY = h/2;
        int r1 = (offsetX)>offsetY?(offsetY-5):(offsetX-5);
        int r2 = r1 - 10;
        for (int i=1; i<=12; i++){
            double th = getHourAngle(i);
            double x1 = r1*Math.cos(th); double y1 = r1*Math.sin(-th);
            double x2 = r2*Math.cos(th); double y2 = r2*Math.sin(-th);
            gc.strokeLine(x1+offsetX, y1+offsetY, x2+offsetX, y2+offsetY);
        }
    }

    private double getHourAngle(int hour){
        int pos = (15-hour)%12;
        return pos*Math.PI/6;
    }

        MyTime curTime = oop.MyClock.reportTime();

        MyTime curTime = oop.MyClock.reportTime();
        drawMinuteHand(curTime.getMinute(), gc, w, h);
		
    private void drawMinuteHand(int minute, GraphicsContext gc, int w, int h) {
        int offsetX = w/2; int offsetY = h/2;
        int r1 = (offsetX)>offsetY?(offsetY-7):(offsetX-7);
        double th = getMinuteAngle(minute);
        double x1 = r1*Math.cos(th); double y1 = r1*Math.sin(-th);
        gc.setStroke(Color.BLUE);
        gc.strokeLine(offsetX, offsetY, x1+offsetX, y1+offsetY);
    }
    private double getMinuteAngle(int minute) {
        int pos = (75-minute)%60;
        return pos*Math.PI/30;
    }
	
        MyTime curTime = oop.MyClock.reportTime();
        drawMinuteHand(curTime.getMinute(), gc, w, h);
        drawHourHand(curTime, gc, w, h);

    private void drawHourHand(MyTime time, GraphicsContext gc, int w, int h) {
        int offsetX = w/2; int offsetY = h/2;
        int r1 = (offsetX)>offsetY?(offsetY-50):(offsetX-50);
        double th = getHourAngle(time.getHour());
        double adj = getHourAngleAdjustment(time.getMinute());
        th-=adj;
        double x1 = r1*Math.cos(th); double y1 = r1*Math.sin(-th);
        gc.setStroke(Color.RED);
        gc.setLineWidth(5);
        gc.strokeLine(offsetX, offsetY, x1+offsetX, y1+offsetY);
    }
    private double getHourAngleAdjustment(int minute) {
        // 2pi/12 * m/60
        return minute*Math.PI/720;
    }

        MyTime curTime = getSpecifiedTime();
        if (curTime==null) {
            curTime = oop.MyClock.reportTime();
        }

    private MyTime getSpecifiedTime() {
        if (getParameters().getRaw().size()==2) {
            String s1 = getParameters().getRaw().get(0);
            String s2 = getParameters().getRaw().get(1);
            return new MyTime(Integer.parseInt(s1), Integer.parseInt(s2), 0);
        }
        return null;
    }