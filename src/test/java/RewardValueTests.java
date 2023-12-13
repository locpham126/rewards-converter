import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double expected = 7;
        int cashValue = 2000;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(expected, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        double expected = 2000;
        Double mileValue = 7.0;
        var rewardValue = new RewardValue(mileValue);
        assertEquals(expected, rewardValue.getCashValue());
    }
}
