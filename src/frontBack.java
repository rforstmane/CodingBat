public class frontBack {
    //https://codingbat.com/prob/p123384

    public static String front(String str){
        if (str.length() <= 1) return str;

        String mid = str.substring(1,str.length()-1);

        return str.charAt(str.length()-1)+ mid + str.charAt(0);


    }

    public static void doAll(){
        System.out.println(front("code"));
        System.out.println(front("a"));
        System.out.println(front("nature"));
        System.out.println(front("java"));
    }
}
