package genart;

import genart.maths.vectors.Vector2D;
import genart.shapes.Polygon;
import processing.core.*;

public class Main extends PApplet {
    boolean debugMode;

    Polygon polygon = new Polygon(480/2, 360/2, 40, 3);

    @Override
    public void setup(){
        frameRate(30);
    }

    @Override
    public void settings(){
        size(480, 360);
        debugMode = true;
    }

    @Override
    public void draw(){
        background(0xff000000);

        stroke(0xFFFFFFFF);
        fill(0xFFFFFFFF);
        Vector2D[] v = polygon.getVertices();
        PShape p = createShape();
        p.beginShape();
        for(Vector2D vertex : v){
            p.vertex((float) vertex.x, (float) vertex.y);
        }
        p.endShape();
        shape(p);

        polygon.setAngle(polygon.getAngle() + Math.toRadians(0.1));

        if(debugMode) { displayDebug(); }
    }

    @Override
    public void keyPressed(){
        if (key == 'd' || key == 'D') {
            debugMode = !debugMode;
        }
    }

    private void displayDebug(){
        stroke(0xffffffff);
        text(String.format("Frame Rate: %.2f", frameRate), 0, 10);
        text(String.format("Polygon Angle: %.2f", Math.toDegrees(polygon.getAngle())), 0, 25);

        Vector2D[] vertices = polygon.getVertices();
        text("Polygon Vertices", 0, 40);
        for(int i = 0; i < vertices.length; i++){
            text("[" + i + String.format("] : ( %.2f , %.2f )", vertices[i].x, vertices[i].y), 10, i*15 + 55);
        }

        stroke(0xFFFF0000);
        Vector2D v = polygon.getPosition();
        line((float) v.x, (float) v.y, (float) (v.x + 50 * Math.cos(polygon.getAngle())), (float) (v.y + 50 * (Math.sin(polygon.getAngle()))));
        for(int i = 0; i < vertices.length; i++){
            fill(0xFFFF0000);
            stroke(0xFFFFFFFF);
            text(i, (float) vertices[i].x, (float) vertices[i].y);
        }
    }

    public static void main(String[] args) {
        PApplet.main("genart.Main");
    }
}