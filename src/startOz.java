public class startOz {
//    https://codingbat.com/prob/p199720
    public static String start(String str){
        String result = "";
        if (str.charAt(0)=='o'){
            result = result + str.charAt(0);
        }
        if (str.charAt(1)=='z'){
            result = result + str.charAt(1);
        }
        return result;
    }

    public static void doAll(){
        System.out.println(start("ozymandias"));
        System.out.println(start("bzoo"));
        System.out.println(start("oxx"));
        System.out.println(start("ozomono"));
    }
}
