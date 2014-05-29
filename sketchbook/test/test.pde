void setup(){
  size(800,800);
  background(color(0,100,200));
  fill(255,255,255);
  stroke(0);
  rect(200,300,200,400);
  frameRate(120);
}
int x=0;
int y=0;
void draw(){
  fill(255,255,255);
  bend(x);
  if (y!= 0){
    noStroke();
    fill(0,255,255);
    ellipse(x,y,10,10);
  }
  x++;
}
void mouseClicked(){
  y=mouseY;
  x=mouseX;
  setup();
}
void bend(int x){
  if (x > 250){
    y--;
    x++;
  }
}

class Prism{
  int x;
  int y;
  int w;
  int h;
  public Prism(int _x,int _y,int _w, int _h){
    x=_x;
    y=_y;
    w=_w;
    h=_h;
  }
  void draw(){
    rect(x,y,w,h);
}
  
}
