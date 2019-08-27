#include<stdio.h>
int main()
{
  int n,n1;
  scanf("%d",&n);
  n1=n/10;
  n=n1%10;
  printf("%d",n);
  return 0;
}