public class RewardValue {
    private double cash;
    private Double miles;

    public RewardValue(double cash){
        this.cash = cash;
        this.miles = cash * 0.0035;
    }
    public RewardValue(Double miles){
        this.cash = miles/0.0035;
        this.miles = miles;
    }
    public double getCashValue(){
        return cash;
    }

    public Double getMilesValue(){
        return miles;
    }
}
