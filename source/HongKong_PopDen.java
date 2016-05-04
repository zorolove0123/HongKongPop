import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class HongKong_PopDen extends PApplet {

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
public void settings() {
  fullScreen();
}

/**
   * Called when the application is being initialised to set background and animation framerate.
   */
public void setup() {
  hkmap = loadImage("conmap.jpg"); 
  background(0);
  frameRate(8);
}

/**
   * To call 4 methods from other Processing Souce Code and draw the basic elements of this application.
   */
public void draw() {
  drawdist();
  writedist();
  getPopDen();
  menu();
}

/**
   * Called when desinated keys are pressed - to call methods from other Processing Souce Code.
   */
public void keyPressed() {
  if (key == 'a' || key == 'A') {
    drawpie1();
  } else if (key == 'b' || key == 'B') {
    drawpie2();
  } else if (key == 'c' || key == 'C') {
    image(hkmap, width*0.02f, height*0.02f);
  }
}

/**
 * The following 18 methods draws ellipse animations to illustrate changes of population of 18 coulcil districts.
 */
public void drawyl(){
  if (ylA <= ylB) {
  ylA += 0.4f;
  }
  background(0);
  fill(0xff357EC7, 40);
  stroke(0xff357EC7);
  ellipse(260, 90, ylA, ylA);
}

public void drawcw() {
  if (cenwesA <= cenwesB) {
  cenwesA += 0.4f;
  }
  fill(0xffFFF380, 40);
  stroke(0xffFFF380);
  ellipse(425, 480, cenwesA, cenwesA);
}

public void drawwc() {
  if (wanchaiA >= wanchaiB) {
  wanchaiA -= 0.4f;
  }
  fill(0xffFFFF00, 40);
  stroke(0xffFFFF00);
  ellipse(480, 500, wanchaiA, wanchaiA);
}

public void draweast() {
  if (eastA <= eastB) {
  eastA += 0.4f;
  }
  fill(0xffFF7F50, 40);
  stroke(0xffFF7F50);
  ellipse(575, 510, eastA, eastA);
}

public void drawsouth() {
  if (southA <= southB) {
  southA += 0.4f;
  }
  fill(0xffC48793, 40);
  stroke(0xffC48793);
  ellipse(485, 560, southA, southA);
}

public void drawytm() {
  if (ytmA <= ytmB) {
  ytmA += 0.4f;
  }
  fill(0xffCCFFFF, 40);
  stroke(0xffCCFFFF);
  ellipse(490, 380, ytmA, ytmA);
}

public void drawssp() {
  if (sspA <= sspB) {
  sspA += 0.4f;
  }
  fill(0xffE7A1B0, 40);
  stroke(0xffE7A1B0);
  ellipse(410, 340, sspA, sspA);
}

public void drawklncity() {
  if (klncityA >= klncityB) {
  klncityA -= 0.4f;
  }
  fill(0xffB6B6B4, 40);
  stroke(0xffB6B6B4);
  ellipse(480, 280, klncityA, klncityA);
}

public void drawwts() {
  if (wtsA <= wtsB) {
  wtsA += 0.4f;
  }
  fill(0xff7F525D, 40);
  stroke(0xff7F525D);
  ellipse(560, 240, wtsA, wtsA);
}

public void drawktong() {
  if (ktongA <= ktongB) {
  ktongA += 0.4f;
  }
  fill(0xff7E3817, 40);
  stroke(0xff7E3817);
  ellipse(590, 360, ktongA, ktongA);
}

public void drawktsing() {
  if (ktsingA <= ktsingB) {
  ktsingA += 0.4f;
  }
  fill(0xff54C571, 40);
  stroke(0xff54C571);
  ellipse(350, 260, ktsingA, ktsingA);
}

public void drawtsuwan() {
  if (tsuwanA <= tsuwanB) {
  tsuwanA += 0.4f;
  }
  fill(0xffBCE954, 40);
  stroke(0xffBCE954);
  ellipse(290, 180, tsuwanA, tsuwanA);
}

public void drawtuenmun() {
  if (tuenmunA <= tuenmunB) {
  tuenmunA += 0.4f;
  }
  fill(0xff59E817, 40);
  stroke(0xff59E817);
  ellipse(210, 250, tuenmunA, tuenmunA);
}

public void drawnorth() {
  if (northA <= northB) {
  northA += 0.4f;
  }
  fill(0xffF778A1, 40);
  stroke(0xffF778A1);
  ellipse(450, 50, northA, northA);
}

public void drawtaipo() {
  if (taipoA <= taipoB) {
  taipoA += 0.4f;
  }
  fill(0xff8EEBEC, 40);
  stroke(0xff8EEBEC);
  ellipse(600, 100, taipoA, taipoA);
}

public void drawshatin() {
  if (shatinA <= shatinB) {
  shatinA += 0.4f;
  }
  fill(0xffFFA62F, 40);
  stroke(0xffFFA62F);
  ellipse(470, 160, shatinA, shatinA);
}

public void drawsaikung() {
  if (saikungA <= saikungB) {
  saikungA += 0.4f;
  }
  fill(0xff7F4E52, 40);
  stroke(0xff7F4E52);
  ellipse(660, 260, saikungA, saikungA);
}

public void drawisland() {
  if (islandA <= islandB) {
  islandA += 0.4f;
  }
  fill(0xffF88017, 40);
  stroke(0xffF88017);
  ellipse(140, 450, islandA, islandA);
}

/**
 * This method groups the 18 ellipse animation methods together.
 */
public void drawdist() {
  drawyl();
  drawcw();
  drawwc();
  draweast();
  drawsouth();
  drawytm();
  drawssp();
  drawklncity();
  drawwts();
  drawktong();
  drawktsing();
  drawtsuwan();
  drawtuenmun();
  drawnorth();
  drawtaipo();
  drawshatin();
  drawsaikung();
  drawisland();
}

/**
 * This method writes the district councils' names.
 */
public void writedist() {
  textFont(createFont("High Tower Text", 20));
  fill(255);
  text("Central and Western", 340, 480);
  text("Wan Chai", 440, 505);
  text("Eastern", 545, 515);
  text("Southern", 445, 565);
  text("Yau Tsim Mong", 425, 385);
  text("Shum Shui Po", 350, 345);
  text("Kowloon City", 420, 285);
  text("Wong Tai Sin", 495, 245);
  text("Kwun Tong", 540, 365);
  text("Kwai Tsing", 300, 265);
  text("Tsuen Wan", 240, 185);
  text("Tuen Mun", 165, 255);
  text("Yuen Long", 220, 90);
  text("North", 425, 55);
  text("Tai Po", 575, 105);
  text("Sha Tin", 435, 165);
  text("Sai Kung", 620, 265);
  text("Island", 115, 455);
  textSize(40);
  text("Hong Kong Population Change 1991 - 2011", 100, 700);
}

/**
 * A universal integer for the for-loops.
 */
int i;

/**
 * This method contains for-loops to get strings and integers from a table.
 */
public void getPopDen() {
  textFont(createFont("High Tower Text", 15));
  Table setA = loadTable("pop.tsv", "header");
  text("Population (number)", width*0.74f ,30);
  
  for(i=0; i<setA.getRowCount(); i=i+1){
  TableRow rowA = setA.getRow(i);
  text(rowA.getString("district"), width*0.6f, 50+20*i);
  }
  for(i=0; i<setA.getRowCount(); i=i+1){
  TableRow rowA = setA.getRow(i);
  text(rowA.getInt("1991"), width*0.75f, 50+20*i);
  }
  for(i=0; i<setA.getRowCount(); i=i+1){
  TableRow rowA = setA.getRow(i);
  text(rowA.getInt("2011"), width*0.8f, 50+20*i);
  }
}

/**
 * The following 18 methods draws the pie charts of 1991 population by age.
 */
public void cenwes1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(425, 480, diameter, diameter, lastAngle, lastAngle+radians(cenwesC[i]));
    lastAngle += radians(cenwesC[i]);
  }
}

