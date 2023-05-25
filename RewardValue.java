
public class RewardValue {

	double cashValue;
	int miles;
	
	public RewardValue(double cash) {
		this.cashValue = cash;
		this.miles = (int) (cashValue / 0.0035);
	}
	
	public RewardValue(int miles) {
		this.miles = miles;
		this.cashValue = miles * 0.0035;
	}

	public double getCashValue() {
		return cashValue;
	}

	public void setCashValue(double cashValue) {
		this.cashValue = cashValue;
	}

	public int getMilesValue() {
		return miles;
	}

	public void setMilesValue(int miles) {
		this.miles = miles;
	}
	
	
}
	

