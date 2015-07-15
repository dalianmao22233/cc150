public class Q3_2
{
    public static void main(String[] args)
    {
        String a = "shiyuxin";
        String b = "inxuyihs";
        String c = "1234";
        System.out.println(permutation(a,b));
        System.out.println(permutation(b,c));
        System.out.println(permutation(a,c));
    }
   public static boolean permutation(String s, String t)
    {
        if(s.length() != t.length())
        {
            return false;
        }
        int[] letters = new int[256];
        char[] s_array = s.toCharArray();
        for(char c: s_array)
        {
            letters[c]++;
            System.out.println("c: "+c+letters[c]);
        }
        for(int i = 0;i<t.length();i++)
        {
            int c = (int)t.charAt(i);
            System.out.println("c: "+c+" "+letters[c]);//number of characters in the string---> letters[c]
            if(--letters[c]<0)
            {
                return false;
            }
        }
        return true;
    }
}
