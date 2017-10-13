package DisplayDecorator;
import Display.Display;

public abstract class DisplayDecorator implements Display {
    private Display decoratedDisplay;

    public DisplayDecorator(Display decoratedDisplay) {
        this.decoratedDisplay = decoratedDisplay;
    }

    public void draw() {
        decoratedDisplay.draw();
    }
}
