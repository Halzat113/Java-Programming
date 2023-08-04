package behaviourParameterization;

import java.awt.*;

public class BallsColorPredicate implements BallsPredicate{
    @Override
    public boolean test(Balls balls) {
        return balls.getColor().equalsIgnoreCase("White");
    }

}
