class Card{
  String word;
  String definition;
  boolean wordUp;
  Card(String w, String d){
    word=w;
    definition=d;
    wordUp=true;
  }
  void printCard(){
     if (wordUp){
       text(word,300,300);
     }
     else{
       text(definition,200,350);
     }
  }
}
  
void setup(){
  size(800, 800);
  fill(255,255,255);
  background(20,200,255);
  rect(100,250,600,300);

}
Card c= new Card("puppies","small dogs that are cute");
void draw(){
  fill(0,0,0);
  textSize(32);
  c.printCard();
}
  
void mouseClicked(){
  if (mouseOnCard()){
    setup();
    c.wordUp=!c.wordUp;
  }
}
boolean mouseOnCard(){
  return (mouseX > 100 && mouseX <400) &&(mouseY >250 && mouseY< 400);
}
    


      
      
    
