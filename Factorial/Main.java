#include<stdio.h>
long int fact(int n){
  if(n == 1 || n == 0)
    return 1;
  else
    return n * fact(n-1);
}
int main()
{
	//your code here
  int n;
  scanf("%d",&n);
  printf("%ld", fact(n));
  //return 0;
}