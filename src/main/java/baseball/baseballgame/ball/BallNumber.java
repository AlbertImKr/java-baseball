package baseball.baseballgame.ball;

import java.util.Objects;

public class BallNumber {
    public static final int MIN_RANGE = 1;
    public static final int MAX_RANGE = 9;
    private int ballNumber;

    public BallNumber() {
        new BallNumber(RandomNumber.createFrom1To9());
    }


    BallNumber(int number) {
        validateRange(number);
        this.ballNumber = number;
    }

    private void validateRange(int number) {
        if (number < MIN_RANGE || number > MAX_RANGE) {
            throw new IllegalArgumentException("볼넘버는 " + MIN_RANGE + "이상" + MAX_RANGE + "이하의 숫자여야 합니다.");
        }
    }


    public static BallNumber createBallNumber(int number) {
        return new BallNumber(number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BallNumber)) {
            return false;
        }
        BallNumber that = (BallNumber) o;
        return ballNumber == that.ballNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballNumber);
    }
}
