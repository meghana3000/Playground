#include<stdio.h>

int gcd(int a, int b){
  if(b == 0)
    return a;
  return gcd(b, a % b);
}
int main()
{
  //Type your code here
  int n1, n2;
  scanf("%d %d", &n1, &n2);
  int prod = n1 * n2;
  printf("%d", prod / gcd(n1, n2));
  return 0;
}