public void wanchai1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(510, 480, diameter, diameter, lastAngle, lastAngle+radians(wanchaiC[i]));
    lastAngle += radians(wanchaiC[i]);
  }
}

public void east1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(590, 510, diameter, diameter, lastAngle, lastAngle+radians(eastC[i]));
    lastAngle += radians(eastC[i]);
  }
}

public void south1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(485, 560, diameter, diameter, lastAngle, lastAngle+radians(southC[i]));
    lastAngle += radians(southC[i]);
  }
}

public void ytm1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(490, 380, diameter, diameter, lastAngle, lastAngle+radians(ytmC[i]));
    lastAngle += radians(ytmC[i]);
  }
}

public void ssp1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(410, 340, diameter, diameter, lastAngle, lastAngle+radians(sspC[i]));
    lastAngle += radians(sspC[i]);
  }
}

public void klncity1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(480, 280, diameter, diameter, lastAngle, lastAngle+radians(klncityC[i]));
    lastAngle += radians(klncityC[i]);
  }
}

public void wts1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(560, 240, diameter, diameter, lastAngle, lastAngle+radians(wtsC[i]));
    lastAngle += radians(wtsC[i]);
  }
}

public void ktong1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(590, 360, diameter, diameter, lastAngle, lastAngle+radians(ktongC[i]));
    lastAngle += radians(ktongC[i]);
  }
}

