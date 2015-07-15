#include <string>
#include <iostream>
using namespace std;
int is_unique_str2(char* str)
{
    int flags[8]; //只需要8个32位的int，8*32=256位
    memset(flags,0,sizeof(flags));
    int i;
    int len = strlen(str);
    for(i = 0;i<len;i++)
    {
        int index = (int)str[i]/32;
        int shift = (int)str[i]%32;
        if(flags[index] & (1<<shift))
            return 0;
        flags[index] |= (1<<shift);
    }
    return 1;
}
int main()
{
 //   using namespace std;
    char str[] = "abcdefgh233242356";
    char str_1[] = "yuxin";
    cout<<is_unique_str2(str)<<endl;
    cout<<is_unique_str2(str_1)<<endl;
//    cout<<str<<endl;
    return 0;
}
