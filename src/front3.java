public class front3 {
//    https://codingbat.com/prob/p136351
    public static String front(String str){
        if (str.length() <= 3) {
            return str;
        } else {
            return str.substring(0,3)+ str.substring(0,3) + str.substring(0,3);
        }
    }

    public static void doAll(){
        System.out.println(front("Java"));
        System.out.println(front("Chocolate"));
        System.out.println(front("abc"));
    }
}
