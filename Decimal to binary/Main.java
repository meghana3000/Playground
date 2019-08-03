#include<stdio.h>
int pr(int b,int n){
  int r=1;
  for(int i=0; i<n; i++){
    r = r * b;
  }
  return r;
}
int fn(int n){
  int ans=0,rem,c=0;
  while(n != 0){
    
    rem = n % 2;
    ans = ans + rem * pr(10,c);
    c++;
    n = n / 2;
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