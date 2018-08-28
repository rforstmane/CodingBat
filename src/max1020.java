public class max1020 {
//    https://codingbat.com/prob/p177372
    public static int max(int a, int b){
        if (a>b && (a>=10 && a<=20)){
            return a;
        }
        if (a<b && (b>=10 && b<=20)){
            return b;
        }else{
            return 0;
        }
    }

    public static void doAll(){
        System.out.println(max(11, 19));
        System.out.println(max(19, 11));
        System.out.println(max(11, 9));
        System.out.println(max(8, 9));
    }

}
