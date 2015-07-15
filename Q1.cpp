#include <string>
#include <iostream>
using namespace std;
int is_unique(char *str)
{
    int len = strlen(str);
    int i,j;
    for(i = 0;i<len-1;i++)
    {
        for(j = i+1;j<len;j++)
        {
            if(str[i] == str[j])
            {
                cout<<"not unique"<<endl;
                return 0;
            }
        }
    }
    cout<<"unique"<<endl;
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
