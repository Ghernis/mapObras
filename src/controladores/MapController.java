/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.event.Event;
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
    public static AnchorPane anchorTBA;
    public static MapController mapContro;
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
    @FXML
    private AnchorPane transbaPane;
    @FXML
    private ImageView imgTBA;
    @FXML
    private ScrollPane scrollTBA;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        mapContro = this;
        anchorNoa = apNoa;
        anchorTBA=transbaPane;
    }    

    
    //click en noa
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

    }
    private void setCanvas(Canvas canvas, Image img){
            GraphicsContext gc = canvas.getGraphicsContext2D();
            gc.drawImage(img,0,0,canvas.getWidth(),canvas.getHeight());
    }

    @FXML
    private void handleClickTransba(MouseEvent event) {
        
    }

    @FXML
    private void handleClickTBA(MouseEvent event) {
        double offset= 277*scrollTBA.getVvalue();
        double offsetX = 73*scrollTBA.getHvalue();
        System.out.println(imgTBA.getImage().getHeight()+" "+scrollTBA.getHeight()+" "+transbaPane.getHeight());
//        System.out.println(offset);
//        System.out.println(offset);
//        System.out.println(imgTBA.getImage().getHeight()+" "+scrollTBA.getHeight()+" "+scrollTBA.getVvalue());
//        System.out.println(event.getX()+" "+event.getY());
        c = new Circle(event.getX()-offsetX,event.getY()-offset,5);
////        Line line = new Line(0,0,event.getX(),event.getY());
        c.setFill(null);
//        //#244c66
        String color = "#000000";
//        String color = "#008080";
        c.setStroke(Color.valueOf(color));
        c.setStrokeWidth(2);
        xt=event.getX();
        yt=event.getY();
        Line l = new Line(event.getX()-offsetX,event.getY()-offset-8,event.getX()-offsetX,event.getY()-offset+8);
       
        l.setStroke(Color.valueOf(color));
        l.setStrokeWidth(2);
        Line l2 = new Line(event.getX()-8-offsetX,event.getY()-offset,event.getX()+8-offsetX,event.getY()-offset);
       
        l2.setStroke(Color.valueOf(color));
        l2.setStrokeWidth(2);
        transbaPane.getChildren().add(l);
        transbaPane.getChildren().add(l2);
        transbaPane.getChildren().add(c);
//        dr = new Pane();
//        dr.setPrefSize(1300,900);
//        
//        dr.setStyle("-fx-background-color: transparent;");
//        dr.getChildren().add(c);
//        
//        scrollTBA.setContent(dr);
//        scrollTBA.setContent(imgTBA);
//        System.out.println("ahora lo saco");
//System.out.println(transbaPane.getChildren().size());
        if(transbaPane.getChildren().size()==7){
            transbaPane.getChildren().remove(1);
            transbaPane.getChildren().remove(1);
            transbaPane.getChildren().remove(1);
////            transbaPane.getChildren().remove(4);
        }
    }

  

    @FXML
    private void handleTabs(Event event) {
        System.out.println("cambio de panel");
        xt=0;
        yt=0;
    }
    
}
