public class Mars {
    public static void main(String[] args) {
        String colonyName = "Wall-E";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        meals = meals - ((shipPopulation * 0.75) * 2);
        System.out.println(meals);
        meals = meals + (meals * .5);
        shipPopulation = shipPopulation + 5;

        String landingLocation = "The Ocean";
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on The Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on The Plain");
        }

        landing = landingCheck(250);

        new MarsExpedition();

        new FindingsList();
    };

    public static boolean landingCheck(int minutesLeft) {
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if (((minute % 3) == 0) && ((minute % 2) == 0)) {
                System.out.println("Keep Center");
            } else if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}