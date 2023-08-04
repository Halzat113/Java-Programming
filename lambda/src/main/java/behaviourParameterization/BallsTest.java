package behaviourParameterization;

import java.util.ArrayList;
import java.util.List;
public class BallsTest {
    public static void main(String[] args) {
        List<Balls> balls = new ArrayList<>();
        balls.add(new Balls("Black",4));
        balls.add(new Balls("White",15));
        balls.add(new Balls("Blue",10));
        balls.add(new Balls("White",20));
        List<Balls> heavyBalls = filterBalls(balls,new BallsWeightPredicate());
        System.out.println(heavyBalls);

        System.out.println("================");
        List<Balls> whiteBalls = filterBalls(balls,new BallsColorPredicate());
        System.out.println(whiteBalls);

        System.out.println("////////With Lambda//////////");
        List<Balls> heavyBalls2 = filterBalls(balls,(ball)->ball.getWeight()>10);
        System.out.println(heavyBalls2);
    }

    static List<Balls> filterBalls(List<Balls> balls,BallsPredicate ballsPredicate){
        List<Balls> result = new ArrayList<>();
        for (Balls ball : balls) {
            if (ballsPredicate.test(ball)) result.add(ball);
        }
        return result;
    }
}