public void ktsing1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(350, 260, diameter, diameter, lastAngle, lastAngle+radians(ktsingC[i]));
    lastAngle += radians(ktsingC[i]);
  }
}

public void tsuwan1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(290, 180, diameter, diameter, lastAngle, lastAngle+radians(tsuwanC[i]));
    lastAngle += radians(tsuwanC[i]);
  }
}

public void tuenmun1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(210, 250, diameter, diameter, lastAngle, lastAngle+radians(tuenmunC[i]));
    lastAngle += radians(tuenmunC[i]);
  }
}

public void yl1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(260, 90, diameter, diameter, lastAngle, lastAngle+radians(ylC[i]));
    lastAngle += radians(ylC[i]);
  }
}

public void north1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(450, 50, diameter, diameter, lastAngle, lastAngle+radians(northC[i]));
    lastAngle += radians(northC[i]);
  }
}

public void taipo1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(600, 100, diameter, diameter, lastAngle, lastAngle+radians(taipoC[i]));
    lastAngle += radians(taipoC[i]);
  }
}

public void shatin1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(470, 160, diameter, diameter, lastAngle, lastAngle+radians(shatinC[i]));
    lastAngle += radians(shatinC[i]);
  }
}

public void saikung1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(660, 260, diameter, diameter, lastAngle, lastAngle+radians(saikungC[i]));
    lastAngle += radians(saikungC[i]);
  }
}

public void island1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(140, 450, diameter, diameter, lastAngle, lastAngle+radians(islandC[i]));
    lastAngle += radians(islandC[i]);
  }
}

/**
 * This method groups the previous 18 methods.
 */
public void drawpie1 () {
  cenwes1(80, cenwesC);
  wanchai1(80, wanchaiC);
  east1(80, eastC);
  south1(80, southC);
  ytm1(80, ytmC);
  ssp1(80, sspC);
  klncity1(80, klncityC);
  wts1(80, wtsC);
  ktong1(80, ktongC);
  ktsing1(80, ktsingC);
  tsuwan1(80, tsuwanC);
  tuenmun1(80, tuenmunC);
  yl1(80, ylC);
  north1(80, northC);
  taipo1(80, taipoC);
  shatin1(80, shatinC);
  saikung1(80, saikungC);
  island1(80, islandC);
}

/**
 * The following 18 methods draws the pie charts of 2011 population by age.
 */
public void cenwes2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(425, 480, diameter, diameter, lastAngle, lastAngle+radians(cenwesD[i]));
    lastAngle += radians(cenwesD[i]);
  }
}

public void wanchai2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(510, 480, diameter, diameter, lastAngle, lastAngle+radians(wanchaiD[i]));
    lastAngle += radians(wanchaiD[i]);
  }
}

public void east2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(590, 510, diameter, diameter, lastAngle, lastAngle+radians(eastD[i]));
    lastAngle += radians(eastD[i]);
  }
}

public void south2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(485, 560, diameter, diameter, lastAngle, lastAngle+radians(southD[i]));
    lastAngle += radians(southD[i]);
  }
}

public void ytm2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(490, 380, diameter, diameter, lastAngle, lastAngle+radians(ytmD[i]));
    lastAngle += radians(ytmD[i]);
  }
}

public void ssp2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(410, 340, diameter, diameter, lastAngle, lastAngle+radians(sspD[i]));
    lastAngle += radians(sspD[i]);
  }
}

public void klncity2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(480, 280, diameter, diameter, lastAngle, lastAngle+radians(klncityD[i]));
    lastAngle += radians(klncityD[i]);
  }
}

