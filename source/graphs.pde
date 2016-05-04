/*
 * graphs 1.0 4 May 2016
 *
 * Copyright (c) student number: 200976764
 * School of Geography, University of Leeds, Leeds, West Yorkshire, UK. LS2 9JT
 * All rights reserved.
 *
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/.
 */

/**
 * This Processing Source Code contains 40 methods for loading strings and integers from a table, drawing pie charts
 * and displaying a menu of using this application.
 *
 * @author 200976764 <lovezoro220@gmail.com>
 * @version 1.0 4 May 2016
 */

/**
 * A universal integer for the for-loops.
 */
int i;

/**
 * This method contains for-loops to get strings and integers from a table.
 */
void getPopDen() {
  textFont(createFont("High Tower Text", 15));
  Table setA = loadTable("pop.tsv", "header");
  text("Population (number)", width*0.74 ,30);
  
  for(i=0; i<setA.getRowCount(); i=i+1){
  TableRow rowA = setA.getRow(i);
  text(rowA.getString("district"), width*0.6, 50+20*i);
  }
  for(i=0; i<setA.getRowCount(); i=i+1){
  TableRow rowA = setA.getRow(i);
  text(rowA.getInt("1991"), width*0.75, 50+20*i);
  }
  for(i=0; i<setA.getRowCount(); i=i+1){
  TableRow rowA = setA.getRow(i);
  text(rowA.getInt("2011"), width*0.8, 50+20*i);
  }
}

/**
 * The following 18 methods draws the pie charts of 1991 population by age.
 */
void cenwes1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(425, 480, diameter, diameter, lastAngle, lastAngle+radians(cenwesC[i]));
    lastAngle += radians(cenwesC[i]);
  }
}

void wanchai1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(510, 480, diameter, diameter, lastAngle, lastAngle+radians(wanchaiC[i]));
    lastAngle += radians(wanchaiC[i]);
  }
}

void east1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(590, 510, diameter, diameter, lastAngle, lastAngle+radians(eastC[i]));
    lastAngle += radians(eastC[i]);
  }
}

void south1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(485, 560, diameter, diameter, lastAngle, lastAngle+radians(southC[i]));
    lastAngle += radians(southC[i]);
  }
}

void ytm1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(490, 380, diameter, diameter, lastAngle, lastAngle+radians(ytmC[i]));
    lastAngle += radians(ytmC[i]);
  }
}

void ssp1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(410, 340, diameter, diameter, lastAngle, lastAngle+radians(sspC[i]));
    lastAngle += radians(sspC[i]);
  }
}

void klncity1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(480, 280, diameter, diameter, lastAngle, lastAngle+radians(klncityC[i]));
    lastAngle += radians(klncityC[i]);
  }
}

void wts1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(560, 240, diameter, diameter, lastAngle, lastAngle+radians(wtsC[i]));
    lastAngle += radians(wtsC[i]);
  }
}

void ktong1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(590, 360, diameter, diameter, lastAngle, lastAngle+radians(ktongC[i]));
    lastAngle += radians(ktongC[i]);
  }
}

void ktsing1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(350, 260, diameter, diameter, lastAngle, lastAngle+radians(ktsingC[i]));
    lastAngle += radians(ktsingC[i]);
  }
}

void tsuwan1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(290, 180, diameter, diameter, lastAngle, lastAngle+radians(tsuwanC[i]));
    lastAngle += radians(tsuwanC[i]);
  }
}

void tuenmun1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(210, 250, diameter, diameter, lastAngle, lastAngle+radians(tuenmunC[i]));
    lastAngle += radians(tuenmunC[i]);
  }
}

void yl1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(260, 90, diameter, diameter, lastAngle, lastAngle+radians(ylC[i]));
    lastAngle += radians(ylC[i]);
  }
}

void north1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(450, 50, diameter, diameter, lastAngle, lastAngle+radians(northC[i]));
    lastAngle += radians(northC[i]);
  }
}

void taipo1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(600, 100, diameter, diameter, lastAngle, lastAngle+radians(taipoC[i]));
    lastAngle += radians(taipoC[i]);
  }
}

