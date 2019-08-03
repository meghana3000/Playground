#include<stdio.h>
int main()
{
  //Type your code here
  int num,first,third;
  scanf("%d",&num);
  first=num/100;
  third=num%10;
  printf("%d",first+third);
  return 0;
}