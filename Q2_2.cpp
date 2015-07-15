#include <string>
#include <iostream>

void reverse(char *str)
{
    char* end = str;
    char tmp;
    if(str)
    {
        while(*end)
            ++end;
    
    --end;
    while(str<end)
    {
        tmp = *str;
        *str++ = *end;
        *end-- = tmp;
    }
    }
}
void reverse(char*);
int main(){
    using namespace std;
    char str[] = "abcdefgh233242356";
    reverse(str);
   cout<<str<<endl;
   return 0;
}

