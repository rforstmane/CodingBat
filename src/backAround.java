public class backAround {
//    https://codingbat.com/prob/p161642
    public static String Around(String str){
        return str.substring(str.length()-1) + str + str.substring(str.length()-1);
    }

    public static void doAll(){
        System.out.println(Around("cat"));
        System.out.println(Around("Hello"));
        System.out.println(Around("a"));
    }
}
