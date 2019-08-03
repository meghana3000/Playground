#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float a,b,hyp;
  scanf("%f %f",&a,&b);
  hyp = sqrt(pow(a,2) + pow(b,2));
  printf("%.2f",hyp);
  return 0;
}