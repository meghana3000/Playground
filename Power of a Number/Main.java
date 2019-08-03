#include <stdio.h>
#include<math.h>
int main()
{
  	//Your code here     
  int base, exp, power;
  scanf("%d %d",&base,&exp);
  if(exp >= 0){
    power = pow(base, exp);  
    printf("%d",power);
  }
  else{
    printf("Wrong input");
  }
  
    return 0;
}