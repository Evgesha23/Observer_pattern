package market.market;

public class MyInfo {
    private String typeOfMetal;
    private int amountOfMetal;
    private double costForOne;

    public String getTypeOfMetal() {
        return typeOfMetal;
    }
    public int getAmountOfMetal() {
        return amountOfMetal;
    }
    public double getCostForOne() {
        return costForOne;
    }

    public void setTypeOfMetal(String typeOfMetal) {
        this.typeOfMetal = typeOfMetal;
    }
    public void setAmountOfMetal(int amountOfMetal) {
        this.amountOfMetal = amountOfMetal;
    }
    public void setCostForOne(double costForOne) {
        this.costForOne = costForOne;
    }

    @Override
    public String toString() {
        return typeOfMetal + " | " + amountOfMetal + " | " + costForOne + "\n";}

}
