package src.app;


import java.util.Scanner;

public class Main {

    private static final double difKmToMl = 1.60934;

    public static void main(String[] args) {
        System.out.println("This app will help you to convert kilometers to miles and vice versa (miles to kilimeters).");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, input distance in miles: ");
        double mls = scanner.nextDouble();
        System.out.println("The distance " + mls + " miles in kilometers will be " + convMlsToKms(mls));

        System.out.print("Please, input distance in kilometers: ");
        double kms = scanner.nextDouble();
        System.out.println("The distance " + kms + " kilometers in miles will be " + convKmsToMls(kms));
    }

    private static double convMlsToKms(double mls) {
        return mls * difKmToMl;
    }

    private static double convKmsToMls(double kms) {
        return kms / difKmToMl;
    }

}
