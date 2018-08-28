public class in3050 {
//    https://codingbat.com/prob/p132134
    public static boolean in(int a, int b){
        if((a>=30 && a<=40) && (b>=30 && b<=40) || (a>=40 && a<=50) && (b>=40 && b<=50)){
            return true;
        }else {
            return false;
        }
    }

    public static void doAll(){
        System.out.println(in(30,31));
        System.out.println(in(30,41));
        System.out.println(in(40,50));
    }
}
