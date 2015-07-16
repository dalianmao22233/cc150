public class Q4
{
    public static void main(String[] args)
    {
        //String str = "Shi Yuxin is a xxxxx. ";
        //char[] content = str.toCharArray();
        char[] content = {'a', ' ', 'b'};
        System.out.println("content: "+content.length);
        replaceSpaces(content, content.length);
    }
    public static void replaceSpaces(char[] str, int length)
    {
        int spaceCount = 0, newLength = 0, i = 0;
        for(i=0;i<length;i++)
        {
            if(str[i] == ' ')
            {
                spaceCount++;

            }
        }
        newLength = length + spaceCount*2;
        System.out.println("spaceCount: "+ spaceCount);
        char[] str_1 = new char[newLength];
        str_1[newLength-1] = '\0';
        for(i = length -1; i >=0; i--)
        {
            if(str[i] == ' ')
            {
                str_1[newLength - 1] = '0';
                str_1[newLength - 2] = '2';
                str_1[newLength - 3] = '%';
                newLength = newLength - 3;
 
            }
            else
            {
                str_1[newLength - 1] = str[i];
                newLength = newLength - 1;
            }
        }
        System.out.println(str_1);
    }
}
