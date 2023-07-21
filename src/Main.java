import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create pricing options
        NormalPrice normalPriceDomestic = new NormalPrice(1647, 1447, 1247, 500);
        PeakPrice peakPriceDomestic = new PeakPrice(2447, 2247, 2047, 500);

        NormalPrice normalPriceOverseas = new NormalPrice(4297, 4097, 3897, 500);
        PeakPrice peakPriceOverseas = new PeakPrice(5097, 4897, 4697, 500);

        // Create an ArrayList to store tours
        ArrayList<Tour> tours = new ArrayList<>();

        // Create and add DomesticTour to the ArrayList
        DomesticTour domesticTour = new DomesticTour(3, true, false, normalPriceDomestic, peakPriceDomestic, "Sabar");
        tours.add(domesticTour);

        // Create and add OverseasTour to the ArrayList
        OverseasTour overseasTour = new OverseasTour(6, true, true, normalPriceOverseas, peakPriceOverseas, "Korea", "Seoul");
        tours.add(overseasTour);

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------Welcome to Travel Agency System--------");
        System.out.println("What would you like to do?");
        System.out.println("1.Add Tour");
        System.out.println("2.Update Tour");
        System.out.println("3.View Tour");
        System.out.println("0.Exit");
        System.out.print("Enter your choice number: ");

        int choice;

        choice = scanner.nextInt();

        while (choice != 0){

            //Add tour
            if(choice == 1){
                System.out.println("\nWhat is the Type of Tour?");
                System.out.println("1.Domestic");
                System.out.println("2.Overseas");
                System.out.print("Enter the the type number: ");
                int choice1 = scanner.nextInt();

                //Add domestic tour
                if(choice1 == 1){
                        System.out.println("----------Enter details for Domestic Tour----------");
                        System.out.print("Duration (in days): ");
                        int duration = scanner.nextInt();

                        System.out.print("Is it a private tour? (true/false): ");
                        boolean isPrivate = scanner.nextBoolean();

                        System.out.print("Is it a honeymoon tour? (true/false): ");
                        boolean isHoneymoon = scanner.nextBoolean();

                        System.out.print("Enter state for the tour: ");
                        String state = scanner.next();

                        System.out.println("----------Enter Normal Price----------");
                        System.out.print("Adult: ");
                        double adultPrice = scanner.nextDouble();
                        System.out.print("Child With Extra Bed: ");
                        double childWithExtraBedPrice = scanner.nextDouble();
                        System.out.print("Child With No Extra Bed: ");
                        double childWithNoExtraBedPrice = scanner.nextDouble();
                        System.out.print("Infant: ");
                        double infantPrice = scanner.nextDouble();

                        NormalPrice normalPrice = new NormalPrice(adultPrice, childWithExtraBedPrice, childWithNoExtraBedPrice, infantPrice);

                        System.out.println("----------Enter Peak Price----------");
                        System.out.print("Adult: ");
                        double adultPrice1 = scanner.nextDouble();
                        System.out.print("Child With Extra Bed: ");
                        double childWithExtraBedPrice1 = scanner.nextDouble();
                        System.out.print("Child With No Extra Bed: ");
                        double childWithNoExtraBedPrice1 = scanner.nextDouble();
                        System.out.print("Infant: ");
                        double infantPrice1 = scanner.nextDouble();

                        PeakPrice peakPrice = new PeakPrice(adultPrice1, childWithExtraBedPrice1, childWithNoExtraBedPrice1, infantPrice1);

                        DomesticTour domesticTour1 = new DomesticTour(duration, isPrivate, isHoneymoon, normalPrice, peakPrice, state);
                        tours.add(domesticTour1);

                        System.out.println("\nThe tour is successfully added");
                        
                //Add overseas tour
                }else if (choice1 == 2){
                    System.out.println("----------Enter details for Overseas Tour----------");
                    System.out.print("Duration (in days): ");
                    int duration = scanner.nextInt();

                    System.out.print("Is it a private tour? (true/false): ");
                    boolean isPrivate = scanner.nextBoolean();

                    System.out.print("Is it a joined tour? (true/false): ");
                    boolean isJoined = scanner.nextBoolean();

                    scanner.nextLine(); // Clear the newline character from previous input

                    System.out.print("Enter country for the tour: ");
                    String country = scanner.nextLine();

                    System.out.print("Enter state for the tour: ");
                    String state = scanner.nextLine();

                    System.out.println("----------Enter Normal Price----------");
                    System.out.print("Adult: ");
                    double adultPrice = scanner.nextDouble();
                    System.out.print("Child With Extra Bed: ");
                    double childWithExtraBedPrice = scanner.nextDouble();
                    System.out.print("Child With No Extra Bed: ");
                    double childWithNoExtraBedPrice = scanner.nextDouble();
                    System.out.print("Infant: ");
                    double infantPrice = scanner.nextDouble();

                    NormalPrice normalPrice = new NormalPrice(adultPrice, childWithExtraBedPrice, childWithNoExtraBedPrice, infantPrice);

                    System.out.println("----------Enter Peak Price----------");
                    System.out.print("Adult: ");
                    double adultPrice1 = scanner.nextDouble();
                    System.out.print("Child With Extra Bed: ");
                    double childWithExtraBedPrice1 = scanner.nextDouble();
                    System.out.print("Child With No Extra Bed: ");
                    double childWithNoExtraBedPrice1 = scanner.nextDouble();
                    System.out.print("Infant: ");
                    double infantPrice1 = scanner.nextDouble();

                    PeakPrice peakPrice = new PeakPrice(adultPrice1, childWithExtraBedPrice1, childWithNoExtraBedPrice1, infantPrice1);

                    OverseasTour overseasTour1 = new OverseasTour(duration, isPrivate, isJoined, normalPrice, peakPrice,country,state);
                    tours.add(overseasTour1);

                    System.out.println("\nThe tour is successfully added");

                } else{
                    System.out.println("\nInvalid number. No tour is added.");
                }

            //Update Tour
            }else if(choice == 2){
                for (int i = 0; i < tours.size(); i++) {
                    System.out.println("Tour Details - Tour " + (i + 1) + ":");
                    System.out.println(tours.get(i));
                    System.out.println();
                }

                System.out.print("Enter the tour number you want to update: ");
                int tourNumber = scanner.nextInt();
                System.out.println("----------Enter the Updated Details----------");

                // Check if the tour number is valid
                if (tourNumber >= 1 && tourNumber <= tours.size()) {
                    Tour selectedTour = tours.get(tourNumber - 1);

                    // Update domestic tour
                    if (selectedTour instanceof DomesticTour) {
                        DomesticTour domestic = (DomesticTour) selectedTour;
                        System.out.print("Enter updated duration (in days): ");
                        int duration = scanner.nextInt();
                        domestic.setDurationInDays(duration);

                        System.out.print("Is it a private tour? (true/false): ");
                        boolean isPrivate = scanner.nextBoolean();
                        domestic.setPrivateTour(isPrivate);

                        System.out.print("Is it a honeymoon tour? (true/false): ");
                        boolean isHoneymoon = scanner.nextBoolean();
                        domestic.setHoneymoonTour(isHoneymoon);

                        System.out.print("Enter state for the tour: ");
                        String state = scanner.next();
                        domestic.setState(state);

                        System.out.println("----------Enter Updated Normal Price----------");
                        System.out.print("Adult: ");
                        double adultPrice = scanner.nextDouble();
                        domestic.getNormalPrice().setAdultPrice(adultPrice);

                        System.out.print("Child With Extra Bed: ");
                        double childWithExtraBedPrice = scanner.nextDouble();
                        domestic.getNormalPrice().setChildWithExtraBedPrice(childWithExtraBedPrice);

                        System.out.print("Child With No Extra Bed: ");
                        double childWithNoExtraBedPrice = scanner.nextDouble();
                        domestic.getNormalPrice().setChildWithNoExtraBedPrice(childWithNoExtraBedPrice);

                        System.out.print("Infant: ");
                        double infantPrice = scanner.nextDouble();
                        domestic.getNormalPrice().setInfantPrice(infantPrice);

                        System.out.println("----------Enter Updated Peak Price----------");
                        System.out.print("Adult: ");
                        double adultPrice1 = scanner.nextDouble();
                        domestic.getPeakPrice().setAdultPrice(adultPrice1);

                        System.out.print("Child With Extra Bed: ");
                        double childWithExtraBedPrice1 = scanner.nextDouble();
                        domestic.getPeakPrice().setChildWithExtraBedPrice(childWithExtraBedPrice1);

                        System.out.print("Child With No Extra Bed: ");
                        double childWithNoExtraBedPrice1 = scanner.nextDouble();
                        domestic.getPeakPrice().setChildWithNoExtraBedPrice(childWithNoExtraBedPrice1);

                        System.out.print("Infant: ");
                        double infantPrice1 = scanner.nextDouble();
                        domestic.getPeakPrice().setInfantPrice(infantPrice1);

                        System.out.println("\nThe tour is successfully updated");

                    //Update overseas tour
                    }else if (selectedTour instanceof OverseasTour){
                        OverseasTour overseas = (OverseasTour) selectedTour;
                        System.out.print("Enter updated duration (in days): ");
                        int duration = scanner.nextInt();
                        overseas.setDurationInDays(duration);

                        System.out.print("Is it a private tour? (true/false): ");
                        boolean isPrivate = scanner.nextBoolean();
                        overseas.setPrivateTour(isPrivate);

                        System.out.print("Is it a honeymoon tour? (true/false): ");
                        boolean isJoined = scanner.nextBoolean();
                        overseas.setJoinedTour(isJoined);

                        scanner.nextLine(); // Clear the newline character from previous input

                        System.out.print("Enter country for the tour: ");
                        String country = scanner.nextLine();
                        overseas.setCountry(country);

                        System.out.print("Enter state for the tour: ");
                        String state = scanner.nextLine();
                        overseas.setState(state);

                        System.out.println("----------Enter Updated Normal Price----------");
                        System.out.print("Adult: ");
                        double adultPrice = scanner.nextDouble();
                        overseas.getNormalPrice().setAdultPrice(adultPrice);

                        System.out.print("Child With Extra Bed: ");
                        double childWithExtraBedPrice = scanner.nextDouble();
                        overseas.getNormalPrice().setChildWithExtraBedPrice(childWithExtraBedPrice);

                        System.out.print("Child With No Extra Bed: ");
                        double childWithNoExtraBedPrice = scanner.nextDouble();
                        overseas.getNormalPrice().setChildWithNoExtraBedPrice(childWithNoExtraBedPrice);

                        System.out.print("Infant: ");
                        double infantPrice = scanner.nextDouble();
                        overseas.getNormalPrice().setInfantPrice(infantPrice);

                        System.out.println("----------Enter Updated Peak Price----------");
                        System.out.print("Adult: ");
                        double adultPrice1 = scanner.nextDouble();
                        overseas.getPeakPrice().setAdultPrice(adultPrice1);

                        System.out.print("Child With Extra Bed: ");
                        double childWithExtraBedPrice1 = scanner.nextDouble();
                        overseas.getPeakPrice().setChildWithExtraBedPrice(childWithExtraBedPrice1);

                        System.out.print("Child With No Extra Bed: ");
                        double childWithNoExtraBedPrice1 = scanner.nextDouble();
                        overseas.getPeakPrice().setChildWithNoExtraBedPrice(childWithNoExtraBedPrice1);

                        System.out.print("Infant: ");
                        double infantPrice1 = scanner.nextDouble();
                        overseas.getPeakPrice().setInfantPrice(infantPrice1);

                        System.out.println("\nThe tour is successfully updated");

                    }
                }else {
                    System.out.println("\nInvalid tour number. No updates made.");
                }


            //View all tour
            }else if (choice == 3) {
                // Print details of all tours in the ArrayList
                for (Tour tour : tours) {
                    System.out.println("Tour Details:");
                    System.out.println(tour);
                }

            //Exit
            }else if(choice == 0){
                System.exit(0);

            }else{
                System.out.println("Please enter a valid number!");
            }

            System.out.println("\nWhat would you like to do?");
            System.out.println("1.Add Tour");
            System.out.println("2.Update Tour");
            System.out.println("3.View Tour");
            System.out.println("0.Exit");
            System.out.print("Enter your choice number: ");

            choice = scanner.nextInt();

        }
    }
}
