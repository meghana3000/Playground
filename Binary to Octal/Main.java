#include<stdio.h>
int fn(int n);
int fn1(int n);
int fn(int n){
  int ans=0,c=0,rem;
  while(n != 0){
    rem = n % 10;
    ans = ans + rem * pow(2,c);
    c++;
    n = n / 10;
  }
  return ans;
}

int fn1(int n){
  int dec = fn(n);
  
  int ans=0,c=0,rem;
  while(dec != 0){
    rem = dec % 8;
    ans = ans + rem * pow(10,c);
    c++;
    dec = dec / 8;
  }
  return ans;
}
  
  

int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  printf("%d",fn1(n));
}