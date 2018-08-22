public class parrotTrouble {
//    https://codingbat.com/prob/p140449
    public static boolean parrot(boolean talking, int hour){
        if (talking && (hour >= 0 && hour < 7 || hour > 20 && hour <= 23)){
            return true;
        }else {
            return false;
        }
    }

    public static void doAll(){
        System.out.println(parrot(true, 22));
        System.out.println(parrot(true, 7));
        System.out.println(parrot(false, 22));
        System.out.println(parrot(false, 6));
        System.out.println(parrot(false, 7));
    }
}
