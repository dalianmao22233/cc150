#include <string>
#include <iostream>
using namespace std;
int is_unique(char* str)
{
    int flags[256];
    int i;
    memset(flags, 0, 256);
    for(i=0;i<strlen(str);i++)
    {
        if(flags[str[i]] == 1)
            return 0;
        flags[str[i]] = 1;
    }
    return 1;
}
int main()
{
 //   using namespace std;
    char str[] = "abcdefgh233242356";
    char str_1[] = "yuxin";
    cout<<is_unique(str)<<endl;
    cout<<is_unique(str_1)<<endl;
//    cout<<str<<endl;
    return 0;
}
