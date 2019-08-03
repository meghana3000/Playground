#include <stdio.h>

int main()
{ 
    // type your code here
  int a,b,c;
  scanf("%d,%d,%d",&a ,&b ,&c);
  if(a>b && a>c)
    printf("%d",a);
  else if(b>a && b>c)
    printf("%d",b);
  else
    printf("%d",c);
}