public class diff21 {

    public static int diff(int n){

        if (n<=21){

            return 21 - n;
        }else {
            return (n-21) * 2;
        }
    }

    public static void doAll(){
        System.out.println(diff(19));
        System.out.println(diff(0));
        System.out.println(diff(23));
        System.out.println(diff(5));
    }
}
