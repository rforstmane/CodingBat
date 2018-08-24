public class front22 {
//    https://codingbat.com/prob/p183592
    public static String front(String str){
        return str.substring(0,2) + str + str.substring(0,2);
    }

    public static void doAll(){
        System.out.println(front("kitten"));
        System.out.println(front("Ha"));
        System.out.println(front("abc"));
    }
}
