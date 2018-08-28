public class intMax {
//    https://codingbat.com/prob/p101887
    public static int intM(int a, int b, int c){
        int max;
        if (a>b){
            max = a;
        }else {
            max = b;
        }
        if (c>max){
            max = c;
        }
        return max;
    }

    public static void doAll(){
        System.out.println(intM(1,2,3));
        System.out.println(intM(1,3,2));
        System.out.println(intM(3,2,1));
    }
}
