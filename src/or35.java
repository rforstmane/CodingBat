public class or35 {
//    https://codingbat.com/prob/p112564
    public static boolean or(int n){
        if (n % 5 == 0 || n % 3==0){
            return true;
        }else{
            return false;
        }
    }

    public static void doAll(){
        System.out.println(or(3));
        System.out.println(or(10));
        System.out.println(or(15));
        System.out.println(or(8));
    }
}