public void wts2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(560, 240, diameter, diameter, lastAngle, lastAngle+radians(wtsD[i]));
    lastAngle += radians(wtsD[i]);
  }
}

public void ktong2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(590, 360, diameter, diameter, lastAngle, lastAngle+radians(ktongD[i]));
    lastAngle += radians(ktongD[i]);
  }
}

public void ktsing2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(350, 260, diameter, diameter, lastAngle, lastAngle+radians(ktsingD[i]));
    lastAngle += radians(ktsingD[i]);
  }
}

public void tsuwan2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(290, 180, diameter, diameter, lastAngle, lastAngle+radians(tsuwanD[i]));
    lastAngle += radians(tsuwanD[i]);
  }
}

public void tuenmun2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(210, 250, diameter, diameter, lastAngle, lastAngle+radians(tuenmunD[i]));
    lastAngle += radians(tuenmunD[i]);
  }
}

public void yl2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(260, 90, diameter, diameter, lastAngle, lastAngle+radians(ylD[i]));
    lastAngle += radians(ylD[i]);
  }
}

public void north2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(450, 50, diameter, diameter, lastAngle, lastAngle+radians(northD[i]));
    lastAngle += radians(northD[i]);
  }
}

public void taipo2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(600, 100, diameter, diameter, lastAngle, lastAngle+radians(taipoD[i]));
    lastAngle += radians(taipoD[i]);
  }
}

public void shatin2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(470, 160, diameter, diameter, lastAngle, lastAngle+radians(shatinD[i]));
    lastAngle += radians(shatinD[i]);
  }
}

public void saikung2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(660, 260, diameter, diameter, lastAngle, lastAngle+radians(saikungD[i]));
    lastAngle += radians(saikungD[i]);
  }
}

public void island2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(140, 450, diameter, diameter, lastAngle, lastAngle+radians(islandD[i]));
    lastAngle += radians(islandD[i]);
  }
}

/**
 * This method groups the previous 18 methods.
 */
public void drawpie2 () {
  cenwes2(80, cenwesD);
  wanchai2(80, wanchaiD);
  east2(80, eastD);
  south2(80, southD);
  ytm2(80, ytmD);
  ssp2(80, sspD);
  klncity2(80, klncityD);
  wts2(80, wtsD);
  ktong2(80, ktongD);
  ktsing2(80, ktsingD);
  tsuwan2(80, tsuwanD);
  tuenmun2(80, tuenmunD);
  yl2(80, ylD);
  north2(80, northD);
  taipo2(80, taipoD);
  shatin2(80, shatinD);
  saikung2(80, saikungD);
  island2(80, islandD);
}

/**
 * This method writes out the menu of this application.
 */
public void menu() {
  textFont(createFont("High Tower Text", 15));
  fill(255);
   text("Press & Hold: ", width*0.6f, height*0.7f);
   text("'a' to view 1991 Population by Age", width*0.6f, height*0.73f);
   text("'b' to view 2011 Population by Age", width*0.6f, height*0.76f);
   text("*Age groups (0-14, 15-24, 25-44, 45-64, 65+) are represented from darkest shade", width*0.6f, height*0.79f);
   text("  to lightest shade respectively.", width*0.6f, height*0.82f);
   text("'c' to view Hong Kong Disctict Coulcil District Map", width*0.6f, height*0.85f);
}

/**
 * The following 36 float data of angles are for the pie charts of population by age.
 */
