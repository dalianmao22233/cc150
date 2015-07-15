public class Q3
{
    public static void main(String[] args)
    {
        String a = "shiyuxin";
        String b = "nxuyihs";
        String c = "1234";
        System.out.println(permutation(a,b));
        System.out.println(permutation(b,c));
        System.out.println(permutation(a,c));
//        check(a,b);
//        check(b,c);
//        check(a,c);
    }
    public static String sort(String s)
    {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
    public static boolean permutation(String s, String t)
    {
        if(s.length() != t.length())
        {
            return false;
        }
        return sort(s).equals(sort(t));
    }
   // void check(String str1,String str2)
   // {
   //     if(str1.length == str2.length)
   //     {
   //         System.out.println("is permutation!!");   
   //     }
   //     else 
   //     {
   //         System.out.println("The two strings are not permutation!!!");
   //         return false;
   //     }
   // }    
}
