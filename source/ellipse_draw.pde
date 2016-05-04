/*
 * ellipse_draw 1.0 4 May 2016
 *
 * Copyright (c) student number: 200976764
 * School of Geography, University of Leeds, Leeds, West Yorkshire, UK. LS2 9JT
 * All rights reserved.
 *
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/.
 */

/**
 * This Processing Source Code contains 20 methods.
 * First 18 methods draws ellipse animations to illustrate changes of population of 18 coulcil districts.
 *
 * @author 200976764 <lovezoro220@gmail.com>
 * @version 1.0 4 May 2016
 */
 
void drawyl(){
  if (ylA <= ylB) {
  ylA += 0.4;
  }
  background(0);
  fill(#357EC7, 40);
  stroke(#357EC7);
  ellipse(260, 90, ylA, ylA);
}

void drawcw() {
  if (cenwesA <= cenwesB) {
  cenwesA += 0.4;
  }
  fill(#FFF380, 40);
  stroke(#FFF380);
  ellipse(425, 480, cenwesA, cenwesA);
}

void drawwc() {
  if (wanchaiA >= wanchaiB) {
  wanchaiA -= 0.4;
  }
  fill(#FFFF00, 40);
  stroke(#FFFF00);
  ellipse(480, 500, wanchaiA, wanchaiA);
}

void draweast() {
  if (eastA <= eastB) {
  eastA += 0.4;
  }
  fill(#FF7F50, 40);
  stroke(#FF7F50);
  ellipse(575, 510, eastA, eastA);
}

void drawsouth() {
  if (southA <= southB) {
  southA += 0.4;
  }
  fill(#C48793, 40);
  stroke(#C48793);
  ellipse(485, 560, southA, southA);
}

void drawytm() {
  if (ytmA <= ytmB) {
  ytmA += 0.4;
  }
  fill(#CCFFFF, 40);
  stroke(#CCFFFF);
  ellipse(490, 380, ytmA, ytmA);
}

void drawssp() {
  if (sspA <= sspB) {
  sspA += 0.4;
  }
  fill(#E7A1B0, 40);
  stroke(#E7A1B0);
  ellipse(410, 340, sspA, sspA);
}

void drawklncity() {
  if (klncityA >= klncityB) {
  klncityA -= 0.4;
  }
  fill(#B6B6B4, 40);
  stroke(#B6B6B4);
  ellipse(480, 280, klncityA, klncityA);
}

void drawwts() {
  if (wtsA <= wtsB) {
  wtsA += 0.4;
  }
  fill(#7F525D, 40);
  stroke(#7F525D);
  ellipse(560, 240, wtsA, wtsA);
}

void drawktong() {
  if (ktongA <= ktongB) {
  ktongA += 0.4;
  }
  fill(#7E3817, 40);
  stroke(#7E3817);
  ellipse(590, 360, ktongA, ktongA);
}

void drawktsing() {
  if (ktsingA <= ktsingB) {
  ktsingA += 0.4;
  }
  fill(#54C571, 40);
  stroke(#54C571);
  ellipse(350, 260, ktsingA, ktsingA);
}

void drawtsuwan() {
  if (tsuwanA <= tsuwanB) {
  tsuwanA += 0.4;
  }
  fill(#BCE954, 40);
  stroke(#BCE954);
  ellipse(290, 180, tsuwanA, tsuwanA);
}

void drawtuenmun() {
  if (tuenmunA <= tuenmunB) {
  tuenmunA += 0.4;
  }
  fill(#59E817, 40);
  stroke(#59E817);
  ellipse(210, 250, tuenmunA, tuenmunA);
}

void drawnorth() {
  if (northA <= northB) {
  northA += 0.4;
  }
  fill(#F778A1, 40);
  stroke(#F778A1);
  ellipse(450, 50, northA, northA);
}

void drawtaipo() {
  if (taipoA <= taipoB) {
  taipoA += 0.4;
  }
  fill(#8EEBEC, 40);
  stroke(#8EEBEC);
  ellipse(600, 100, taipoA, taipoA);
}

void drawshatin() {
  if (shatinA <= shatinB) {
  shatinA += 0.4;
  }
  fill(#FFA62F, 40);
  stroke(#FFA62F);
  ellipse(470, 160, shatinA, shatinA);
}

void drawsaikung() {
  if (saikungA <= saikungB) {
  saikungA += 0.4;
  }
  fill(#7F4E52, 40);
  stroke(#7F4E52);
  ellipse(660, 260, saikungA, saikungA);
}

void drawisland() {
  if (islandA <= islandB) {
  islandA += 0.4;
  }
  fill(#F88017, 40);
  stroke(#F88017);
  ellipse(140, 450, islandA, islandA);
}

/**
 * This method groups the 18 ellipse animation methods together.
 */
void drawdist() {
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
void writedist() {
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