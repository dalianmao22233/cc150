public class Q1_2{
    public static void main(String[] args)
    {
        String a = "Abcccccc";
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
        int checker = 0;
        for(int i = 0; i< str.length(); i++)
        {
            int val = str.charAt(i) - 'a';
            System.out.println("val" + val);
            if((checker & (1 << val)) > 0)
            {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }
}
