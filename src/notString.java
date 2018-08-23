public class notString {
//    https://codingbat.com/prob/p191914
    public static String not(String str){
        String[] parts = str.split(" ");
        if ((parts[0].equals("not"))){
            return str;
        }else{
            return "not " +str;
        }
    }

    public static void doAll(){
        System.out.println(not("candy"));
        System.out.println(not("x"));
        System.out.println(not("not bad"));
        System.out.println(not("hot day"));
    }
}
