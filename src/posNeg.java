public class posNeg {
//    https://codingbat.com/prob/p159227
    public static boolean pos(int a, int b, boolean negative){
        if (((a >= 0 && b < 0) || (a < 0 && b >= 0)) || (negative == true && b<0 && a<0)){
            return true;
        }else {
            return false;
        }
    }

    public static void doAll(){
        System.out.println(pos(1, -1, false));
        System.out.println(pos(-1, 1, false));
        System.out.println(pos(-4, -5, false));
        System.out.println(pos(-4, -5, true));
    }
}
