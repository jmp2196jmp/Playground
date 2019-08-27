#include<stdio.h>
int natural(int n);
int main() {
    int s;
  scanf("%d",&s);
  printf("%d",natural(s));
  	return 0;
}
int natural(int n)
{
  int sum=0,i;
  for(i=1;i<=n;i++)
  {
    sum=sum+i;
  }
  return sum;
}