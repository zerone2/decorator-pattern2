package DisplayDecorator;
import Display.*;

public class CrossingDecorator extends DisplayDecorator {

    public CrossingDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    public void draw() {
        super.draw();
        drawCrossing();
    }

    public void drawCrossing() {
        System.out.println("교차로 입니다.");
    }
}
