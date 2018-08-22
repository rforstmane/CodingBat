public class SleepIn {

    private static boolean sleepIn(boolean isWeekday, boolean isVacation) {
        if (!isWeekday || isVacation) {
            return true;
        } else {
            return false;
        }

    }

    public static void doAll() {
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
        System.out.println(sleepIn(true, true));
    }


}


