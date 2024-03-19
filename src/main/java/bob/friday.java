package bob;

public class friday {

    public static double calculatePriceAfterDiscount(double price, double discountAmount) {
        double discountPercentage = discountAmount / 100;

        double discountAmt = discountPercentage * price;

        double finalPrice = price - discountAmt;

        return finalPrice;
    }
    public static void main(String[] args) {

       double reslut = calculatePriceAfterDiscount(100.00, 10.0); // 80
        System.out.println(reslut);


    }





}
