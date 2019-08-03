#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int num,count=0,first,last,temp;
  scanf("%d",&num);
  int m=num;
   while(num!=0){
    count=count+1;
    num=num/10;
  } 
  first=m%10;
  temp=(pow(10,count-1));
  last=m/temp;
  printf("%d",first+last);
      
	return 0;
}