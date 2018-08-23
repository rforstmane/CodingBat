public class missingChar {
    // https://codingbat.com/prob/p190570
    public static String missing(String str, int n){
        return str.substring(0,n) + str.substring(n+1);

    }

    public static void doAll(){
        System.out.println(missing("kitten", 1));
        System.out.println(missing("kitten", 0));
        System.out.println(missing("kitten", 4));
        System.out.println(missing("kitten", 5));
        System.out.println(missing("", 0));
        System.out.println(missing("a", 0));
}
}
