public class hasTeen {
//    https://codingbat.com/prob/p178986
    public static boolean teen(int a, int b, int c){
        if ((a >=13 && a<=19) || (b >=13 && b<=19) || (c >=13 && c<=19)){
            return true;
        }else{
            return false;
        }
    }

    public static void doAll(){
        System.out.println(teen(13,20,10));
        System.out.println(teen(20,19,10));
        System.out.println(teen(20,10,13));
        System.out.println(teen(20,10,8));
    }
}
