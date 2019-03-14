/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

/**
 * FXML Controller class
 *
 * @author Gherni
 */
public class MapController implements Initializable {
    public static AnchorPane anchorNoa;
    public static MapController mapNoa;
    public static Circle c;
    double x,y;
    @FXML
    private ImageView imgNoa;
    @FXML
    private AnchorPane apNoa;
    @FXML
    private ScrollPane scrollNoa;
    @FXML
    private ImageView imgTpa1;
    public Pane dr;
    public double xt,yt;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        anchorNoa = apNoa;
        mapNoa = this;
    }    

    @FXML
    private void handleClick(MouseEvent event) {
////        System.out.println(event.getX()+" "+event.getY());
////        System.out.println(imgNoa.getImage().getHeight()+" "+scrollNoa.getVvalue()+" "+scrollNoa.getHeight());
//        System.out.println(event.getScreenX()+" "+event.getScreenY());
        double offset= (imgNoa.getImage().getHeight()-scrollNoa.getHeight())*scrollNoa.getVvalue();
        c = new Circle(event.getX(),event.getY()-offset,5);
////        Line line = new Line(0,0,event.getX(),event.getY());
        c.setFill(null);
//        //#244c66
        String color = "#000000";
//        String color = "#008080";
        c.setStroke(Color.valueOf(color));
        c.setStrokeWidth(2);
        xt=event.getX();
        yt=event.getY();
        Line l = new Line(event.getX(),event.getY()-offset-8,event.getX(),event.getY()-offset+8);
       
        l.setStroke(Color.valueOf(color));
        l.setStrokeWidth(2);
        Line l2 = new Line(event.getX()-8,event.getY()-offset,event.getX()+8,event.getY()-offset);
       
        l2.setStroke(Color.valueOf(color));
        l2.setStrokeWidth(2);
        apNoa.getChildren().add(l);
        apNoa.getChildren().add(l2);
        apNoa.getChildren().add(c);
//        dr = new Pane();
//        dr.setPrefSize(1300,900);
//        
//        dr.setStyle("-fx-background-color: transparent;");
//        dr.getChildren().add(c);
//        
//        scrollNoa.setContent(dr);
//        scrollNoa.setContent(imgNoa);
//        System.out.println("ahora lo saco");
//System.out.println(apNoa.getChildren().size());
        if(apNoa.getChildren().size()==7){
            apNoa.getChildren().remove(1);
            apNoa.getChildren().remove(1);
            apNoa.getChildren().remove(1);
////            apNoa.getChildren().remove(4);
        }
//        apNoa.getChildren().remove(c);
    }
 
    public Circle getC(){
        return c;
    }

    @FXML
    private void handleNoaScroll(MouseEvent event) {
//        System.out.println(event.getX()+" "+event.getY());
//        c = new Circle(event.getX(),event.getY(),5);
//////        Line line = new Line(0,0,event.getX(),event.getY());
//        c.setFill(null);
////        #244c66
//        c.setStroke(Color.valueOf("#008080"));
//        c.setStrokeWidth(2);
//        Image im = imgNoa.getImage();
//        Canvas c = new Canvas(1300,700);
//        setCanvas(c,im);
//        GraphicsContext gc = c.getGraphicsContext2D();
//        gc.fillOval(event.getX(), event.getY(), event.getX()+20,event.getY()+ 20);
//        imgNoa.setImage(im);
    }
    private void setCanvas(Canvas canvas, Image img){
            GraphicsContext gc = canvas.getGraphicsContext2D();
            gc.drawImage(img,0,0,canvas.getWidth(),canvas.getHeight());
        }
    
}
