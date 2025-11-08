//cafe super class. Stores cafe name, location
//cafe has a loyalty program, composition. Without a cafe, LP does not exist
public class Cafe {
    private LoyaltyProgram loyaltyProgram;
    private String cafeName;
    private String cafeLocation;

    public Cafe(String cafeName, String cafeLocation, LoyaltyProgram loyaltyProgram) {
        if (cafeName.equals("")) {
            throw new IllegalArgumentException("The name of the cafe is missing");
        }
        if (cafeLocation.equals("")) {
            throw new IllegalArgumentException("The cafe location is missing");
        }
        this.cafeName = cafeName;
        this.cafeLocation = cafeLocation;
        this.loyaltyProgram = loyaltyProgram; //calling constructor of loyalty program
    }

    public String getCafeName() {
        return this.cafeName;
    }

    public String getCafeLocation() {
        return this.cafeLocation;
    }

    public LoyaltyProgram getLoyaltyProgram(){
        return this.loyaltyProgram;
    }

    public void setCafeName(String cafeName) {
        if (cafeName.equals("")) {
            throw new IllegalArgumentException("The name of the cafe is missing");
        }
        this.cafeName = cafeName;
    }

    public void setCafeLocation(String cafeLocation) {
        if (cafeLocation.equals("")) {
            throw new IllegalArgumentException("The cafe location is missing");
        }
        this.cafeLocation = cafeLocation;
    }

    public void setLoyaltyProgram(LoyaltyProgram loyaltyProgram){
        this.loyaltyProgram=loyaltyProgram;
    }

    @Override
    public String toString() {
        return "Cafe Name: " + this.getCafeName() + " | " + "Location: " + this.getCafeLocation(); // this.getLoyaltyProgram().toString()
    }
}