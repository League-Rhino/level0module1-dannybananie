int x = 500;
int y = 500;


int x2 = 700;
int y2 = 500;



void setup() {

  size(1000, 1000);


}

void draw(){
background(#FFC800);
    for (int i = 10; i > 0; i--) {

    ellipse(x, y, i * 10, i * 10);
  }
  
  x++;

for (int i = 10; i > 0; i--){
  
  ellipse(x2,y2,i * 10, i * 10);
  
}
x2--;

}
