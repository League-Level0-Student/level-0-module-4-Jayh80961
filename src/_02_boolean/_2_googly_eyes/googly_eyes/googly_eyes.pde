PImage face;
void setup() {
  face = loadImage("download.jpg");
  size(500, 500);
  face.resize(500,500);
}

void draw() {
    background(face);
    fill(255,255,255);
    ellipse(145,106,115,115);
    ellipse(267,123,130,130);
    fill(0,0,0);
    ellipse(mouseX,mouseY,50,50);
    ellipse(mouseX+122,mouseY+17,50,50);
    if(50<=mouseX&&mouseX>=165){
       mouseX = 145;
    }
}
