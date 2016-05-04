/*
 * HongKong_PopDen.java 1.0 4 May 2016
 *
 * Copyright (c) student number: 200976764
 * School of Geography, University of Leeds, Leeds, West Yorkshire, UK. LS2 9JT
 * All rights reserved.
 *
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/.
 */

/**
 * This application contains a map with animation, showing Hong Kong's population change from 1991-2011.
 * It also contains relevant information including a population statistics table, pie charts of population by age 
 * and a district map to help understanding changes in demographics of Hong Kong.
 *
 * This class contains settings, setup, draw and keypressed methods.
 * @author 200976764 <lovezoro220@gmail.com>
 * @version 1.0 4 May 2016
 */

PImage hkmap;

/**
   * Called when the application is being initialised to set the screen size.
   */
void settings() {
  fullScreen();
}

/**
   * Called when the application is being initialised to set background and animation framerate.
   */
void setup() {
  hkmap = loadImage("conmap.jpg"); 
  background(0);
  frameRate(8);
}

/**
   * To call 4 methods from other Processing Souce Code and draw the basic elements of this application.
   */
void draw() {
  drawdist();
  writedist();
  getPopDen();
  menu();
}

/**
   * Called when desinated keys are pressed - to call methods from other Processing Souce Code.
   */
void keyPressed() {
  if (key == 'a' || key == 'A') {
    drawpie1();
  } else if (key == 'b' || key == 'B') {
    drawpie2();
  } else if (key == 'c' || key == 'C') {
    image(hkmap, width*0.02, height*0.02);
  }
}