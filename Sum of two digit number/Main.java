#include<stdio.h>
int main()
{
  int n,s,n1,n2;
  scanf("%d",&n);
  n1=n/10;
  n2=n%10;
  s=n1+n2;
  printf("%d",s);
  return 0;
}