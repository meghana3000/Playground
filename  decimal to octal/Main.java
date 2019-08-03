#include<stdio.h>
int fn(int n){
  int ans=0,rem,c=0;
  while(n != 0){
    rem = n % 8;
    ans = ans + rem * pow(10,c);
    c++;
    n = n / 8;
  }
  return ans;
}
int main()
{
  //type your code here
  int n;
  scanf("%d",&n);
  printf("%d",fn(n));
  
  return 0;
}