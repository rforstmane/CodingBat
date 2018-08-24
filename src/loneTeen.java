public class loneTeen {
//    https://codingbat.com/prob/p165701
    public static boolean lone(int a, int b){
        boolean aTeen = (a>=13 && a<=19);
        boolean bTeen = (b>=13 && b<=19);
        if ( (aTeen && !bTeen) || (!aTeen && bTeen)){
            return true;
        }else{
            return false;
        }
    }
    public static void doAll(){
        System.out.println(lone(13,99));
        System.out.println(lone(21,19));
        System.out.println(lone(13,13));
    }
}
