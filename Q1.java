public class Q1{
    public static void main(String[] args)
    {
        String a = "abcccccc";
        String b = "abcdefghi";
        //System.out.println("a"+test(a));
        boolean flag_a = false;
        boolean flag_b = false;
        flag_a = test(a);
        flag_b = test(b);
        if(!flag_a)
        {
            System.out.println("a has same char");
        }
        else 
            System.out.println("a is unique");
        if(!flag_b)
        {
            System.out.println("b has same char");
        }
        else
            System.out.println("b is unique");
    }
    public static boolean test(String str)
    {
        if(str.length()>256)
            return false;
        boolean[] char_set = new boolean[256];
        for(int i = 0; i< str.length(); i++)
        {
            int val = str.charAt(i);
            if(char_set[val])
            {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}
