package genart;

import processing.core.PApplet;
import processing.event.KeyEvent;

public class Main extends PApplet {
    boolean debugMode;

    @Override
    public void setup(){
    }

    @Override
    public void settings(){
        size(480, 360);
        debugMode = true;
    }

    @Override
    public void draw(){
        background(0xff000000);
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
    }

    public static void main(String[] args) {
        PApplet.main("genart.Main");
    }
}