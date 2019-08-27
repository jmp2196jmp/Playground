#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  if(n>0 && n<=5)
  {
    if(n==1)
      printf("One\n");
    else if(n==2)
      printf("Two\n");
    else if(n==3)
      printf("Three\n");
   else if(n==4)
      printf("Four\n");
    else
      printf("Five\n");
  }
  else
    printf("Invalid\n");
  return 0;
}