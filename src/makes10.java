public class makes10 {
// https://codingbat.com/prob/p182873
    public static boolean make(int a, int b){
        if (a==10 || b == 10 || a + b == 10){
            return true;
        }else{
            return false;
        }
    }

    public static void doAll(){
        System.out.println(make(9,10));
        System.out.println(make(9,9));
        System.out.println(make(1,9));
    }
}
