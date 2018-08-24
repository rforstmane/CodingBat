public class icuHot {
//    https://codingbat.com/prob/p192082
    public static boolean icy(int temp1, int temp2){
        if ((temp1 < 0 || temp1 >100) && (temp2 < 0 || temp2 > 100 )){
            return true;
        }else{
            return false;
        }
    }
    public static void doAll(){
        System.out.println(icy(120, -1));
        System.out.println(icy(-1, 120));
        System.out.println(icy(2, 120));
    }
}
