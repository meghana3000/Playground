#include<stdio.h>
int main()
{
  char a[100];
  scanf("%[^\n]s", a);
  int i=0;
  while(a[i] != '\0' || a[i+1] != '\0')
  {
    if(a[i] == 'A' || a[i] == 'E' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U' || a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u' ){
    }
    else{
      printf("%c",a[i]);
    }
    i++;
}
  
  
  
  //Type your code here
  
  return 0;
}