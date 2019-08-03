#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int num,count=0,digit,temp,ans,m;
  
  scanf("%d",&num);
  m=num;
  while(num>0){
    count=count+1;
    num=num/10;
  } 
  temp=pow(10,count-2);
  ans=m/temp;
  digit=ans%10;
 
  printf("%d",digit);
	return 0;
}