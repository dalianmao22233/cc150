public class Q5_2{
    public static void main(String[] args)
    {
        String a = "sddddaaassss";
        String b = "shiyumee";
        String c = "shhhyyyyu";
        System.out.println(compress(c));
        System.out.println(compress(b));
    
    }
    public static String compress(String str)
    {
        int size = countCompression(str);
        if(size >= str.length())
        {
            return str;
        }

        StringBuffer mystr = new StringBuffer();
        char last = str.charAt(0);
        int count = 1;
        for(int i = 1; i<str.length(); i++)
        {
            if(str.charAt(i) == last)
            {
                count++;
            }
            else
            {
                mystr.append(last);
                mystr.append(count);
                last = str.charAt(i);
                count = 1;
            
            }
        }
        mystr.append(last);
        mystr.append(count);
        return mystr.toString();
    }
    static int countCompression(String str)
    {
        if(str == null || str.isEmpty())
            return 0;
        
        char last = str.charAt(0);
        int size = 0;
        int count = 1;
        for(int i = 1; i<str.length(); i++)
        {
            if(str.charAt(i) == last)
                count++;
            else
            {
                last = str.charAt(i);
                size += 1+String.valueOf(count).length();
                count = 1;
            }

        }
        size += 1+String.valueOf(count).length();
        return size;
    }

}
