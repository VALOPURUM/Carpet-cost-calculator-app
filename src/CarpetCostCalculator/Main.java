package CarpetCostCalculator;


public class Main {
    public static void main(String[] args){
        Floor johnFloor = new Floor(3.6, 3.6);
        Carpet blueCaroet = new Carpet(1500.0);
        Calculator calculator = new Calculator(johnFloor, blueCaroet);
        System.out.println(calculator.getTotalCost());
    }

}
