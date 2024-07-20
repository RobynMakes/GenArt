package org.robyn;

import processing.core.PApplet;

public class Main extends PApplet {
    @Override
    public void setup(){
    }

    @Override
    public void settings(){
        size(480, 360);
    }

    @Override
    public void draw(){
        background(0xFF000000);
    }

    public static void main(String[] args) {
        PApplet.main("org.robyn.Main");
    }
}