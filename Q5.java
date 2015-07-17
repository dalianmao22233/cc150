public class Q5
{
    public static void main(String[] args)
    {
        String a = "sssssddddaaassss";
        String b = "shiyume";
        System.out.println(compress(a));
        System.out.println(compress(b));
    }
    public static String compress(String str)
    {
        String mystr = "";
        char last = str.charAt(0);
        int count = 1;
        for(int i = 1; i < str.length(); i++)
        {
            if(str.charAt(i) == last)
            {
                count++;
            }
            else
            {
                mystr += last + "" + count;
                last = str.charAt(i);
                count = 1;
            }
        }
        return mystr + last + count;

    }
}
