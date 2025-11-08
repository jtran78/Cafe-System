//collects customer info: name, num, email, points
//customers use a loyalty program. both exist independently
public class Customer {
    private Order order; //association
    private LoyaltyProgram loyaltyProgram; //association
    private int custNum;
    private String custEmail;
    private String custName;

   //constructor adjusted to extend loyalty program
    public Customer(int custNum, String custEmail, String custName, Order order, LoyaltyProgram loyaltyProgram) {
        this.order=order; //passes order in constructor everytime a customer is made
        this.loyaltyProgram=loyaltyProgram; //passes loyalty program in cosntructor everytime we make a customer object
        this.custNum = custNum;
        this.custEmail = custEmail;
        this.custName = custName;
       // this.loyaltyPoints = 0; //? 
    }

    public int getCustNum() {
        return this.custNum;
    }

    public String getCustEmail() {
        return this.custEmail;
    }

    public String getCustName() {
        return this.custName;
    }

    //new association
    public Order getOrder(){ 
        return this.order;
    }
    //new aggregation 
    public LoyaltyProgram getLoyaltyProgram(){
        return this.loyaltyProgram;
    }

    public void setCustNum(int custNum) {
        if (custNum < 0) {
            throw new IllegalArgumentException("Please provide a valid customer number");
        }
        this.custNum = custNum;
    }

    public void setCustEmail(String custEmail) {
        if (custEmail.equals("")) {
            throw new IllegalArgumentException("Please provide your email");
        }
        this.custEmail = custEmail;
    }

    public void setCustName(String custName) {
        if (custName.equals("")) {
            throw new IllegalArgumentException("Please provide your name");
        }
        this.custName = custName;
    }
    //new set order --> association
    public void setOrder(Order order) {
        this.order=order;
        }
    //new aggregation
    public void setLoyaltyProgram(LoyaltyProgram loyaltyProgram){
        this.loyaltyProgram=loyaltyProgram;
    }
    @Override
    public String toString() {
        return " | " + "Customer Number: " + this.getCustNum() + " | "+ "Email: " + this.getCustEmail() + " | " + "Name: " + this.getCustName() + " | " + this.getOrder().toString() ; //this.getLoyaltyProgram().toString()
    }
}