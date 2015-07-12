//#include "stdafx.h"
//#include <stdio.h>
#include <string>
#include <iostream>
void reverse(char *str)
{
    char* start = str;
    char* end = start+strlen(str)-1;
    while(start<end)
    {
        char temp = *end;
        *end = *start;
        *start = temp;
        start++;
        end--;
    }
   
}
//void reverse(char*);
int main(){
    using namespace std;
    char str[] = "abcdefgh233242356";
  //  printf("str:",str);
 //   int size = strlen(str);
    reverse(str);
    //printf(str);

   // reverse(*a);
   cout<<str<<endl;
   return 0;
}

