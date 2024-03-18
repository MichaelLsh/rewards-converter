public class RewardValue {
    private double cash; //

    private int miles; //

    private final static double CONVERSION_RATE = 0.035;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = (int) (cash / CONVERSION_RATE);
    }

    public RewardValue(int miles) {
        this.miles = miles;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return miles;
    }

}