void shatin1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(470, 160, diameter, diameter, lastAngle, lastAngle+radians(shatinC[i]));
    lastAngle += radians(shatinC[i]);
  }
}

void saikung1(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(660, 260, diameter, diameter, lastAngle, lastAngle+radians(saikungC[i]));
    lastAngle += radians(saikungC[i]);
  }
}

void island1(float diameter, float[] data) {
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
void drawpie1 () {
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
void cenwes2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(425, 480, diameter, diameter, lastAngle, lastAngle+radians(cenwesD[i]));
    lastAngle += radians(cenwesD[i]);
  }
}

void wanchai2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(510, 480, diameter, diameter, lastAngle, lastAngle+radians(wanchaiD[i]));
    lastAngle += radians(wanchaiD[i]);
  }
}

void east2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(590, 510, diameter, diameter, lastAngle, lastAngle+radians(eastD[i]));
    lastAngle += radians(eastD[i]);
  }
}

void south2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(485, 560, diameter, diameter, lastAngle, lastAngle+radians(southD[i]));
    lastAngle += radians(southD[i]);
  }
}

void ytm2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(490, 380, diameter, diameter, lastAngle, lastAngle+radians(ytmD[i]));
    lastAngle += radians(ytmD[i]);
  }
}

void ssp2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(410, 340, diameter, diameter, lastAngle, lastAngle+radians(sspD[i]));
    lastAngle += radians(sspD[i]);
  }
}

void klncity2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(480, 280, diameter, diameter, lastAngle, lastAngle+radians(klncityD[i]));
    lastAngle += radians(klncityD[i]);
  }
}

void wts2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(560, 240, diameter, diameter, lastAngle, lastAngle+radians(wtsD[i]));
    lastAngle += radians(wtsD[i]);
  }
}

void ktong2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(590, 360, diameter, diameter, lastAngle, lastAngle+radians(ktongD[i]));
    lastAngle += radians(ktongD[i]);
  }
}

void ktsing2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(350, 260, diameter, diameter, lastAngle, lastAngle+radians(ktsingD[i]));
    lastAngle += radians(ktsingD[i]);
  }
}

void tsuwan2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(290, 180, diameter, diameter, lastAngle, lastAngle+radians(tsuwanD[i]));
    lastAngle += radians(tsuwanD[i]);
  }
}

void tuenmun2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(210, 250, diameter, diameter, lastAngle, lastAngle+radians(tuenmunD[i]));
    lastAngle += radians(tuenmunD[i]);
  }
}

void yl2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(260, 90, diameter, diameter, lastAngle, lastAngle+radians(ylD[i]));
    lastAngle += radians(ylD[i]);
  }
}

void north2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(450, 50, diameter, diameter, lastAngle, lastAngle+radians(northD[i]));
    lastAngle += radians(northD[i]);
  }
}

void taipo2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(600, 100, diameter, diameter, lastAngle, lastAngle+radians(taipoD[i]));
    lastAngle += radians(taipoD[i]);
  }
}

void shatin2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(470, 160, diameter, diameter, lastAngle, lastAngle+radians(shatinD[i]));
    lastAngle += radians(shatinD[i]);
  }
}

void saikung2(float diameter, float[] data) {
  float lastAngle = 0;
  for (i = 0; i < data.length; i++) {
    float gray = map(i, 0, data.length, 0, 255);
    fill(gray);
    arc(660, 260, diameter, diameter, lastAngle, lastAngle+radians(saikungD[i]));
    lastAngle += radians(saikungD[i]);
  }
}

void island2(float diameter, float[] data) {
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
void drawpie2 () {
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
void menu() {
  textFont(createFont("High Tower Text", 15));
  fill(255);
   text("Press & Hold: ", width*0.6, height*0.7);
   text("'a' to view 1991 Population by Age", width*0.6, height*0.73);
   text("'b' to view 2011 Population by Age", width*0.6, height*0.76);
   text("*Age groups (0-14, 15-24, 25-44, 45-64, 65+) are represented from darkest shade", width*0.6, height*0.79);
   text("  to lightest shade respectively.", width*0.6, height*0.82);
   text("'c' to view Hong Kong Disctict Coulcil District Map", width*0.6, height*0.85);
}