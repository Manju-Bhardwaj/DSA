public class str_copy {
    public static void main(String[] args) {
        StringBuffer s1= new StringBuffer("abcd");
        StringBuffer s2= new StringBuffer("efgh");
         s2=s1;
        System.out.println(s1);
        System.out.println(s2);

    }
}
