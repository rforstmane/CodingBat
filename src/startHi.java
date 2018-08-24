public class startHi {
//    https://codingbat.com/prob/p191022
    public static boolean front(String str){
        String[] parts = str.split(" ");
        if (parts[0].equals("hi")){
            return true;
        }else {
            return false;
        }
    }

    public static void doAll(){
        System.out.println(front("hi there"));
        System.out.println(front("hi"));
        System.out.println(front("hello hi"));
        System.out.println(front("hello hello"));
    }
}
