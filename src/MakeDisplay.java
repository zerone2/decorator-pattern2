import Display.*;
import DisplayDecorator.*;

public class MakeDisplay {
    public static void main(String[] args) {

        // 기본 도로 표시
        Display d1 = new RoadDisplay();
        d1.draw();
        System.out.println("");

        // 기본 도로 표시 + 차선 표시
        Display d2 = new LaneDecorator(new RoadDisplay());
        d2.draw();
        System.out.println("");

        // 기본 도로표시 + 차션 표시 + 교통정보 표시
        Display d3 = new TrafficDecorator(d2);
        d3.draw();
        System.out.println();

        // 기본 도로표시 + 차선표시 + 교통정보표시 + 교차로 표시
        Display d4 = new CrossingDecorator(d3);
        d4.draw();
    }
}
