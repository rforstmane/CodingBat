public class  nearHundred {
//   https://codingbat.com/prob/p184004
    public static boolean near(int n){
        if (Math.abs(100 - n)<=10 || Math.abs(200 - n)<=10) {
            return true;
        }else {
            return false;
        }
    }

    public static void doAll(){
        System.out.println(near(93));
        System.out.println(near(90));
        System.out.println(near(89));
        System.out.println(near(101));
        System.out.println(near(111));
    }
}
