#include <stdio.h>
int factorial(int num);
int main() {
	//Type your code
  int number,dup,sum=0;
  scanf("%d",&number);
  dup=number;
  while(number!=0){
    sum=sum+factorial(number%10);
    
    number=number/10;
  }

  if(sum==dup)
    printf("Yes");
  else
    printf("No");
  
	return 0;
}
int factorial(int num){
  int fact=1;
  for(int i=1;i<=num;i++)
    fact=fact*i;
  return fact;
}