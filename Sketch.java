import processing.core.PApplet;

public class Sketch extends PApplet {
	
	float[] circleY = new float[100];

  int num = 100;
  int[] x = new int[num];
  int[] y = new int[num];




  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(300, 300);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    for (int i = 0; i < circleY.length; i++) {
     circleY[i] = random(height);
    }

    noStroke();

    fill(255, 102);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    background(50);

    for (int i = 0; i < circleY.length; i++) {
     float circleX = width * i / circleY.length;
     ellipse(circleX, circleY[i], 5, 5);
     
     circleY[i]++;

     if (circleY[i] > height) {
      circleY[i] = 0;
     }
    }

    for (int i = 0; i < num-1; i++) {
      x[i] = x[i+1];
      y[i] = y[i+1];
    }

    x[25] = mouseX;
    y[25] = mouseY;

    for (int i = 0; i < num; i++) {
      ellipse(x[i], y[i], i/2, i/2);
    }


  }

  
	  
	// sample code, delete this stuff

  
  
  // define other methods down here.
}