package behaviourParameterization;

public class BallsWeightPredicate implements BallsPredicate{
    @Override
    public boolean test(Balls balls) {
        return balls.getWeight()>10;
    }
}
