/*
Facade pattern hides the complexities of the system and provides an
interface to the client using which the client can access the system.
This type of design pattern comes under structural pattern as this
pattern adds an interface to existing system to hide its complexities.
 */
public class Main {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}