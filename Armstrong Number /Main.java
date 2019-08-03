

#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int n,m,digits=0,arm=0,temp,number;
  scanf("%d",&n);
  m=n;
  number=n;
  while(m!=0){
    digits=digits+1;
    m=m/10;
  }
  while(n!=0){ 
    temp=n%10;
    arm=arm+pow(temp,digits);
      n=n/10;
  }
  if(number==arm)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}