public class close10 {
//    https://codingbat.com/prob/p172021
    public static int close(int a, int b){
        if (Math.abs(10-a)< Math.abs(10-b)){
            return a;
        }else if (Math.abs(10-a)==Math.abs(10-b)){
            return 0;
        }else{
            return b;
        }
    }

    public static void doAll(){
        System.out.println(close(8,13));
        System.out.println(close(13,8));
        System.out.println(close(13,7));
    }

}
