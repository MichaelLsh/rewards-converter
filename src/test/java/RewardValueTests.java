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
        double cashVal = 2345;
        var rewardValue = new RewardValue(cashVal);
        assertEquals(670000, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesVal = 670000;
        var rewardValue = new RewardValue((double) milesVal * 0.0035);
        assertEquals(2345.0, rewardValue.getCashValue());
    }
}
