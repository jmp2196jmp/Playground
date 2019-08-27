#include<stdio.h>
int square(int n);
int main() {
  int a;
  scanf("%d",&a);
  printf("%d",square(a));
  return 0;
}
int square(int n)
{
  int s;
  s=n*n;
  return s;
}