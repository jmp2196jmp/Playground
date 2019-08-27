#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  if(n%4==0  || n%400==0)
    printf("Leap year\n");
 else
   printf("Not Leap year\n");
    
  return 0;
}