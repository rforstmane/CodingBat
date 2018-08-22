public class monkey {

    private static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == bSmile){ //((aSmile && bSmile) ||(!aSmile && !bSmile))
            return true;
        } else {
            return false;
        }

    }

    public static void doAll() {
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));
        System.out.println(monkeyTrouble(false, true));
        System.out.println(monkeyTrouble(true, true));
    }
}
