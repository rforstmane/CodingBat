public class SumDouble {

    public static int Sum(int a, int b){
        if (a == b){
            return 2*(a+b);
        }else{
            return a+b;
        }
    }

    public static void doAll(){

        System.out.println(Sum(1, 2));
        System.out.println(Sum(3, 2));
        System.out.println(Sum(2, 2));
    }
}
