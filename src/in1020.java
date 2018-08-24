public class in1020 {
//    https://codingbat.com/prob/p144535
    public static boolean in(int a, int b){
        if ((a >= 10 && a<=20) || (b >= 10 && b<=20)){
            return true;
        }else{
            return false;
        }
    }
    public static void doAll(){
        System.out.println(in(12,99));
        System.out.println(in(21,12));
        System.out.println(in(8,99));
    }
}
