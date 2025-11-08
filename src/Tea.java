//Type of menu item, stores sugar level and temp
public class Tea extends MenuItems {
    private String temp;
    private String sugarLevel;

    public Tea(String itemName, int itemNum, double price, String temp, String sugarLevel) {
        super(itemName, itemNum, price);
        this.temp = temp;
        this.sugarLevel = sugarLevel;
    }

    public String getSugarLevel() { 
        return sugarLevel; 
    }

    public String getTemp() { 
        return temp; 
    }

    public void setTemp(String temp) {
        if (temp.equals("")) {
            throw new IllegalArgumentException("How hot do you want your tea?");
        }
        this.temp = temp;
    }

    public void setSugarLevel(String sugarLevel) {
        if (sugarLevel.equals("")) {
            throw new IllegalArgumentException("How sweet do you want your tea to be?");
        }
        this.sugarLevel = sugarLevel;
    }

    @Override
    public String toString() {
        return super.toString() + " | Sugar Level: " + this.getSugarLevel() + " | Temp: " + this.getTemp();
    }
}