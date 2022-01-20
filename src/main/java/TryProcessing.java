import processing.core.PApplet;

public class TryProcessing extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int Part = HEIGHT / 5;
    public static final int DIAMETER = 10;
    int x1,x2,x3,x4=0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void draw() {
        // backgroundWhite();  //can un-comment this and check
        drawCircle();
    }

    private void drawCircle() {

        ellipse(x1, Part, DIAMETER,DIAMETER);
        x1++;
        ellipse(x2,2*Part, DIAMETER,DIAMETER);
        x2=x2+2;
        ellipse(x3,3*Part, DIAMETER,DIAMETER);
        x3=x3+3;
        ellipse(x4,4*Part, DIAMETER,DIAMETER);
        x4=x4+4;
    }


    private void backgroundWhite() {
        background(255);
    }
}