float[] cenwesC = { 63.39f, 47.45f, 144.08f, 69.31f, 35.78f };
float[] wanchaiC = { 56.55f, 40.06f, 141.82f, 79.24f, 42.33f };
float[] eastC = { 67.68f, 49.06f, 143.31f, 66.81f, 33.15f };
float[] southC = { 72.66f, 61.4f, 134.11f, 61.9f, 29.92f };
float[] ytmC = { 57.96f, 50.28f, 131.57f, 80.92f, 39.27f };
float[] sspC = { 62.26f, 49.56f, 132, 73.95f, 42.23f };
float[] klncityC = { 62.03f, 55.46f, 131.58f, 75.44f, 35.48f };
float[] wtsC = { 60.1f, 59.68f, 127.53f, 71.14f, 41.56f };
float[] ktongC = { 67.26f, 63.34f, 124.212f, 71.51f, 33.68f };
float[] ktsingC = { 74.03f, 69.48f, 123.44f, 66.73f, 26.32f };
float[] tsuwanC = { 68.7f, 63.53f, 138.11f, 66.19f, 23.47f };
float[] tuenmunC = { 110.81f, 47.34f, 145.36f, 39.43f, 17.06f };
float[] ylC = { 92.1f, 54.6f, 128.31f, 53.22f, 31.77f };
float[] northC = { 105.54f, 45.66f, 132.28f, 47.99f, 28.53f };
float[] taipoC = { 102.57f, 46.06f, 143.64f, 43.9f, 23.83f };
float[] shatinC = { 89.76f, 54.17f, 141.43f, 51.03f, 23.6f };
float[] saikungC = { 94.98f, 47.22f, 148.17f, 46.95f, 22.68f };
float[] islandC = { 72.54f, 61.81f, 131.83f, 53.91f, 39.91f };

float[] cenwesD = { 41.04f, 37.44f, 123.84f, 107.64f, 50.04f };
float[] wanchaiD = { 36.72f, 33.12f, 121.68f, 111.96f, 56.16f };
float[] eastD = { 37.8f, 39.24f, 108, 118.44f, 56.16f };
float[] southD = { 39.6f, 42.48f, 110.16f, 117.36f, 50.04f};
float[] ytmD = { 44.28f, 34.56f, 123.84f, 104.76f, 52.2f };
float[] sspD = { 41.4f, 42.12f, 106.92f, 108.36f, 61.2f };
float[] klncityD = { 41.4f, 39.96f, 113.04f, 108, 57.6f };
float[] wtsD = { 37.08f, 46.08f, 99.36f, 113.76f, 63.36f };
float[] ktongD = { 42.48f, 43.56f, 106.56f, 108.36f, 58.68f };
float[] ktsingD = { 40.68f, 46.8f, 110.16f, 109.44f, 52.92f };
float[] tsuwanD = { 46.44f, 38.88f, 117.72f, 110.16f, 46.44f };
float[] tuenmunD = { 39.96f, 48.24f, 115.2f, 121.68f, 34.92f };
float[] ylD = { 48.96f, 52.92f, 117.36f, 106.56f, 34.2f };
float[] northD = { 44.64f, 52.92f, 109.8f, 114.12f, 38.52f };
float[] taipoD = { 36.72f, 51.48f, 109.08f, 123.84f, 38.52f };
float[] shatinD = { 39.6f, 45.36f, 113.76f, 120.24f, 41.4f };
float[] saikungD = { 46.44f, 47.88f, 124.56f, 108.72f, 32.4f };
float[] islandD = { 53.64f, 45.72f, 120.6f, 105.12f, 34.92f };

/**
 * The following 18 float data are 1991 population by district in number. 
 * These numbera are being divided by 5000 to control the size of the ellipses being drawn.
 */
float cenwesA = 253383/5000;
float wanchaiA = 180309/5000;
float eastA = 560200/5000;
float southA = 257101/5000;
float ytmA = 282060/5000;
float sspA = 380615/5000;
float klncityA = 402934/5000;
float wtsA = 386572/5000;
float ktongA = 578502/5000;
float ktsingA = 440807/5000;
float tsuwanA = 271576/5000;
float tuenmunA = 380683/5000;
float ylA = 229724/5000;
float northA = 165666/5000;
float taipoA = 202117/5000;
float shatinA = 506368/5000;
float saikungA = 130418/5000;
float islandA = 47459/5000;

/**
 * The following 18 float data are 2011 population by district in number. 
 * These numbera are being divided by 5000 to control the size of the ellipses being drawn.
 */
float cenwesB = 251519/5000;
float wanchaiB = 152608/5000;
float eastB = 588094/5000;
float southB = 278655/5000;
float ytmB = 307878/5000;
float sspB = 380855/5000;
float klncityB = 377351/5000;
float wtsB = 420183/5000;
float ktongB = 622152/5000;
float ktsingB = 511167/5000;
float tsuwanB = 304637/5000;
float tuenmunB = 487546/5000;
float ylB = 578529/5000;
float northB = 304134/5000;
float taipoB = 296853/5000;
float shatinB = 630273/5000;
float saikungB = 436627/5000;
float islandB = 141327/5000;
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "HongKong_PopDen" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
