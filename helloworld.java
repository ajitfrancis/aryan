import acm.program.*;
import acm.graphics.*;
import java.awt.Color;

public class helloworld extends GraphicsProgram {
	public void run() {
		GLabel Label= new GLabel("Hello World" , 100, 75);
		Label.setFont("sansSerif=36");
		Label.setColor(Color.RED);
		add(Label);
		
		GRect Rect1 = new GRect(10,10,50,50);
		add(Rect1);
		
		GRect Rect2 = new GRect(200,100,150,100);
		Rect2.setFilled(true);
		Rect2.setFillColor(Color.RED);
		add(Rect2);
		
		GOval Oval = new GOval(200,100,150,100);
		Oval.setFilled(true);
		Oval.setFillColor(Color.GREEN);
		add(Oval);
		
		GLine Line = new GLine(100,100,200,300);
		add(Line);
	}

}
