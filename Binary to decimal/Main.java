#include<stdio.h>
int fn(int n){
  int ans = 0,rem,c=0;
  
  while(n != 0){
    rem = n % 10;
    
    ans = ans + rem * pow(2,c);
    c++;
    n = n / 10;
  }
  return ans;
}
    
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  printf("%d",fn(n));
  return 0;
}