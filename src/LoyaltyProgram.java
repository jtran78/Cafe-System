//Loyalty program tracks points and rewards
public class LoyaltyProgram{
    private int points;
    private double rewards;

    //default constructor
    public LoyaltyProgram(){
        points = 0;
        rewards = 0;
    }
//fixed constructor
    public LoyaltyProgram(int points, double rewards) {
        this.points = points;
        this.rewards = rewards;
    }

    public int getPoints() {
        return points;
    }

    public double getRewards() {
        return rewards;
    }

    public void setPoints(int points) {
        if (points < 0) {
            throw new IllegalArgumentException("Points cannot be negative.");
        }
        this.points = points;
    }

    public void setRewards(double rewards) {
        if (rewards < 0) {
            throw new IllegalArgumentException("Rewards cannot be negative.");
        }
        this.rewards = rewards;
    }
 
    //add points moved here
    public void addLoyaltyPoints(int points) { 
        if (points < 0) {
            throw new IllegalArgumentException("Points cannot be negative.");
        }
        this.points += points;
    }
    //calculates the rewards and returns the calculated price.
    public double calculateRewards(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.points += (int) (price * 5);
        this.rewards += price;
        return price * 5;
    }

    @Override
    public String toString() {
        return "\n Customer Information:" + "Loyalty Program [Points: " + points + ", Rewards: $" + rewards + "]";
    }
}