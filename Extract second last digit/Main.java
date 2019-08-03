#include<stdio.h>
int main()
{
  //Type your code 
  int num;
  scanf("%d",&num);
  printf("%d",((num%100)-(num%10))/10);
  return 0;
}

